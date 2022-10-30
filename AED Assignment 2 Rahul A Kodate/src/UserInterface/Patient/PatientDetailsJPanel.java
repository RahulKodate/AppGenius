/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Patient;

import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saad Ghojaria
 */
public class PatientDetailsJPanel extends javax.swing.JPanel {
    
    private JPanel CardLayoutJPanel;
    private PatientDetails details;
    private UserAccount account;

    /** Creates new form PatientDetailsJPanel */
    public PatientDetailsJPanel(JPanel CardLayoutJPanel, PatientDetails details, UserAccount account) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.details = details;
        this.account = account;
        
        if(account.getRole().toString().equals("Business.Role.PhysicianRole")) {
            addNotesBtn.setVisible(true);
            saveBtn.setVisible(true);
            
            addNotesBtn.setEnabled(true);
            saveBtn.setEnabled(false);
            
        } else {
            
            addNotesBtn.setVisible(false);
            saveBtn.setVisible(false);
        }
        
        
         this.dateTxt.setText(details.getDate().toString());
         this.hospitalTxt.setText((details.getDoctor() != null ? details.getDoctor().getHospital().getCommunity().getName() :"Hospital Dummy" ));
      
        this.DoctorTxt.setText((details.getDoctor() != null ) ? details.getDoctor().getName() : "Doctor Dummy");
        this.notesTxt.setText(details.getNotes());
        this.txtPulse.setText(details.getPulse());
        this.txtTemperature.setText(details.getTemperature());
        this.txtBloodPressure.setText(details.getBloodPressure());
        
        
        this.notesTxt.setLineWrap(true);
//        this.txtTemperature.setLineWrap(true);
//        this.txtPulse.setEnabled(true);
//        this.txtBloodPressure.setEnabled(true);
        
        this.dateTxt.setEnabled(false);
        this.hospitalTxt.setEnabled(false);
        this.DoctorTxt.setEnabled(false);
        this.notesTxt.setEnabled(false);
        this.txtTemperature.setEnabled(false);
        this.txtPulse.setEnabled(false);
        this.txtBloodPressure.setEnabled(false);
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalTxt = new javax.swing.JTextField();
        DoctorTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        addNotesBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(hospitalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 382, -1));
        add(DoctorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 382, -1));
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 382, -1));

        notesTxt.setColumns(20);
        notesTxt.setRows(5);
        jScrollPane1.setViewportView(notesTxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 380, 90));

        jLabel1.setText("Hospital: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 50, -1));

        jLabel2.setText("Physician: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel3.setText("Date: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel4.setText("Notes: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        addNotesBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        addNotesBtn.setText("Add Notes");
        addNotesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotesBtnActionPerformed(evt);
            }
        });
        add(addNotesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 430, 100, -1));
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 380, -1));
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 380, -1));
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 380, -1));
        txtTemperature.getAccessibleContext().setAccessibleParent(jScrollPane1);

        lblPulse.setText("Pulse:");
        add(lblPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        lblHeartRate.setText("Heart Rate:");
        add(lblHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        lblTemperature.setText("Temperature:");
        add(lblTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addNotesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNotesBtnActionPerformed
        // TODO add your handling code here:
        notesTxt.setEnabled(true);
        txtTemperature.setEnabled(true);
        txtPulse.setEnabled(true);
        txtBloodPressure.setEnabled(true);
        saveBtn.setEnabled(true);
        addNotesBtn.setEnabled(false);
    }//GEN-LAST:event_addNotesBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        notesTxt.setEnabled(false);
        txtTemperature.setEnabled(false);
        txtPulse.setEnabled(false);
        txtBloodPressure.setEnabled(false);
 
        saveBtn.setEnabled(false);
        addNotesBtn.setEnabled(true);
        
        this.details.setNotes(notesTxt.getText());
        this.details.setPulse(txtPulse.getText());
        this.details.setTemperature(txtTemperature.getText());
        this.details.setBloodPressure(txtBloodPressure.getText());
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DoctorTxt;
    private javax.swing.JButton addNotesBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField hospitalTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JTextArea notesTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

}
