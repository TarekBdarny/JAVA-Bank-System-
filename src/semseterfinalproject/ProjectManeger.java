/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semseterfinalproject;

/**
 *
 * @author PC
 */
public class ProjectManeger {

    /**
     * @param args the command line arguments
     */
    public static boolean convertStringToInt(String s){
        if(s.length() >2)return false;
        if(s.charAt(0) > '9' || s.charAt(1) > '9')
            return false;
        return true;
            
   
}
    public static void main(String[] args) {
      
       LogInWindow win = new LogInWindow();
       win.setVisible(true);
       
    }
    
}
