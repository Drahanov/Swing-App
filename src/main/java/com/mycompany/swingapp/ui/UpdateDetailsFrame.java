/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.swingapp.ui;

import com.mycompany.swingapp.data.Connect;
import com.mycompany.swingapp.models.EmployeeEntity;
import com.mycompany.swingapp.models.InvoicesEntity;
import com.mycompany.swingapp.data.InvoicesRepository;
import com.mycompany.swingapp.data.ServicesRepository;
import com.mycompany.swingapp.ui.UpdateDetailsFrame;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ruzolda
 */
public class UpdateDetailsFrame extends javax.swing.JFrame {

    private ArrayList<InvoicesEntity> invoices;

    private InvoicesRepository invoicesRepository;
    private ServicesRepository servicesRepository;

    public UpdateDetailsFrame(ArrayList<InvoicesEntity> invoices, InvoicesRepository invoicesRepository, ServicesRepository servicesRepository) {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.invoices = invoices;
        this.invoicesRepository = invoicesRepository;
        this.servicesRepository = servicesRepository;

        if (invoices.isEmpty()) {
            jPanel1.setVisible(false);
        }
        for (int i = 0; i < invoices.size(); i++) {
            invoicesComboBox.addItem(invoices.get(i).getInvoiceId());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        invoicesComboBox = new javax.swing.JComboBox<>();
        invoiceIdLabel = new javax.swing.JLabel();
        serviceLabel = new javax.swing.JLabel();
        updateLabel2 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        serviceDataLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        statusDataLabel = new javax.swing.JLabel();
        nothingPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        invoicesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                invoicesComboBoxItemStateChanged(evt);
            }
        });
        invoicesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicesComboBoxActionPerformed(evt);
            }
        });

        invoiceIdLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        invoiceIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        invoiceIdLabel.setText("ID Invoice");

        serviceLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        serviceLabel.setForeground(new java.awt.Color(255, 255, 255));
        serviceLabel.setText("Service");

        updateLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        updateLabel2.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel2.setText("Update");

        statusLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Status");

        serviceDataLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        serviceDataLabel.setForeground(new java.awt.Color(255, 255, 255));
        serviceDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton1.setText(" Make this order comleted");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        statusDataLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        statusDataLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(invoiceIdLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(125, 125, 125)
                                    .addComponent(updateLabel2))
                                .addComponent(invoicesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(statusLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(statusDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(serviceLabel)
                                        .addGap(57, 57, 57)
                                        .addComponent(serviceDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(updateLabel2)
                .addGap(16, 16, 16)
                .addComponent(invoiceIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoicesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceLabel)
                    .addComponent(serviceDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(statusDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        nothingPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Ooops! Nothing found here!");

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/vadym/Documents/CourseProjects/Semester5/SwingApp/src/main/java/com/mycompany/swingapp/res/nothing_found_image.jpg")); // NOI18N

        jLabel2.setText("Seems like u do not have any orders");

        javax.swing.GroupLayout nothingPanelLayout = new javax.swing.GroupLayout(nothingPanel);
        nothingPanel.setLayout(nothingPanelLayout);
        nothingPanelLayout.setHorizontalGroup(
            nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nothingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nothingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nothingPanelLayout.createSequentialGroup()
                        .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(82, 82, 82))))
        );
        nothingPanelLayout.setVerticalGroup(
            nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nothingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(381, 381, 381))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(nothingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(nothingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoicesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_invoicesComboBoxItemStateChanged
        serviceDataLabel.setText(servicesRepository.getServiceNameById(invoices.get(invoicesComboBox.getSelectedIndex()).getServiceId()));
        statusDataLabel.setText(invoices.get(invoicesComboBox.getSelectedIndex()).getStatus());
    }//GEN-LAST:event_invoicesComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        if (jCheckBox1.isSelected())
//            invoicesReposiotory.updateInvoice(invoices.get(invoicesComboBox.getSelectedIndex()).getInvoiceId());
        invoicesRepository.updateInvoice(invoices.get(invoicesComboBox.getSelectedIndex()).getInvoiceId());
        JOptionPane.showMessageDialog(this, "Order marked as completed.");
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void invoicesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoicesComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel invoiceIdLabel;
    private javax.swing.JComboBox<String> invoicesComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel nothingPanel;
    private javax.swing.JLabel serviceDataLabel;
    private javax.swing.JLabel serviceLabel;
    private javax.swing.JLabel statusDataLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel updateLabel2;
    // End of variables declaration//GEN-END:variables
}
