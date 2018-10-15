/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole.MedicalRecordsDetails;

import Business.ECGTest.ecgTest;
import Business.Patient.Patient;
import javax.swing.JPanel;

/**
 *
 * @author Niranjanii
 */
public class ECGForm extends javax.swing.JPanel {

    /**
     * Creates new form ECGForm
     */
        private JPanel userProcessContainer;
    private Patient patient;
    private boolean ecgFlag;
    public ECGForm(JPanel userProcessContainer,Patient patient,boolean ecgFlag) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.patient=patient;
        this.ecgFlag = ecgFlag;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        heartRateCalc = new javax.swing.JTextArea();
        orsIntervalTxt = new javax.swing.JTextField();
        otIntervalTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        hospital = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        doctor = new javax.swing.JTextField();
        ecgTakn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        prIntervalTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Heart rate calculations :");
        add(jLabel4);
        jLabel4.setBounds(600, 160, 160, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("OT Interval");
        add(jLabel5);
        jLabel5.setBounds(670, 480, 90, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Durations Intervals :");
        add(jLabel6);
        jLabel6.setBounds(600, 340, 160, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Hospital :");
        add(jLabel7);
        jLabel7.setBounds(470, 100, 90, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("ORS Interval :");
        add(jLabel8);
        jLabel8.setBounds(670, 440, 90, 30);

        heartRateCalc.setColumns(20);
        heartRateCalc.setRows(5);
        jScrollPane1.setViewportView(heartRateCalc);

        add(jScrollPane1);
        jScrollPane1.setBounds(630, 210, 320, 120);
        add(orsIntervalTxt);
        orsIntervalTxt.setBounds(770, 440, 170, 40);
        add(otIntervalTxt);
        otIntervalTxt.setBounds(770, 490, 170, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Doctor :");
        add(jLabel9);
        jLabel9.setBounds(770, 100, 90, 30);
        add(hospital);
        hospital.setBounds(560, 100, 170, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("PR Interval :");
        add(jLabel10);
        jLabel10.setBounds(670, 390, 90, 30);
        add(doctor);
        doctor.setBounds(840, 100, 170, 40);
        add(ecgTakn);
        ecgTakn.setBounds(1170, 100, 170, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Ecg Taken :");
        add(jLabel11);
        jLabel11.setBounds(1080, 100, 90, 30);
        add(prIntervalTxt);
        prIntervalTxt.setBounds(770, 390, 170, 40);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(740, 550, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -30, 1430, 1210);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ecgTest ecgtst= patient.getMedicalRecord().getEcgDir().addEcgTest();
       
       ecgtst.setHeartRateCal(heartRateCalc.getText());
       ecgtst.setOrsComplex(orsIntervalTxt.getText());
       ecgtst.setOtInterval(otIntervalTxt.getText());
       ecgtst.setPrInterval(prIntervalTxt.getText());
       ecgFlag = true;
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField ecgTakn;
    private javax.swing.JTextArea heartRateCalc;
    private javax.swing.JTextField hospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orsIntervalTxt;
    private javax.swing.JTextField otIntervalTxt;
    private javax.swing.JTextField prIntervalTxt;
    // End of variables declaration//GEN-END:variables
}
