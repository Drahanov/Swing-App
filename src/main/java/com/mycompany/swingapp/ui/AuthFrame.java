/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.swingapp.ui;

import com.mycompany.swingapp.data.LoginResult;
import com.mycompany.swingapp.data.PositionsRepository;
import com.mycompany.swingapp.models.EmployeeEntity;
import com.mycompany.swingapp.models.PositionEntity;
import com.mycompany.swingapp.data.Connect;
import com.mycompany.swingapp.data.AuthRepository;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Dialog;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.util.Random;

/**
 *
 * @author vadym
 */
public class AuthFrame extends javax.swing.JFrame {

    private final Connect query = new Connect();
    private final AuthRepository authRepository;
    private final PositionsRepository positionsRepository;

    private ArrayList<PositionEntity> positions;

    public AuthFrame() {
        initComponents();
        authRepository = new AuthRepository(query);
        positionsRepository = new PositionsRepository(query);
        initRegisterPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        registerInputsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registerNameTextField = new javax.swing.JTextField();
        registerPasswordField = new javax.swing.JPasswordField();
        confirmRegisterButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        goToLoginButton = new javax.swing.JLabel();
        positionsComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputsPanel = new javax.swing.JPanel();
        confirmLoginButton = new javax.swing.JButton();
        loginPasswordField = new javax.swing.JPasswordField();
        loginNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rememberMeCheckBox = new javax.swing.JCheckBox();
        goToRegisterButton = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));

        registerInputsPanel.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Kailasa", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Do not have an account?");

        jLabel6.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register right now!");

        registerNameTextField.setText("Vadym Drahanov");
        registerNameTextField.setToolTipText("Enter login name");
        registerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNameTextFieldActionPerformed(evt);
            }
        });

        registerPasswordField.setText("jPasswordField1");
        registerPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPasswordFieldActionPerformed(evt);
            }
        });

        confirmRegisterButton.setText("Register me now");
        confirmRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmRegisterButtonActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Apple Braille", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Type your name");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Apple Braille", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Type your password");

        goToLoginButton.setFont(new java.awt.Font("Apple Braille", 1, 12)); // NOI18N
        goToLoginButton.setForeground(new java.awt.Color(204, 204, 255));
        goToLoginButton.setText("Already have an account?");
        goToLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goToLoginButtonMousePressed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Apple Braille", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Select your position");

        javax.swing.GroupLayout registerInputsPanelLayout = new javax.swing.GroupLayout(registerInputsPanel);
        registerInputsPanel.setLayout(registerInputsPanelLayout);
        registerInputsPanelLayout.setHorizontalGroup(
            registerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerInputsPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(registerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(registerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(registerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(positionsComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(goToLoginButton)
                        .addComponent(confirmRegisterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        registerInputsPanelLayout.setVerticalGroup(
            registerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerInputsPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/vadym/Documents/CourseProjects/Semester5/SwingApp/src/main/java/com/mycompany/swingapp/image_for_register.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerInputsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerInputsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setPreferredSize(new java.awt.Dimension(1031, 476));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/vadym/Documents/CourseProjects/Semester5/SwingApp/src/main/java/com/mycompany/swingapp/image.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        inputsPanel.setBackground(new java.awt.Color(102, 102, 255));

        confirmLoginButton.setText("Confirm");
        confirmLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmLoginButtonActionPerformed(evt);
            }
        });

        loginPasswordField.setText("jPasswordField1");

        loginNameTextField.setText("Vadym Drahanov");
        loginNameTextField.setToolTipText("Enter login name");

        jLabel1.setFont(new java.awt.Font("Kailasa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello, welcome back!");

        jLabel3.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("What are you thinking today?");

        rememberMeCheckBox.setFont(new java.awt.Font("Apple Braille", 1, 12)); // NOI18N
        rememberMeCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        rememberMeCheckBox.setText("Remember me");

        goToRegisterButton.setFont(new java.awt.Font("Apple Braille", 1, 12)); // NOI18N
        goToRegisterButton.setForeground(new java.awt.Color(204, 204, 255));
        goToRegisterButton.setText("Do not have an account?");
        goToRegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goToRegisterButtonMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Apple Braille", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Type your name");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Apple Braille", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Type your password");

        javax.swing.GroupLayout inputsPanelLayout = new javax.swing.GroupLayout(inputsPanel);
        inputsPanel.setLayout(inputsPanelLayout);
        inputsPanelLayout.setHorizontalGroup(
            inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(inputsPanelLayout.createSequentialGroup()
                            .addComponent(goToRegisterButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rememberMeCheckBox))
                        .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(loginPasswordField)
                                .addComponent(confirmLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        inputsPanelLayout.setVerticalGroup(
            inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberMeCheckBox)
                    .addComponent(goToRegisterButton))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addComponent(inputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initRegisterPanel() {
        registerPanel.setVisible(false);

        positions = positionsRepository.getAllPositions();

        for (int i = 0; i < positions.size(); i++) {
            positionsComboBox.addItem(positions.get(i).getPositionName());
        }
    }

    private void confirmLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLoginButtonActionPerformed

        LoginResult result = authRepository.loginUser(loginNameTextField.getText(), loginPasswordField.getText());

        switch (result) {
            case LOGIN_SUCCESSFUL -> {
                JOptionPane.showMessageDialog(this, "Great success.");
                EmployeeEntity user = authRepository.getUserModel(loginNameTextField.getText());
                doNavigation(user.getEmployeePosition());
            }
            case LOGIN_INVALID_DATA ->
                JOptionPane.showMessageDialog(this, "Invalid password or username.");
            default ->
                JOptionPane.showMessageDialog(this, "Ooops! Something went wrong, try again.");
        }
    }//GEN-LAST:event_confirmLoginButtonActionPerformed

    private void doNavigation(int position) {
        switch (position) {
            case PositionEntity.POSITION_ADMIN -> {
                JFrame chiefPanel = new AdminFrame();
                chiefPanel.setVisible(true);
                dispose();
            }
            case PositionEntity.POSITION_SEAMSTRESS -> {
                   
            }
        }
    }

    private void goToRegisterButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToRegisterButtonMousePressed
        loginPanel.setVisible(false);
        registerPanel.setVisible(true);
    }//GEN-LAST:event_goToRegisterButtonMousePressed

    private void goToLoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToLoginButtonMousePressed
        loginPanel.setVisible(true);
        registerPanel.setVisible(false);
    }//GEN-LAST:event_goToLoginButtonMousePressed

    private void confirmRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmRegisterButtonActionPerformed
        Random random = new Random();
        int randomId = random.nextInt();
        String positionId = PositionEntity.findIdByName(positionsComboBox.getSelectedItem().toString(), positions).getPositionId();

        authRepository.registerUser(new EmployeeEntity(randomId, registerNameTextField.getText(),
                registerPasswordField.getText(), Integer.parseInt(positionId)));
    }//GEN-LAST:event_confirmRegisterButtonActionPerformed

    private void registerPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordFieldActionPerformed

    private void registerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AuthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmLoginButton;
    private javax.swing.JButton confirmRegisterButton;
    private javax.swing.JLabel goToLoginButton;
    private javax.swing.JLabel goToRegisterButton;
    private javax.swing.JPanel inputsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField loginNameTextField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JComboBox<String> positionsComboBox;
    private javax.swing.JPanel registerInputsPanel;
    private javax.swing.JTextField registerNameTextField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JCheckBox rememberMeCheckBox;
    // End of variables declaration//GEN-END:variables

}
