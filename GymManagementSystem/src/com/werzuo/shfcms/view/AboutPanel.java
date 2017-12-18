/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ravindu
 */
public class AboutPanel extends javax.swing.JPanel {

    /**
     * Creates new form AboutPanel
     */
    private HomeFrame homeFrame;

    public AboutPanel() {
        initComponents();
    }

    public AboutPanel(HomeFrame homeFrame) {
        initComponents();
        this.homeFrame = homeFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        jLabel5 = new javax.swing.JLabel();
        jXHyperlink2 = new org.jdesktop.swingx.JXHyperlink();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        lblModfyEventBt1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jXHyperlink1.setText("<html>https://www.facebook.com<br>/werzuosolutions</html>");
        jXHyperlink1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jXHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXHyperlink1ActionPerformed(evt);
            }
        });
        add(jXHyperlink1);
        jXHyperlink1.setBounds(430, 350, 290, 50);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);
        add(jLabel5);
        jLabel5.setBounds(430, 360, 350, 40);

        jXHyperlink2.setText("<html>https://www.facebook.com/werzuosolutions</html>");
        jXHyperlink2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jXHyperlink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXHyperlink2ActionPerformed(evt);
            }
        });
        add(jXHyperlink2);
        jXHyperlink2.setBounds(430, 390, 290, 50);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("jLabel5");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(400, 400, 370, 40);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/powered by.png"))); // NOI18N
        jLabel4.setOpaque(true);
        jScrollPane1.setViewportView(jLabel4);

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 120, 820, 360);

        lblModfyEventBt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblModfyEventBt1.setForeground(new java.awt.Color(255, 255, 255));
        lblModfyEventBt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModfyEventBt1.setText("Back");
        lblModfyEventBt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblModfyEventBt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModfyEventBt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblModfyEventBt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModfyEventBt1MouseExited(evt);
            }
        });
        add(lblModfyEventBt1);
        lblModfyEventBt1.setBounds(810, 500, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 227, 117));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("About Developer");
        add(jLabel3);
        jLabel3.setBounds(690, 10, 270, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/Untitled-1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 227, 117), 2));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 970, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/panelBody.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void lblModfyEventBt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModfyEventBt1MouseClicked
        SettingsPanel s = new SettingsPanel();
        homeFrame.panelBody.removeAll();
        s.setSize(homeFrame.panelBody.getSize());
        homeFrame.panelBody.add(s);
        homeFrame.panelBody.revalidate();
        homeFrame.panelBody.repaint();
    }//GEN-LAST:event_lblModfyEventBt1MouseClicked

    private void lblModfyEventBt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModfyEventBt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblModfyEventBt1MouseEntered

    private void lblModfyEventBt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModfyEventBt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblModfyEventBt1MouseExited

    private void jXHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink1ActionPerformed
       
        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/werzuosolutions"));
        } catch (IOException ex) {
            Logger.getLogger(AboutPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jXHyperlink1ActionPerformed

    private void jXHyperlink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXHyperlink2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink2;
    private javax.swing.JLabel lblModfyEventBt1;
    // End of variables declaration//GEN-END:variables
}
