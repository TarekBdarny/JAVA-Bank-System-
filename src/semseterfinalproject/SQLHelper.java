/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semseterfinalproject;

import java.sql.*;
import java.time.Year;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLHelper 
{
  Connection conn;
  String server = "jdbc:mysql://localhost:3307/finalProject";
  String user = "root";
  String pass = "root";

  
  public SQLHelper()
  {
      try {
          conn = DriverManager.getConnection(server, user, pass);
          System.out.println("Success !");
      } catch (SQLException ex) {
          System.out.println(ex);
      }
  }
  
 
  
  //this function works VV
  public boolean login(String firstName , String lastName , String accountNumber,
          String cardNumber,String pinCode , String expDate)
  {
      try {
          Statement s = conn.createStatement();
          ResultSet rs = s.
          executeQuery("select * from users where firstName='"+firstName+"'and lastName='"+lastName+"'"
                  + "and accountNumber='"+accountNumber+"' and cardNumber='"+cardNumber+"'and pinCode='"
                          + pinCode +"' and expDate ='"+expDate+"'");
          
          int count = 0;
          while(rs.next())
          {
              count++;
          }
          return count > 0;
      } catch (SQLException ex) {
          Logger.getLogger(SQLHelper.class.getName()).log(Level.SEVERE, null, ex);
      }
   return false;   
  }
//  
  // this function works VV
  public void signUp (String userName , 
          String firstName , String lastName , String password ,double age,
          String accountNumber , String cardNumber , String pinCode,String expDate)
  {
      //('Shit' , 'fuck' , 'fucking' , 'Fuck123#',"+20+")"
      try{
          Statement s = conn.createStatement();
            s.executeUpdate("insert into users"
                  + "(userName , firstName , lastName, password , age , currentAmount , cardNumber , expDate , pinCode ,accountNumber)"
                  + " values"
                  + "('"+userName+"','"+firstName+"','"+lastName+"','"+password+"',"+age+","+1000+",'"+cardNumber+"','"+expDate+"','"+pinCode+"','"+accountNumber+"'"+ ")");
            
                  
      }
      catch(SQLException ex)
      {
          Logger.getLogger(SQLHelper.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  public String getUserName (String userName , String pass){
      String fullName = "";
      try {
          Statement s = conn.createStatement();
          ResultSet rs = s.
          executeQuery("select * from users where userName='"+userName+"' and password='"+pass+"'");
          while(rs.next())
          {
              fullName = rs.getString("firstName");
              return fullName;
          }

      } catch (SQLException ex) {
          System.out.println(ex);
      }
      return "No.";
  }
  
  // VV
  public boolean findUser(String accountNumber , String cardNumber)
  {
      try {
          Statement s = conn.createStatement();
          ResultSet rs = s.
          executeQuery("select * from users where accountNumber='"+accountNumber+"' and cardNumber='"+cardNumber+"'");
          
          int count = 0;
          while(rs.next())
          {
              count++;
          }
          return count > 0;
      } catch (SQLException ex) {
          Logger.getLogger(SQLHelper.class.getName()).log(Level.SEVERE, null, ex);
      }
   return false;   
  }
  
  //    VV amount of mony to transfer               clientCard          clientAccount         myPinCode         myCardNumber
  public boolean transferAmout(double amount, String cardNumber , String accountNumber , String pinCode , String myCardNumber)
    { 
        if(!findUser(accountNumber ,cardNumber )) return false;
        // if the client that we want to send the money is have an account
        
        // gettieng how much I own to see if i can trnasfer money to another person
        double myAmount = 0;
        // 
        try {
            Statement s = conn.createStatement();
            ResultSet rs =s.executeQuery("select * from users where cardNumber='"+myCardNumber+"' and pinCode='"+pinCode+"'");
            int count =0;
            while(rs.next())
            {
                count++;
                myAmount = rs.getDouble("currentAmount");
                
            }
            if(amount > myAmount || count == 0) return false;
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        // remove the amount of money to transfer from my account
        try{
            PreparedStatement pst = conn.prepareStatement("update users set currentAmount="+(myAmount-amount)+
                    "where cardNumber='"+myCardNumber+"' and pinCode='"+pinCode+"'");
            pst.executeUpdate();
            pst.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    
               // getting how much the client has in theier bank account
             double clientAmount = 0;
           try 
           {
               int count =0;
            Statement s = conn.createStatement();
            ResultSet rs =s.executeQuery("select * from users where cardNumber='"+cardNumber+"' and accountNumber='"+accountNumber+"'");
            while(rs.next())
            {
                count++;
                clientAmount = rs.getDouble("currentAmount");
            }
            if(count == 0) return false;
            
               
           }
           
           catch (Exception e) {
               System.out.println(e);
        }
           
            // update the current amount that the client has in thire bank account
           try{

              PreparedStatement pst = 
                      conn.prepareStatement("UPDATE users SET  currentAmount ="
                      + (amount+clientAmount)+"where accountNumber= '"
                      +accountNumber+"' and cardNumber='"+cardNumber+"'");
              pst.executeUpdate();
              pst.close();

           }catch(Exception e) {
               System.out.println(e);
           }

      
                   
        
        return true;
    }
  
  public boolean depositMoney(double amount , String cardNumber , String pinCode)
{
    if(amount > 5000) return false;
            double currentAmount =0;

    try {
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from users where cardNumber='"+cardNumber+ "' and pinCode ='"+ pinCode+"'");
        int count=0;
        while(rs.next())
        {
            count++;
            currentAmount = rs.getDouble("currentAmount");
        }
        if(count==0) return false;
                
    } catch (Exception e) {
        System.out.println(e);
    }
    
    
    
    try {
        PreparedStatement pst = conn.prepareStatement("update users set currentAmount"
               + "="+(currentAmount+amount)+"where cardNumber='"+cardNumber+"' and pinCode='"+pinCode+"'"
       );
       pst.executeUpdate();
       pst.close();
    } catch (Exception e) {
        System.out.println(e);
    }

    return true;
}
  
 public boolean withdrawMoney(double amount , String cardNumber , String pinCode)
 {
      double myAmount =0;
      try{
          Statement s = conn.createStatement();
          ResultSet rs = s.executeQuery("select * from users where cardNumber='"+cardNumber+"'"
                  + "and pinCode ='"+pinCode+"'");
          int count =0;
          while(rs.next())
          {
              count++;
              myAmount = rs.getDouble("currentAmount");
          }
          if(count==0) return false;
      }
      catch(SQLException e)
      {
          System.out.println(e);
      }
      try{
          PreparedStatement p = conn.prepareStatement(
                  "update users set currentAmount="+(myAmount-amount)
          +"where cardNumber='" + cardNumber +"' and pinCode='"+pinCode+"'");
          p.executeUpdate();
          p.close();
      }
      catch(SQLException e)
      {
          System.out.println(e);
      }
      return true;
  }
  
  public double getCurrentBlanace(String cardNumber , String pinCode)
  {
      double myAmount = 0;
        // 
        try {
            Statement s = conn.createStatement();
            ResultSet rs =s.executeQuery("select * from users where cardNumber='"+cardNumber+"' and pinCode='"+pinCode+"'");
            int count =0;
            while(rs.next())
            {
                count++;
                myAmount = rs.getDouble("currentAmount");
                
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return myAmount;
  }
  // a 4 fucntion that return data to the user random
public static String generateCardNumber()
{
    Random rnd = new Random();
    String st = "";
        int count = 0;
        for (int i = 0; i <19 ; i++) {
            count++;
            if (count %5 ==0) {
                st += "-";
                count=0;
            }
            else
            st += rnd.nextInt(10);
        }
        return st;
}
public static String generateExpDate()
{
    Random rnd = new Random();
    String epxDate ="";
        int lastTwoDigitsFormCurrentDate =  ((Year.now().getValue())%100) +4;
        String expDate = "";
        int MonthDate = rnd.nextInt(13);
        return addingZeroToNumber(MonthDate) + "/" + lastTwoDigitsFormCurrentDate;
}
public  String generatePinCode()
    {
        Random rnd = new Random();
        String pinCode = "";
        for(int i =0 ; i<3 ; i++) pinCode+=rnd.nextInt(10);
        return pinCode;
    }
public String generateAccountNumber()
    {
        Random rnd = new Random();
        String accountNumber = "111-";
        for(int i =0 ; i < 6 ; i++) accountNumber += rnd.nextInt(10);
        accountNumber += "/69";
        return accountNumber;
        
    }


  
// a function that checks the String if can add the zero to it
public static String addingZeroToNumber(int number)
    {
        return (("0") + number).length() >2 ?"" +number : "0" + number;
    }
 
  
 
} // closing bracet for the main class