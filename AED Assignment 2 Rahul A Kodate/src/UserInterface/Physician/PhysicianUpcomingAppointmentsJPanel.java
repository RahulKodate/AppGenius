/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Doctor.Doctor;
import UserInterface.Patient.*;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srushtidesai
 */
public class PhysicianUpcomingAppointmentsJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;

    /**
     * Creates new form PatientUpcomingAppointmentsJPanel
     */
    public PhysicianUpcomingAppointmentsJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.populateTable();
        
    }

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        
        ArrayList<WorkRequest> upcomingAppointmentList = new ArrayList();
        for(WorkRequest w: appointmentList) {
            if(w.getStatus().equals("physician accepted")) {
                upcomingAppointmentList.add(w);
            }
        }
        
    
        int rowCount = UpcomingAppointmentsJTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)UpcomingAppointmentsJTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(WorkRequest w: upcomingAppointmentList) {
            Object row[] = new Object[5];
        
            PhysicianRequest pr = (PhysicianRequest) w;
            
            Patient p = (Patient) this.business.getUserAccountDirectory().getUserById(pr.getSender().getId()).getDetails();
            Doctor d = (Doctor) this.account.getDetails();
        
            row[0] = p.getName();
            row[1] = d.getHospital().getName();
            row[2] = pr;
            row[3] = pr.getTime();
            //row[4] = pr.getAppointmentDate();
            
            model.addRow(row);
            
            
        }     
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpcomingAppointmentsJPanel = new javax.swing.JPanel();
        UpcomingAppointmentsJLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        UpcomingAppointmentsJTable = new javax.swing.JTable();
        btnCancelAppointment = new javax.swing.JButton();
        btnCompleteAppointment = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        UpcomingAppointmentsJPanel.setBackground(new java.awt.Color(204, 255, 204));
        UpcomingAppointmentsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpcomingAppointmentsJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        UpcomingAppointmentsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UpcomingAppointmentsJLabel.setText("UPCOMING APPOINTMENTS");
        UpcomingAppointmentsJPanel.add(UpcomingAppointmentsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 58));

        UpcomingAppointmentsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient", "Hospital", "Date Requested", "Time Slot"
            }
        ));
        jScrollPane4.setViewportView(UpcomingAppointmentsJTable);

        UpcomingAppointmentsJPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 730, 183));

        btnCancelAppointment.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCancelAppointment.setText("Cancel Appointment");
        btnCancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAppointmentActionPerformed(evt);
            }
        });
        UpcomingAppointmentsJPanel.add(btnCancelAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 210, 40));

        btnCompleteAppointment.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCompleteAppointment.setText("Complete Appointment");
        btnCompleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteAppointmentActionPerformed(evt);
            }
        });
        UpcomingAppointmentsJPanel.add(btnCompleteAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 210, 40));

        btnRefresh.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        UpcomingAppointmentsJPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpcomingAppointmentsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpcomingAppointmentsJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAppointmentActionPerformed
        // TODO add your handling code here:
        
        int rowCount = UpcomingAppointmentsJTable.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest request = (WorkRequest) UpcomingAppointmentsJTable.getValueAt(rowCount, 2);
        
        request.setStatus("physician canceled");
        
        JOptionPane.showMessageDialog(null, "Appointment canceled");
    }//GEN-LAST:event_btnCancelAppointmentActionPerformed

    private void btnCompleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteAppointmentActionPerformed
        // TODO add your handling code here:
        
        
        int rowCount = UpcomingAppointmentsJTable.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest request = (WorkRequest) UpcomingAppointmentsJTable.getValueAt(rowCount, 2);
        request.setResolveDate(new Date());
        request.setStatus("Physician appointment completed");
        
        Patient  p = (Patient) request.getSender().getDetails();
        Doctor d = (Doctor) account.getDetails();
        
        PatientDetails newDetails = new PatientDetails(d, new Date(), "", "", "", "");
        p.getPatientDetails().add(newDetails);
        
        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(CardLayoutJPanel, newDetails, this.account);
        CardLayoutJPanel.add("PatientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
        
    }//GEN-LAST:event_btnCompleteAppointmentActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UpcomingAppointmentsJLabel;
    private javax.swing.JPanel UpcomingAppointmentsJPanel;
    private javax.swing.JTable UpcomingAppointmentsJTable;
    private javax.swing.JButton btnCancelAppointment;
    private javax.swing.JButton btnCompleteAppointment;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
