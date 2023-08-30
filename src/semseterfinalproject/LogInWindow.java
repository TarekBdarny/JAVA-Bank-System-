/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semseterfinalproject;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class LogInWindow extends javax.swing.JFrame {

    /**
     * Creates new form SignUpWindow
     */
    public LogInWindow() {
        initComponents();
    }
    public static boolean stringHasNumbers(String st)
    {
        for(int i =0 ; i<st.length();i++)
            if(st.charAt(i) < 'A' || st.charAt(i) >'z')
                return false;
        return true;
    }
    static String fullName;
    static String userAccountNumber;
    static String userCardNumber;
    static String cardPinCode;
    static String cardExpDate;
    static double currentBalance;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        cardNumberInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        accountInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        expDateInput = new javax.swing.JTextField();
        card = new javax.swing.JLabel();
        pinCodeInput = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Enter card number: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Log In Window");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Enter first name:");

        firstNameInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameInputActionPerformed(evt);
            }
        });

        lastNameInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cardNumberInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Enter account number:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Enter last name:");

        accountInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Enter pin code");

        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create new account?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Enter expire date");

        expDateInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        expDateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expDateInputActionPerformed(evt);
            }
        });

        card.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        card.setText("Enter card number:");

        pinCodeInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pinCodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinCodeInputActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-info-50.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cardNumberInput, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lastNameInput)
                        .addComponent(firstNameInput)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(expDateInput)
                        .addComponent(pinCodeInput)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(accountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputActionPerformed
    public static boolean theStringOnlyFromNumber(String st)
    {
        for(int i =0 ; i<st.length();i++) if(st.charAt(i) >'9') return false;
        return true;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameInput.getText();
        String lastName = lastNameInput.getText();
        String accountNumber = accountInput.getText();
        String temp = accountNumber;

        String cardNumber = cardNumberInput.getText();
        String pinCode = new String(pinCodeInput.getPassword());
        String expDate = expDateInput.getText();
        if(firstName.equals(""))
            JOptionPane.showMessageDialog(this,
                    "first name should'nt be empty"
                    , "first name Error", HEIGHT);
       else if(lastName.equals(""))
            JOptionPane.showMessageDialog(this,
                    "last name should'nt be empty"
                    , "last name Error", HEIGHT);
        else if(!stringHasNumbers(firstName))
            JOptionPane.showMessageDialog(this,
                    "first name should'nt contain numbers"
                    , "first name Error", HEIGHT);
       else if(!stringHasNumbers(lastName))
            JOptionPane.showMessageDialog(this,
                    "last name should'nt contain numbers"
                    , "last name Error", JOptionPane.ERROR_MESSAGE);
       else if(accountNumber.length() > 13 || accountNumber.length() <13)
                JOptionPane.showMessageDialog(this,
                    "account number show be 13 chars"
                    , "last name Error", JOptionPane.ERROR_MESSAGE);
       else if(!temp.substring(0,4 ).equals("111-"))
           JOptionPane.showMessageDialog(this,
                    "account number should start with '111-'"
                    , "account number bank number Error", JOptionPane.ERROR_MESSAGE);
       else if(!temp.substring(10).equals("/69"))
           JOptionPane.showMessageDialog(this,
                    "account number should end with '/69'"
                    , "account number prefix Error", JOptionPane.ERROR_MESSAGE);
       else if(!theStringOnlyFromNumber(accountNumber.substring(5, 11)))
            JOptionPane.showMessageDialog(this,
                    "account number between prefix should'nt inculde chars!"
                    , "account number Error", JOptionPane.ERROR_MESSAGE);
       else if(cardNumber.length() != 19)
           JOptionPane.showMessageDialog(this,
                    "Card number should be 19 chars only!"
                    , "Card number Error", JOptionPane.ERROR_MESSAGE);
       else if(cardNumber.charAt(4) != '-' ||cardNumber.charAt(9) != '-' || cardNumber.charAt(14) != '-' )
           JOptionPane.showMessageDialog(this,
                    "Card number should include 3 '-' after each four numbers!"
                    , "Card number Error", JOptionPane.ERROR_MESSAGE);
       else if(!theStringOnlyFromNumber(cardNumber.substring(0, 4)) || 
               !theStringOnlyFromNumber(cardNumber.substring(4, 9)) || 
               !theStringOnlyFromNumber(cardNumber.substring(9, 14))||
               !theStringOnlyFromNumber(cardNumber.substring(15)))
       JOptionPane.showMessageDialog(this,
                    "Card number only includes numbers between eavry '-' only!"
                    , "Card number Error", JOptionPane.ERROR_MESSAGE);
           
       else if(pinCode.length() >3 || pinCode.length() <3)
            JOptionPane.showMessageDialog(this,
                    "pin code must be 3 chars!"
                    , "pin code Error", JOptionPane.ERROR_MESSAGE);
       else if(!theStringOnlyFromNumber(pinCode))
           JOptionPane.showMessageDialog(this,
                    "pin code should'nt include "
                    , "pin code Error", JOptionPane.ERROR_MESSAGE);
       else if(expDate.length() >5 || expDate.length() <5)
           JOptionPane.showMessageDialog(this,
                    "expire date must be length of 5"
                    , "expire date Error", JOptionPane.ERROR_MESSAGE);
       else if(expDate.charAt(2) != '/')
           JOptionPane.showMessageDialog(this,
                    "expire date must be towNumber prefix and tow numbers like '11/11'"
                    , "account number Error", JOptionPane.ERROR_MESSAGE);
       else{
           SQLHelper helper = new SQLHelper();
           if(helper.login(firstName , lastName , accountNumber,cardNumber , pinCode , expDate))
           {
               JOptionPane.showMessageDialog(this,
                    "Log In successfully!"
                    , "Log In successfully!", JOptionPane.INFORMATION_MESSAGE);
               fullName = firstName + " " + lastName;
              userAccountNumber = accountNumber;
              userCardNumber = cardNumber;
              cardPinCode = pinCode;
              cardExpDate = expDate;
              currentBalance = helper.getCurrentBlanace(cardNumber, pinCode);
              MainWindow win = new MainWindow();
              win.setVisible(true);
               this.setVisible(false);
              
              
              
           }
           else{
              JOptionPane.showMessageDialog(this,
                    "Please check for the correct information abount all the inputs"
                    , "Wrong Information", JOptionPane.INFORMATION_MESSAGE); 
           }
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void expDateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expDateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expDateInputActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        SignUpWindow win = new SignUpWindow();
        win.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pinCodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinCodeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinCodeInputActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
                "1) first name and last name cant be empty and not inclueds numbers. \n"
                      +"2) account number the first three letter should be '111-', "
                      + "after that should be your account number, then the prefix '/69'.\n"
                      + "3) card number should be 16 numbers every four numbers seperated by '-'"
                        + "and no letter in the the card number.\n"
                        + "4) pin code should be 3 numbers no letters make sure its the correct code. \n"
                        + "5) expire date should be a mount after that a '/' then the year. "
                , "Keep in mind!"
                , HEIGHT);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountInput;
    private javax.swing.JLabel card;
    private javax.swing.JTextField cardNumberInput;
    private javax.swing.JTextField expDateInput;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JPasswordField pinCodeInput;
    // End of variables declaration//GEN-END:variables
}
