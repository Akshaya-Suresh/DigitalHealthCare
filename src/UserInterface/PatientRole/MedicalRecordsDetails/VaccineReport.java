/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole.MedicalRecordsDetails;

import Business.BloodTest.BloodTest;
import Business.Patient.Patient;
import Business.VaccineTest.Vaccine;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niranjanii
 */
public class VaccineReport extends javax.swing.JPanel {

    /**
     * Creates new form VaccineReport
     */
    
         private JPanel userProcessContainer;
    private Patient patient;
    private boolean vaccineFlag;
    
    public VaccineReport(JPanel userProcessContainer,Patient patient,boolean vaccineFlag) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.patient=patient;
        this.vaccineFlag = vaccineFlag;
        jPanel1.setVisible(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vaccineName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vaccineType = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        expiryDate = new javax.swing.JTextField();
        doctor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateGiven = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        validtill = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dosage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        vaccinator = new javax.swing.JTextField();
        hospital = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        medicalId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinetbl = new javax.swing.JTable();
        newbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 153));
        jLabel9.setText("Hospital :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 80, 100, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 153));
        jLabel10.setText("Vaccine Name :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(130, 120, 120, 30);
        jPanel1.add(vaccineName);
        vaccineName.setBounds(270, 120, 140, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Types of Vaccine :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 160, 140, 30);

        vaccineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineTypeActionPerformed(evt);
            }
        });
        jPanel1.add(vaccineType);
        vaccineType.setBounds(270, 160, 140, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("Expiry Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 200, 130, 30);

        expiryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiryDateActionPerformed(evt);
            }
        });
        jPanel1.add(expiryDate);
        expiryDate.setBounds(270, 200, 140, 30);
        jPanel1.add(doctor);
        doctor.setBounds(560, 80, 140, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Doctor :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 80, 90, 30);

        dateGiven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateGivenActionPerformed(evt);
            }
        });
        jPanel1.add(dateGiven);
        dateGiven.setBounds(560, 160, 140, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("Date Given :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(460, 160, 90, 30);
        jPanel1.add(validtill);
        validtill.setBounds(560, 200, 140, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 153));
        jLabel11.setText("Valid till :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 200, 90, 30);
        jPanel1.add(dosage);
        dosage.setBounds(560, 240, 140, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Dosage :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 240, 90, 30);

        jButton1.setText("Add ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 290, 130, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 153));
        jLabel13.setText("Vaccinator :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(150, 240, 100, 30);
        jPanel1.add(vaccinator);
        vaccinator.setBounds(270, 240, 140, 30);
        jPanel1.add(hospital);
        hospital.setBounds(270, 80, 140, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 153));
        jLabel14.setText("Medical Id :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(460, 120, 90, 30);
        jPanel1.add(medicalId);
        medicalId.setBounds(560, 120, 140, 30);

        add(jPanel1);
        jPanel1.setBounds(430, 410, 980, 350);

        vaccinetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Dosage", "Doctor Name ", "Vaccinator", "Dates Given", "Valid till", "Medical Id"
            }
        ));
        jScrollPane1.setViewportView(vaccinetbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(420, 100, 870, 220);

        newbtn.setText("New");
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });
        add(newbtn);
        newbtn.setBounds(970, 350, 130, 50);

        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        add(editbtn);
        editbtn.setBounds(1130, 350, 120, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
        jPanel1.setVisible(true);
    }//GEN-LAST:event_newbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Vaccine vaccine = patient.getMedicalRecord().getVaccineDir().addVaccine();
       
     //  vaccine.setDateGiven(dateGiven.getText());
       vaccineFlag = true;
       vaccine.setDoctor(doctor.getText());
       vaccine.setDosage(dosage.getText());
       vaccine.setExpiryDate(expiryDate.getText());
       vaccine.setHopital(hospital.getText());
       vaccine.setMedicalId(medicalId.getText());
       vaccine.setTypesOfVaccine(vaccineType.getText());
       vaccine.setVaccinator(vaccinator.getText());
       vaccine.setVaccineName(vaccineName.getText());
     //  vaccine.setValidTill(validtill.getText());
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editbtnActionPerformed

    private void vaccineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineTypeActionPerformed

    private void dateGivenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateGivenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateGivenActionPerformed

    private void expiryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiryDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateGiven;
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField dosage;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField expiryDate;
    private javax.swing.JTextField hospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicalId;
    private javax.swing.JButton newbtn;
    private javax.swing.JTextField vaccinator;
    private javax.swing.JTextField vaccineName;
    private javax.swing.JTextField vaccineType;
    private javax.swing.JTable vaccinetbl;
    private javax.swing.JTextField validtill;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel)vaccinetbl.getModel();
        int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }

            for(Vaccine  vaccine :patient.getMedicalRecord().getVaccineDir().getVaccineList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = vaccine;
                           row[1] = vaccine.getVaccineName();
                           row[2] = vaccine.getDosage();
                           row[3] = vaccine.getDoctor();
                           row[4] = vaccine.getVaccinator();
                           row[5] = vaccine.getDateGiven();
                           row[6] = vaccine.getValidTill();
                           row[7] = vaccine.getMedicalId();
                           model.addRow(row);

      
            }
    }
}
