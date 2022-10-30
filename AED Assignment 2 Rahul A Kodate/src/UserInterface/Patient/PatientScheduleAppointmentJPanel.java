/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;


import Business.Community.Community;
import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.text.SimpleDateFormat;  


/**
 *
 * @author Saad Ghojaria
 */
public class PatientScheduleAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPageOneJPanel
     */
    
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Ecosystem business;
    ArrayList <String> bookedSlot= new ArrayList();
    public PatientScheduleAppointmentJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account=account;
        this.business = business;
        populateHopitalComboBox();
    }
    
    public void populateHopitalComboBox() {
        ArrayList<Hospital> hospitalList = business.getHospitalDirectory().getHospitalList();
        Hospital[] comboBoxModel1 = hospitalList.toArray(new Hospital[0]);
        hospitalNameComboBox.setModel(new DefaultComboBoxModel<Hospital>(comboBoxModel1));
    }
    
    public void populateTable(ArrayList<PhysicianRequest> appointments) {
        // populate all patients in patient directory
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(PhysicianRequest pr: appointments) {
            Object row[] = new Object[4];
            Doctor doctor = (Doctor) pr.getReceiver().getDetails();
            row[0] = doctor.getName();
            row[1] = doctor.getHospital().getCommunity().getName();
            row[2] = doctor.getCommunity().getName();
            row[3] = pr.getTime();
            model.addRow(row);
        }
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        physicianNameCombo = new javax.swing.JComboBox<>();
        lblHospital = new javax.swing.JLabel();
        searchByHospitalName = new javax.swing.JButton();
        lblPhysician = new javax.swing.JLabel();
        hospitalNameComboBox = new javax.swing.JComboBox<>();
        lblDepartment = new javax.swing.JLabel();
        communityComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblDate = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicianNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicianNameComboActionPerformed(evt);
            }
        });
        add(physicianNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 200, -1));

        lblHospital.setText("Hospital: ");
        add(lblHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 124, 27));

        searchByHospitalName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        searchByHospitalName.setText("Get available time slots");
        searchByHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByHospitalNameActionPerformed(evt);
            }
        });
        add(searchByHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, -1));

        lblPhysician.setText("Physician:");
        add(lblPhysician, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 124, 27));

        hospitalNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameComboBoxActionPerformed(evt);
            }
        });
        add(hospitalNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 200, -1));

        lblDepartment.setText("Community: ");
        add(lblDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 124, 27));

        communityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityComboBoxActionPerformed(evt);
            }
        });
        add(communityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 200, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Physician", "Hospital", "Department", "Time Slot"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 810, 210));

        lblDate.setText("Date:");
        add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 124, 27));

        btnBook.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBook.setText("Book ");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 190, 40));
        add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void physicianNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicianNameComboActionPerformed
        
    }//GEN-LAST:event_physicianNameComboActionPerformed

    private void searchByHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByHospitalNameActionPerformed
        // TODO add your handling code here:
        
        
        Community selectedCmt = (Community) communityComboBox.getSelectedItem();
       Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        Doctor selectedDoctor = (Doctor) physicianNameCombo.getSelectedItem();
        String selectedDate = dateChooserCombo1.getSelectedDate().toString();
        if(selectedHospital == null || selectedCmt == null ) 
        {
            JOptionPane.showMessageDialog(null, "Please select the hospital, Community and date");
            return;
        }
    if(selectedHospital == null || selectedCmt == null || selectedDate == null) 
   {
          JOptionPane.showMessageDialog(null, "Please select the hospital, departmnent and date");
           return;
    }
  
        
 //  if(date1.before(new Date())) {
   //    JOptionPane.showMessageDialog(null, "Please select a valid date");
    //        return;
     // }
       ArrayList<PhysicianRequest> availableWorkRequests = new ArrayList();
        if(selectedDoctor == null) {
          for(Doctor d: selectedHospital.getDoctorDirectory()) {              
             availableWorkRequests.addAll(this.getAvailablePhysicianSlots(d, selectedDate));
           }
        } else {
          availableWorkRequests = this.getAvailablePhysicianSlots(selectedDoctor, selectedDate);
        }
        populateTable(availableWorkRequests);
    }//GEN-LAST:event_searchByHospitalNameActionPerformed

    private void hospitalNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameComboBoxActionPerformed
        // TODO add your handling code here:
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        ArrayList<Doctor> doctorList = selectedHospital.getDoctorDirectory();
        Doctor[] comboBoxModel2 = doctorList.toArray(new Doctor[0]);
