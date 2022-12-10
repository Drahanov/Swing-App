/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.swingapp;

import com.mycompany.swingapp.ui.AuthFrame;

/**
 *
 * @author vadym
 */
public class SwingApp extends javax.swing.JFrame {

    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthFrame().setVisible(true);
            }
        });
    }
}
