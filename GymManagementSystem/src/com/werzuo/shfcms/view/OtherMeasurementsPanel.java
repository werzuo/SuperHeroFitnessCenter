/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.view;

import com.werzuo.shfcms.common.Validation;
import com.werzuo.shfcms.model.Member;
import com.werzuo.shfcms.model.OtherMeasurement;
import com.werzuo.shfcms.model.RegDetails;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class OtherMeasurementsPanel extends javax.swing.JPanel {

    /**
     * Creates new form OtherMeasurements
     */
    private HomeFrame homeFrame;
    private RegDetails regDetails;
    private Member member;
    private ArrayList<String> goals;

    public OtherMeasurementsPanel() {
        initComponents();
        goals = new ArrayList<>();
    }

    public OtherMeasurementsPanel(HomeFrame homeFrame, Member member, RegDetails regDetails) {
        initComponents();
        this.homeFrame = homeFrame;
        this.member = member;
        this.regDetails = regDetails;
        goals = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnGamWight = new javax.swing.JCheckBox();
        btnReduceStress = new javax.swing.JCheckBox();
        btnRehabilitateInjury = new javax.swing.JCheckBox();
        lblFitness = new javax.swing.JLabel();
        btnImproveCardiovascular = new javax.swing.JCheckBox();
        btnImproFitnessLevel = new javax.swing.JCheckBox();
        btnImproveEstingHabit = new javax.swing.JCheckBox();
        btnImproveFlexibility = new javax.swing.JCheckBox();
        lblToneAndShape = new javax.swing.JLabel();
        btnWeightLoss = new javax.swing.JCheckBox();
        btnImproveMuscle = new javax.swing.JCheckBox();
        btnMaintainFitnessLevel = new javax.swing.JCheckBox();
        btnImproveStrength = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtCurlUpEndurece = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPushUpEndurance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtShoulder = new javax.swing.JTextField();
        txtSitandReach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(630, 510, 120, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton5.setText("NEXT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(810, 510, 120, 40);

        btnGamWight.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGamWight.setForeground(new java.awt.Color(255, 255, 255));
        btnGamWight.setText("Gain Weight");
        btnGamWight.setOpaque(false);
        btnGamWight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGamWightActionPerformed(evt);
            }
        });
        add(btnGamWight);
        btnGamWight.setBounds(640, 350, 160, 23);

        btnReduceStress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReduceStress.setForeground(new java.awt.Color(255, 255, 255));
        btnReduceStress.setText("Reduce Stress");
        btnReduceStress.setOpaque(false);
        btnReduceStress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReduceStressActionPerformed(evt);
            }
        });
        add(btnReduceStress);
        btnReduceStress.setBounds(640, 390, 190, 23);

        btnRehabilitateInjury.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRehabilitateInjury.setForeground(new java.awt.Color(255, 255, 255));
        btnRehabilitateInjury.setText("Rehabilitate Injury");
        btnRehabilitateInjury.setOpaque(false);
        btnRehabilitateInjury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehabilitateInjuryActionPerformed(evt);
            }
        });
        add(btnRehabilitateInjury);
        btnRehabilitateInjury.setBounds(640, 430, 160, 23);

        lblFitness.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFitness.setForeground(new java.awt.Color(255, 255, 255));
        lblFitness.setText("Fintss");
        add(lblFitness);
        lblFitness.setBounds(370, 500, 110, 20);

        btnImproveCardiovascular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImproveCardiovascular.setForeground(new java.awt.Color(255, 255, 255));
        btnImproveCardiovascular.setText("Improve Cardiovascular");
        btnImproveCardiovascular.setOpaque(false);
        btnImproveCardiovascular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImproveCardiovascularActionPerformed(evt);
            }
        });
        add(btnImproveCardiovascular);
        btnImproveCardiovascular.setBounds(350, 470, 180, 23);

        btnImproFitnessLevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImproFitnessLevel.setForeground(new java.awt.Color(255, 255, 255));
        btnImproFitnessLevel.setText("Improve Fitness Level");
        btnImproFitnessLevel.setOpaque(false);
        btnImproFitnessLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImproFitnessLevelActionPerformed(evt);
            }
        });
        add(btnImproFitnessLevel);
        btnImproFitnessLevel.setBounds(350, 390, 190, 23);

        btnImproveEstingHabit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImproveEstingHabit.setForeground(new java.awt.Color(255, 255, 255));
        btnImproveEstingHabit.setText("Improve Esting Habit");
        btnImproveEstingHabit.setOpaque(false);
        btnImproveEstingHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImproveEstingHabitActionPerformed(evt);
            }
        });
        add(btnImproveEstingHabit);
        btnImproveEstingHabit.setBounds(350, 430, 160, 23);

        btnImproveFlexibility.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImproveFlexibility.setForeground(new java.awt.Color(255, 255, 255));
        btnImproveFlexibility.setText("Imorove Flexibility");
        btnImproveFlexibility.setOpaque(false);
        btnImproveFlexibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImproveFlexibilityActionPerformed(evt);
            }
        });
        add(btnImproveFlexibility);
        btnImproveFlexibility.setBounds(350, 350, 160, 23);

        lblToneAndShape.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblToneAndShape.setForeground(new java.awt.Color(255, 255, 255));
        lblToneAndShape.setText("Tone And Shape");
        add(lblToneAndShape);
        lblToneAndShape.setBounds(110, 500, 110, 20);

        btnWeightLoss.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnWeightLoss.setForeground(new java.awt.Color(255, 255, 255));
        btnWeightLoss.setText("Weight Loss");
        btnWeightLoss.setOpaque(false);
        btnWeightLoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeightLossActionPerformed(evt);
            }
        });
        add(btnWeightLoss);
        btnWeightLoss.setBounds(90, 390, 160, 23);

        btnImproveMuscle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImproveMuscle.setForeground(new java.awt.Color(255, 255, 255));
        btnImproveMuscle.setText("Improve Muscle ");
        btnImproveMuscle.setOpaque(false);
        btnImproveMuscle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImproveMuscleActionPerformed(evt);
            }
        });
        add(btnImproveMuscle);
        btnImproveMuscle.setBounds(90, 470, 160, 23);

        btnMaintainFitnessLevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMaintainFitnessLevel.setForeground(new java.awt.Color(255, 255, 255));
        btnMaintainFitnessLevel.setText("Maintain Fitness Level");
        btnMaintainFitnessLevel.setOpaque(false);
        btnMaintainFitnessLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainFitnessLevelActionPerformed(evt);
            }
        });
        add(btnMaintainFitnessLevel);
        btnMaintainFitnessLevel.setBounds(90, 430, 180, 23);

        btnImproveStrength.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnImproveStrength.setForeground(new java.awt.Color(255, 255, 255));
        btnImproveStrength.setText("Imorove Strength");
        btnImproveStrength.setOpaque(false);
        btnImproveStrength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImproveStrengthActionPerformed(evt);
            }
        });
        add(btnImproveStrength);
        btnImproveStrength.setBounds(90, 350, 160, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 227, 117));
        jLabel9.setText("Fitness Goals");
        add(jLabel9);
        jLabel9.setBounds(80, 270, 180, 40);

        txtCurlUpEndurece.setBackground(new java.awt.Color(0, 0, 0));
        txtCurlUpEndurece.setOpaque(false);
        txtCurlUpEndurece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurlUpEndureceActionPerformed(evt);
            }
        });
        txtCurlUpEndurece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCurlUpEndureceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurlUpEndureceKeyReleased(evt);
            }
        });
        add(txtCurlUpEndurece);
        txtCurlUpEndurece.setBounds(230, 230, 170, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Curl - Up Endurance");
        add(jLabel7);
        jLabel7.setBounds(80, 230, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Push - Up Endurance");
        add(jLabel8);
        jLabel8.setBounds(470, 230, 140, 30);

        txtPushUpEndurance.setBackground(new java.awt.Color(0, 0, 0));
        txtPushUpEndurance.setOpaque(false);
        txtPushUpEndurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPushUpEnduranceActionPerformed(evt);
            }
        });
        txtPushUpEndurance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPushUpEnduranceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPushUpEnduranceKeyReleased(evt);
            }
        });
        add(txtPushUpEndurance);
        txtPushUpEndurance.setBounds(630, 230, 170, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 227, 117));
        jLabel6.setText("Muscular Endurance Assessment");
        add(jLabel6);
        jLabel6.setBounds(80, 170, 370, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Shoulder");
        add(jLabel5);
        jLabel5.setBounds(470, 120, 110, 30);

        txtShoulder.setBackground(new java.awt.Color(0, 0, 0));
        txtShoulder.setOpaque(false);
        txtShoulder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShoulderActionPerformed(evt);
            }
        });
        add(txtShoulder);
        txtShoulder.setBounds(630, 120, 170, 30);

        txtSitandReach.setBackground(new java.awt.Color(0, 0, 0));
        txtSitandReach.setOpaque(false);
        txtSitandReach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSitandReachActionPerformed(evt);
            }
        });
        txtSitandReach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSitandReachKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSitandReachKeyReleased(evt);
            }
        });
        add(txtSitandReach);
        txtSitandReach.setBounds(230, 120, 170, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sit & Reach");
        add(jLabel4);
        jLabel4.setBounds(80, 120, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 227, 117));
        jLabel3.setText("Flexiblety Measurment");
        add(jLabel3);
        jLabel3.setBounds(80, 60, 250, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/Untitled-1.png"))); // NOI18N
        jLabel2.setText("dasdasdasdsadsdsadsa");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 227, 117), 2));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 970, 580);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/werzuo/shfcms/images/panelBody.PNG"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSitandReachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSitandReachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSitandReachActionPerformed

    private void txtShoulderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShoulderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShoulderActionPerformed

    private void txtCurlUpEndureceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurlUpEndureceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurlUpEndureceActionPerformed

    private void txtPushUpEnduranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPushUpEnduranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPushUpEnduranceActionPerformed

    private void btnImproveStrengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImproveStrengthActionPerformed
        String txt = btnImproveStrength.getText();
        if (btnImproveStrength.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnImproveStrength.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnImproveStrengthActionPerformed

    private void btnWeightLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeightLossActionPerformed
        String txt = btnWeightLoss.getText();
        if (btnWeightLoss.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnWeightLoss.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnWeightLossActionPerformed

    private void btnImproveMuscleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImproveMuscleActionPerformed
        String txt = btnImproveMuscle.getText() + " Tone And Shape";
        if (btnImproveMuscle.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnImproveMuscle.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnImproveMuscleActionPerformed

    private void btnMaintainFitnessLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainFitnessLevelActionPerformed
        String txt = btnMaintainFitnessLevel.getText();
        if (btnMaintainFitnessLevel.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnMaintainFitnessLevel.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnMaintainFitnessLevelActionPerformed

    private void btnImproveCardiovascularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImproveCardiovascularActionPerformed
        String txt = btnImproveCardiovascular.getText() + " Fintss";
        if (btnImproveCardiovascular.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnImproveCardiovascular.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnImproveCardiovascularActionPerformed

    private void btnImproFitnessLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImproFitnessLevelActionPerformed
        String txt = btnImproFitnessLevel.getText();
        if (btnImproFitnessLevel.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnImproFitnessLevel.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnImproFitnessLevelActionPerformed

    private void btnImproveEstingHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImproveEstingHabitActionPerformed
        String txt = btnImproveEstingHabit.getText();
        if (btnImproveEstingHabit.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnImproveEstingHabit.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnImproveEstingHabitActionPerformed

    private void btnImproveFlexibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImproveFlexibilityActionPerformed
        String txt = btnImproveFlexibility.getText();
        if (btnImproveFlexibility.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnImproveFlexibility.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnImproveFlexibilityActionPerformed

    private void btnGamWightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGamWightActionPerformed
        String txt = btnGamWight.getText();
        if (btnGamWight.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnGamWight.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnGamWightActionPerformed

    private void btnReduceStressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReduceStressActionPerformed
        String txt = btnReduceStress.getText();
        if (btnReduceStress.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnReduceStress.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnReduceStressActionPerformed

    private void btnRehabilitateInjuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehabilitateInjuryActionPerformed
        String txt = btnRehabilitateInjury.getText();
        if (btnRehabilitateInjury.isSelected()) {
            goals.add(txt);
        } else {
            boolean remove = removeGoal(txt);
            if (!remove) {
                btnRehabilitateInjury.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnRehabilitateInjuryActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        OtherMeasurement otherMeasurement = createOtherMeasurement();
        PhysicalActivtyPanel a = new PhysicalActivtyPanel(homeFrame, member, regDetails, otherMeasurement);
        homeFrame.panelBody.removeAll();
        a.setSize(homeFrame.panelBody.getSize());
        homeFrame.panelBody.add(a);
        homeFrame.panelBody.repaint();
        homeFrame.panelBody.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtSitandReachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSitandReachKeyPressed
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Toolkit.getDefaultToolkit();
            Validation.priceText(txtSitandReach);
        }
    }//GEN-LAST:event_txtSitandReachKeyPressed

    private void txtSitandReachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSitandReachKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Toolkit.getDefaultToolkit();
            Validation.priceText(txtSitandReach);
        }
    }//GEN-LAST:event_txtSitandReachKeyReleased

    private void txtCurlUpEndureceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurlUpEndureceKeyPressed
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Toolkit.getDefaultToolkit();
            Validation.priceText(txtCurlUpEndurece);
        }
    }//GEN-LAST:event_txtCurlUpEndureceKeyPressed

    private void txtCurlUpEndureceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurlUpEndureceKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Toolkit.getDefaultToolkit();
            Validation.priceText(txtCurlUpEndurece);
        }
    }//GEN-LAST:event_txtCurlUpEndureceKeyReleased

    private void txtPushUpEnduranceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPushUpEnduranceKeyPressed
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Toolkit.getDefaultToolkit();
            Validation.priceText(txtPushUpEndurance);
        }
    }//GEN-LAST:event_txtPushUpEnduranceKeyPressed

    private void txtPushUpEnduranceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPushUpEnduranceKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Toolkit.getDefaultToolkit();
            Validation.priceText(txtCurlUpEndurece);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtPushUpEnduranceKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnGamWight;
    private javax.swing.JCheckBox btnImproFitnessLevel;
    private javax.swing.JCheckBox btnImproveCardiovascular;
    private javax.swing.JCheckBox btnImproveEstingHabit;
    private javax.swing.JCheckBox btnImproveFlexibility;
    private javax.swing.JCheckBox btnImproveMuscle;
    private javax.swing.JCheckBox btnImproveStrength;
    private javax.swing.JCheckBox btnMaintainFitnessLevel;
    private javax.swing.JCheckBox btnReduceStress;
    private javax.swing.JCheckBox btnRehabilitateInjury;
    private javax.swing.JCheckBox btnWeightLoss;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFitness;
    private javax.swing.JLabel lblToneAndShape;
    private javax.swing.JTextField txtCurlUpEndurece;
    private javax.swing.JTextField txtPushUpEndurance;
    private javax.swing.JTextField txtShoulder;
    private javax.swing.JTextField txtSitandReach;
    // End of variables declaration//GEN-END:variables

    /**
     * create the other measurement model
     *
     * @return OtherMeasurement
     */
    private OtherMeasurement createOtherMeasurement() {

        String sitReach = txtSitandReach.getText();
        double shoulder = Double.parseDouble(txtShoulder.getText());
        String curlUpEndurance = txtCurlUpEndurece.getText();
        String pushlUpEndurance = txtPushUpEndurance.getText();

        OtherMeasurement otherMeasurement
                = new OtherMeasurement(member.getCid(), sitReach, shoulder, curlUpEndurance, pushlUpEndurance, goals);

        return otherMeasurement;
    }

    /**
     * remove the unselected goal from the selected list
     *
     * @param goal
     * @return if returned
     */
    private boolean removeGoal(String goal) {

        boolean remove = false;
        for (String txt : goals) {
            if (txt.equals(goal)) {
                remove = goals.remove(txt);
            }
        }

        return remove;
    }
}
