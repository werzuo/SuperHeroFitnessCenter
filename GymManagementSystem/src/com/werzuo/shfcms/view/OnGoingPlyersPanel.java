/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.view;

import com.werzuo.shfcms.controller.AttendanceController;
import com.werzuo.shfcms.controller.ExerciseController;
import com.werzuo.shfcms.controller.MemberController;
import com.werzuo.shfcms.controller.ScheduleController;
import com.werzuo.shfcms.controller.ScheduleDetailsController;
import com.werzuo.shfcms.controllerfactoryimpl.ControllerFactoryImpl;
import com.werzuo.shfcms.model.Attendance;
import com.werzuo.shfcms.model.Exercise;
import com.werzuo.shfcms.model.Member;
import com.werzuo.shfcms.model.Schedule;
import com.werzuo.shfcms.model.ScheduleDetails;
import static com.werzuo.shfcms.view.HomeFrame.panelBody;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ravindu
 */
public class OnGoingPlyersPanel extends javax.swing.JPanel {

    /**
     * Creates new form OnGoingPlyersPanel
     */
    private HomeFrame homeFrame;
    private DefaultTableModel dtm;
    private DefaultTableModel dtm1;
    private ArrayList<Attendance> ongoingMembers;

    public OnGoingPlyersPanel() {
        initComponents();
        getOngoingMembers();
    }

    public OnGoingPlyersPanel(HomeFrame homeFrame) {
        initComponents();
        this.homeFrame = homeFrame;
        getOngoingMembers();
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
        ongoingTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);

