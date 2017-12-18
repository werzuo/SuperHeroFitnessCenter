/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.view;

import com.werzuo.shfcms.controller.ItemController;
import com.werzuo.shfcms.controllerfactoryimpl.ControllerFactoryImpl;
import com.werzuo.shfcms.dbconnection.DBConnection;
import com.werzuo.shfcms.model.Item;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author robin
 */
public class ReportInventory extends javax.swing.JPanel {

    /**
     * Creates new form ReportInventory
     */
    public ReportInventory() {
        initComponents();
        loadToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemReport = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        tblItemReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name ", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItemReport);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 60, 750, 420);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 227, 117));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inventry Report");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 300, 50);

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setText("Print List");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        add(btnPrint);
        btnPrint.setBounds(630, 500, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/panelBody.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/Untitled-1.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 227, 117), 2));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        sendDataToReport();
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItemReport;
    // End of variables declaration//GEN-END:variables
    /**
     * This method fills the data to the report of this panel
     *
     * @robin
     */
    public void loadToTable() {
        try {
            ItemController itemController = new ControllerFactoryImpl().getItemController();
            ArrayList<Item> allItems = itemController.getAllItems();

            DefaultTableModel dtm = (DefaultTableModel) tblItemReport.getModel();
            dtm.setRowCount(0);
            for (Item ai : allItems) {
                if (ai != null) {
                    Object[] rows = {ai.getItemId(), ai.getItemName(), ai.getItemQty()};
                    dtm.addRow(rows);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportInventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sendDataToReport() {
        try {
            Connection conn = DBConnection.getDBConnection().getConnection();
            InputStream is = getClass().getResourceAsStream("../report/InventryPieChart.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(is); 
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<String, Object>(), conn);
            JasperViewer jv = new JasperViewer(jp, false);
            JasperDialog pd = new JasperDialog(null, true);
            pd.setBounds(345, 135, 960, 560);
            pd.setContentPane(jv.getContentPane());
            pd.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ReportInventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportInventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(ReportInventory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
