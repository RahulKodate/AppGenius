package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import ui.Community.ManageCommunityJPanel;
import ui.Doctor.ManageDoctorJPanel;
import ui.Hospital.ManageHospitalsJPanel;
import ui.Patient.ManagePatients;
import ui.Person.ManagePersonsJPanel;

/**
 *
 * @author rahulkodate
 */
public class LandingPage extends javax.swing.JPanel {

    /**
     * Creates new form LandingPage
     */
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private CommunityDirectory communityDirectory;
    private HospitalDirectory hospitalDirectory;
    private HouseDirectory houseDirectory;
    private CityDirectory cityDirectory;

    public LandingPage(JPanel userProcessContainer, PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, CommunityDirectory communityDirectory, HouseDirectory houseDirectory, CityDirectory cityDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.communityDirectory = communityDirectory;
        this.houseDirectory = houseDirectory;
        this.cityDirectory = cityDirectory;
        setSize(1000, 610);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLanding = new javax.swing.JLabel();
        btnPersonMgmt = new javax.swing.JButton();
        btnHospitalMgmt = new javax.swing.JButton();
        btnPatientMgmt = new javax.swing.JButton();
        btnDoctorMgmt = new javax.swing.JButton();
        btnCommunityMgmt = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        lblLanding.setFont(new java.awt.Font("Operator Mono", 1, 36)); // NOI18N
        lblLanding.setForeground(new java.awt.Color(255, 255, 255));
        lblLanding.setText("Administrator");

        btnPersonMgmt.setBackground(new java.awt.Color(51, 102, 255));
        btnPersonMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnPersonMgmt.setForeground(new java.awt.Color(255, 255, 255));
        btnPersonMgmt.setText("Person Directory");
        btnPersonMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPersonMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonMgmtActionPerformed(evt);
            }
        });

        btnHospitalMgmt.setBackground(new java.awt.Color(51, 102, 255));
        btnHospitalMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnHospitalMgmt.setForeground(new java.awt.Color(255, 255, 255));
        btnHospitalMgmt.setText("Hospital Directory");
        btnHospitalMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHospitalMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalMgmtActionPerformed(evt);
            }
        });

        btnPatientMgmt.setBackground(new java.awt.Color(51, 102, 255));
        btnPatientMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnPatientMgmt.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientMgmt.setText("Patient Directory");
        btnPatientMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPatientMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientMgmtActionPerformed(evt);
            }
        });

        btnDoctorMgmt.setBackground(new java.awt.Color(51, 102, 255));
        btnDoctorMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnDoctorMgmt.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctorMgmt.setText("Doctor Directory");
        btnDoctorMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoctorMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorMgmtActionPerformed(evt);
            }
        });

        btnCommunityMgmt.setBackground(new java.awt.Color(51, 102, 255));
        btnCommunityMgmt.setFont(new java.awt.Font("Operator Mono", 1, 18)); // NOI18N
        btnCommunityMgmt.setForeground(new java.awt.Color(255, 255, 255));
        btnCommunityMgmt.setText("Community Directory");
        btnCommunityMgmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCommunityMgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityMgmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHospitalMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPersonMgmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLanding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPatientMgmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDoctorMgmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCommunityMgmt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblLanding, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnPersonMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPatientMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDoctorMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCommunityMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnHospitalMgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnPersonMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonMgmtActionPerformed
        // TODO add your handling code here:
        ManagePersonsJPanel pjp = new ManagePersonsJPanel(userProcessContainer,
                personDirectory, communityDirectory, houseDirectory);
        userProcessContainer.add("PersonDirectoryJPanel", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  }//GEN-LAST:event_btnPersonMgmtActionPerformed

  private void btnHospitalMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalMgmtActionPerformed
        // TODO add your handling code here:
        ManageHospitalsJPanel pjp = new ManageHospitalsJPanel(userProcessContainer,
                hospitalDirectory);
        userProcessContainer.add("HospitalDirectoryJPanel", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

  }//GEN-LAST:event_btnHospitalMgmtActionPerformed

    private void btnPatientMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientMgmtActionPerformed
        // TODO add your handling code here:
        ManagePatients plp = new ManagePatients(userProcessContainer, personDirectory, hospitalDirectory, doctorDirectory);
        userProcessContainer.add("Manage Patients", plp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPatientMgmtActionPerformed

    private void btnDoctorMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorMgmtActionPerformed
        // TODO add your handling code here:
        ManageDoctorJPanel pjp = new ManageDoctorJPanel(userProcessContainer,
                doctorDirectory, personDirectory);
        userProcessContainer.add("DoctorDirectoryJPanel", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDoctorMgmtActionPerformed

    private void btnCommunityMgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityMgmtActionPerformed
        // TODO add your handling code here:
        ManageCommunityJPanel pjp = new ManageCommunityJPanel(userProcessContainer,
                communityDirectory, houseDirectory, cityDirectory);
        userProcessContainer.add("CommunityDirectoryJPanel", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCommunityMgmtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityMgmt;
    private javax.swing.JButton btnDoctorMgmt;
    private javax.swing.JButton btnHospitalMgmt;
    private javax.swing.JButton btnPatientMgmt;
    private javax.swing.JButton btnPersonMgmt;
    private javax.swing.JLabel lblLanding;
    // End of variables declaration//GEN-END:variables
}