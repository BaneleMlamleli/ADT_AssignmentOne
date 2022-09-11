/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DatabaseConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Banele
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public LoginForm() {
        initComponents();
        lblBackButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeftSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblMinimiseForm1 = new javax.swing.JLabel();
        lblBackButton = new javax.swing.JLabel();
        lblCloseForm = new javax.swing.JLabel();
        pnlRightSide = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblRegisterNewUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbTitle = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        pnlRegister = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbRegisterTitle = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        pwdRegisterPassword = new javax.swing.JPasswordField();
        txtSurname = new javax.swing.JTextField();
        pwdConfirmPassword = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        lblRegisterUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlLeftSide.setBackground(new java.awt.Color(51, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/lock.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("BM-JV");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurant");

        javax.swing.GroupLayout pnlLeftSideLayout = new javax.swing.GroupLayout(pnlLeftSide);
        pnlLeftSide.setLayout(pnlLeftSideLayout);
        pnlLeftSideLayout.setHorizontalGroup(
            pnlLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftSideLayout.createSequentialGroup()
                .addGroup(pnlLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLeftSideLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLeftSideLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlLeftSideLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlLeftSideLayout.setVerticalGroup(
            pnlLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftSideLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(156, 156, 156))
        );

        getContentPane().add(pnlLeftSide);
        pnlLeftSide.setBounds(0, 0, 390, 602);

        lblMinimiseForm1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblMinimiseForm1.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimiseForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimiseForm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/minus.png"))); // NOI18N
        lblMinimiseForm1.setToolTipText("Minimise window");
        lblMinimiseForm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimiseForm1MouseClicked(evt);
            }
        });
        getContentPane().add(lblMinimiseForm1);
        lblMinimiseForm1.setBounds(730, 0, 30, 40);

        lblBackButton.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblBackButton.setForeground(new java.awt.Color(255, 255, 255));
        lblBackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/left.png"))); // NOI18N
        lblBackButton.setToolTipText("Go back to login screen");
        lblBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackButtonMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackButton);
        lblBackButton.setBounds(690, 0, 24, 40);

        lblCloseForm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseForm.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/x-button.png"))); // NOI18N
        lblCloseForm.setToolTipText("Terminate program");
        lblCloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseFormMouseClicked(evt);
            }
        });
        getContentPane().add(lblCloseForm);
        lblCloseForm.setBounds(770, 0, 24, 40);

        pnlRightSide.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("LOGIN PAGE");

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 102, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegisterNewUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegisterNewUser.setForeground(new java.awt.Color(255, 0, 51));
        lblRegisterNewUser.setText("Register as new user");
        lblRegisterNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterNewUserMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Title");

        cmbTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Chef", "Waiter", "Bus boy" }));

        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Password");

        pwdPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(cmbTitle, 0, 342, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(lblRegisterNewUser)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(cmbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegisterNewUser)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pnlRightSide.add(pnlLogin, "card2");

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Surname");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("REGISTRATION PAGE");

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 255));
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Title");

        cmbRegisterTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Chef", "Waiter", "Bus boy" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 255));
        jLabel14.setText("Password");

        pwdRegisterPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdRegisterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdRegisterPasswordActionPerformed(evt);
            }
        });

        txtSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pwdConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdConfirmPasswordActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 255));
        jLabel16.setText("Confirm Password");

        lblRegisterUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegisterUsername.setForeground(new java.awt.Color(255, 0, 0));
        lblRegisterUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegisterUsername.setToolTipText("");
        lblRegisterUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRegisterUsername.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Username");

        javax.swing.GroupLayout pnlRegisterLayout = new javax.swing.GroupLayout(pnlRegister);
        pnlRegister.setLayout(pnlRegisterLayout);
        pnlRegisterLayout.setHorizontalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterLayout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(71, 71, 71))
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdConfirmPassword)
                            .addComponent(jLabel16)
                            .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(txtName)
                            .addComponent(cmbRegisterTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwdRegisterPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSurname)
                            .addComponent(lblRegisterUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegisterLayout.setVerticalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(3, 3, 3)
                .addComponent(cmbRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pnlRightSide.add(pnlRegister, "card2");

        getContentPane().add(pnlRightSide);
        pnlRightSide.setBounds(390, 50, 410, 550);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackButtonMouseClicked
        // Minise the window
        pnlLogin.setVisible(true);
        pnlRegister.setVisible(false);
        lblBackButton.setVisible(false);
    }//GEN-LAST:event_lblBackButtonMouseClicked

    private void lblCloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseFormMouseClicked
        // Close or terminate program
        System.exit(0);
    }//GEN-LAST:event_lblCloseFormMouseClicked

    private void pwdPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Register a new user into the database
        String title = (String)cmbTitle.getSelectedItem();
        String username = txtUsername.getText();
        String password = pwdPassword.getText();       

        if(!username.trim().equals("")){
            if(password.length() != 0){
                // Calling method to verify the entered user details
                if(DatabaseConnection.verifyUser(username, password, title)){
                    this.dispose();
                    new Restaurant(username, title).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect login details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Password field is empty", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Username field is empty", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        String title = (String)cmbRegisterTitle.getSelectedItem();
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String password = pwdRegisterPassword.getText();
        String confirmPassword = pwdConfirmPassword.getText();
        if (!name.trim().equals("")) {
            if (!surname.trim().equals("")) {
                if (password.length() != 0) {
                    if (confirmPassword.length() != 0) {
                        // confirming password match
                        if (password.equals(confirmPassword)) {
                            // confirm if the entered details are correct
                            int confirmOption = JOptionPane.showConfirmDialog(rootPane,
                                    "DETIALS CORRECT?\n============\nTitle: "+title+"\nName: "+name+"\nSurname: "+surname+"\nPassword: "+
                                            password+"\nConfirm password: "+confirmPassword, "Confirm details", JOptionPane.YES_NO_OPTION);
                            if (confirmOption == 0) {
                                String username = name + surname + DatabaseConnection.howManyUsers();
                                DatabaseConnection.registerUser(name, surname, title, username, confirmPassword);
                                lblRegisterUsername.setText(username);
                                JOptionPane.showMessageDialog(null, name + " has been registered successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password mismatch", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "confirm password field is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "password field is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "surname field is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "name field is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void pwdRegisterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdRegisterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdRegisterPasswordActionPerformed

    private void lblRegisterNewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterNewUserMouseClicked
        // Open the registration form
        pnlLogin.setVisible(false);
        pnlRegister.setVisible(true);
        lblBackButton.setVisible(true);
    }//GEN-LAST:event_lblRegisterNewUserMouseClicked

    private void lblMinimiseForm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimiseForm1MouseClicked
        // Minimise code
        this.setState(LoginForm.ICONIFIED);
    }//GEN-LAST:event_lblMinimiseForm1MouseClicked

    private void pwdConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdConfirmPasswordActionPerformed

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
//            "javax.swing.plaf.metal.MetalLookAndFeel"
//            "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
//            "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
//            "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"
//            "javax.swing.plaf.metal.MetalLookAndFeel"
//            "com.sun.java.swing.plaf.nimbus.NimbusLokkAndFeel"
//            "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
//            "com.seaglasslookandfeel.SeaGlassLookAndFeel"
//            
//            "com.birosoft.liquid.LiquidLookAndFeel"

//            String className = "com.alee.laf.WebLookAndFeel";
//            UIManager.setLookAndFeel(className);
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // executing the database connection method
                DatabaseConnection.connection();
                new LoginForm().setVisible(true);
                System.out.println("Amount of users: "+ DatabaseConnection.howManyUsers());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbRegisterTitle;
    private javax.swing.JComboBox<String> cmbTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBackButton;
    private javax.swing.JLabel lblCloseForm;
    private javax.swing.JLabel lblMinimiseForm1;
    private javax.swing.JLabel lblRegisterNewUser;
    private javax.swing.JLabel lblRegisterUsername;
    private javax.swing.JPanel pnlLeftSide;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPanel pnlRightSide;
    private javax.swing.JPasswordField pwdConfirmPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JPasswordField pwdRegisterPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