//        ArrayList<Department> deptList = selectedHospital.getDepartmentDirectory();
//        Department[] comboBoxModel = deptList.toArray(new Department[0]);
    //   System.out.print(deptList.toArray());
        //hospitalNameComboBox.setSelectedIndex(-1);
       // departmentlNameCombo.setModel(new DefaultComboBoxModel<Department>(comboBoxModel));
     
    }//GEN-LAST:event_hospitalNameComboBoxActionPerformed

    private void communityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityComboBoxActionPerformed
        // TODO add your handling code here:
        
        Community selectedCmt = (Community) communityComboBox.getSelectedItem();
        
        
    }//GEN-LAST:event_communityComboBoxActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();
       
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        Community selectedCmt = (Community) communityComboBox.getSelectedItem();
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        
        Doctor selectedDoctor = (Doctor) physicianNameCombo.getSelectedItem();
        //String selectedDate = dateChooserCombo1.getSelectedDate().toString();
        
        String timeSlot = (String) jTable1.getValueAt(selectedRow, 3);
        
        bookedSlot.add(timeSlot);
        UserAccount doctorAccount = business.getUserAccountDirectory().getUserById(selectedDoctor.getDoctorId());
        
        PhysicianRequest request = new PhysicianRequest();
        request.setReceiver(doctorAccount);
        request.setSender(account);
        request.setRequestDate(new Date());
        request.setStatus("pending physician approval");
        //request.setAppointmentDate(selectedDate);
        request.setTime(timeSlot);
        
        
        
        doctorAccount.getWorkQueue().getWorkRequestList().add(request);
        this.account.getWorkQueue().getWorkRequestList().add(request);
        
        JOptionPane.showMessageDialog(null, "Appointment sent for approval to physician");
        populateTable(new ArrayList());
    }//GEN-LAST:event_btnBookActionPerformed

    private ArrayList<PhysicianRequest> getAvailablePhysicianSlots (Doctor doctor, String selectedDate) {
        ArrayList<PhysicianRequest> availableWorkRequests = new ArrayList();
        ArrayList<PhysicianRequest> unavailableWorkRequests = new ArrayList();

        ArrayList<WorkRequest> existingRequests = this.business.getUserAccountDirectory().getUserById(doctor.getDoctorId()).getWorkQueue().getWorkRequestList();
        for(WorkRequest w : existingRequests) {
            
            if(w.getStatus().equals("pending physician approval") || w.getStatus().equals("physician accepted")) {
                PhysicianRequest pr = (PhysicianRequest) w;
              // if(pr.getAppointmentDate().getDate() == selectedDate.getDate()) {
                //    unavailableWorkRequests.add(pr);
             //   }
            }
        }
        for(int time = 8; time < 19; time++) {
            boolean isValid = true;
            for(PhysicianRequest pr: unavailableWorkRequests) {
                if(pr.getTime().equals(time + " - " + (time + 1))) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                PhysicianRequest newRequest = new PhysicianRequest();
                newRequest.setReceiver(this.business.getUserAccountDirectory().getUserById(doctor.getDoctorId()));
             //   newRequest.setAppointmentDate(SelectedDate.toDate());
                newRequest.setRequestDate(new Date());
                newRequest.setSender(account);
                newRequest.setTime(time + " - " + (time + 1));
                availableWorkRequests.add(newRequest);
            }
        }
        return availableWorkRequests;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox<Community> communityComboBox;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JComboBox<Hospital> hospitalNameComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPhysician;
    private javax.swing.JComboBox<Doctor> physicianNameCombo;
    private javax.swing.JButton searchByHospitalName;
    // End of variables declaration//GEN-END:variables
}