        ongoingTable.setBackground(new Color(0,0,0,0));
        ongoingTable.setForeground(new java.awt.Color(255, 255, 255));
        ongoingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Membership Name", "Check-In Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ongoingTable.setOpaque(false);
        ongoingTable.setRowHeight(25);
        ongoingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ongoingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ongoingTable);
        if (ongoingTable.getColumnModel().getColumnCount() > 0) {
            ongoingTable.getColumnModel().getColumn(0).setMinWidth(100);
            ongoingTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            ongoingTable.getColumnModel().getColumn(0).setMaxWidth(100);
            ongoingTable.getColumnModel().getColumn(1).setResizable(false);
            ongoingTable.getColumnModel().getColumn(2).setMinWidth(110);
            ongoingTable.getColumnModel().getColumn(2).setPreferredWidth(110);
            ongoingTable.getColumnModel().getColumn(2).setMaxWidth(110);
        }
        ongoingTable.setOpaque(false);
        ((DefaultTableCellRenderer)ongoingTable.getDefaultRenderer(Object.class)).setOpaque(false);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 130, 470, 360);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jScrollPane2.setBackground(new Color(0,0,0,0));
        jScrollPane2.setOpaque(false);

        jTable2.setBackground(new Color(0,0,0,0));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Exercise", "Rep", "Set"
            }
        ));
        jTable2.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(40);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(40);
            jTable2.getColumnModel().getColumn(2).setMinWidth(40);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(40);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(570, 130, 350, 360);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Back");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(800, 520, 70, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 217, 127));
        jLabel6.setText("On Going Players");
        add(jLabel6);
        jLabel6.setBounds(20, 20, 250, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Name");
        add(jLabel4);
        jLabel4.setBounds(470, 50, 150, 30);

        txtMemberId.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberId.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMemberId.setOpaque(false);
        txtMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIdActionPerformed(evt);
            }
        });
        txtMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMemberIdKeyReleased(evt);
            }
        });
        add(txtMemberId);
        txtMemberId.setBounds(640, 50, 200, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/Untitled-1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 227, 117), 2));
        add(jLabel3);
        jLabel3.setBounds(0, 0, 970, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/panelBody.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIdActionPerformed

    }//GEN-LAST:event_txtMemberIdActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        DashBoardPanel d = new DashBoardPanel();
        panelBody.removeAll();
        d.setSize(panelBody.getSize());
        panelBody.add(d);
        panelBody.revalidate();
        panelBody.repaint();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtMemberIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIdKeyReleased
        try {
            searchMember();
        } catch (SQLException ex) {
            Logger.getLogger(OnGoingPlyersPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OnGoingPlyersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtMemberIdKeyReleased

    private void ongoingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoingTableMouseClicked
        try {
            loadOngoingMebers();
        } catch (SQLException ex) {
            Logger.getLogger(OnGoingPlyersPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OnGoingPlyersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ongoingTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable ongoingTable;
    private javax.swing.JTextField txtMemberId;
    // End of variables declaration//GEN-END:variables

    /**
     * view the all on going members with details
     */
    private void getOngoingMembers() {
        dtm = (DefaultTableModel) ongoingTable.getModel();
        try {
            AttendanceController attendanceController
                    = new ControllerFactoryImpl().getAttendanceController();
            String curDate = HomeFrame.dateL.getText();
            ongoingMembers = attendanceController.getOngoingMembers(curDate);

            if (!ongoingMembers.isEmpty()) {
                dtm.setRowCount(0);
                for (Attendance ongoingMember : ongoingMembers) {
                    String memberName = getMemberName(ongoingMember.getCid());
                    Object[] row = {ongoingMember.getCid(), memberName, ongoingMember.getInTime()};
                    dtm.addRow(row);
                }
            } else {
                OptionPaneAddedSuccess op = new OptionPaneAddedSuccess(homeFrame, true, "Opps..!! No Ongoning Members..");
                op.btnOk.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OnGoingPlyersPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OnGoingPlyersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * get the user name to the cid
     *
     * @param cid
     * @return member name
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private String getMemberName(String cid) throws SQLException, ClassNotFoundException {
        MemberController memberController
                = new ControllerFactoryImpl().getMemberController();
        Member searchMember = memberController.searchMember(cid);
        String memberName = searchMember.getfName() + " " + searchMember.getlName();

        return memberName;
    }

    /**
     * load member's scheduled exercises
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void loadOngoingMebers() throws SQLException, ClassNotFoundException {
        String cid = (String) ongoingTable.getValueAt(ongoingTable.getSelectedRow(), 0);
        dtm1 = (DefaultTableModel) jTable2.getModel();
        dtm1.setRowCount(0);
        if (cid != null) {
            ScheduleController scheduleController = new ControllerFactoryImpl().getScheduleController();
            Schedule currentSchedule = scheduleController.getCurrentSchedule(cid);
            if (currentSchedule != null) {
                ScheduleDetailsController scheduleDetailsController
                        = new ControllerFactoryImpl().getScheduleDetailsController();

                ArrayList<ScheduleDetails> scheduleDetails
                        = scheduleDetailsController.getScheduleDetails(currentSchedule.getScheduleID());
                ExerciseController exerciseController
                        = new ControllerFactoryImpl().getExerciseController();

                for (ScheduleDetails scheduleDetail : scheduleDetails) {
                    Exercise searchExercise = exerciseController.searchExercise(scheduleDetail.getEid());
                    Object[] row = {searchExercise.getDescription(), scheduleDetail.getRep(), scheduleDetail.getSet()};
                    dtm1.addRow(row);
                }
            } else {
                new OptionPaneAddedSuccess(homeFrame, true, "This Member has no Schedule..");
            }
        } else {
            new OptionPaneAddedSuccess(homeFrame, true, "This Member has no Schedule..");
        }
    }

    private void searchMember() throws SQLException, ClassNotFoundException {
        String nameLike = txtMemberId.getText();
        dtm.setRowCount(0);
        for (int i = 0; i < ongoingMembers.size(); i++) {
            String name = getMemberName(ongoingMembers.get(i).getCid());
            String cid = ongoingMembers.get(i).getCid();
            if (name.contains(nameLike)) {
                Object[] row = {cid, name, ongoingMembers.get(i).getInTime()};
                dtm.addRow(row);
            }
        }
    }
}
