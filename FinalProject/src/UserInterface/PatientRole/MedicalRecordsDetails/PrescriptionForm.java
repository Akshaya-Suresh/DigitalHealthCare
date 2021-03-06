/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole.MedicalRecordsDetails;

import Business.Patient.Patient;
import Business.PillsGiven.PillsGiven;
import Business.Prescription.Prescription;
import Utilities.Validation;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niranjanii
 */
public class PrescriptionForm extends javax.swing.JPanel {

    /**
     * Creates new form Prescription
     */
    
        private JPanel userProcessContainer;
    private Patient patient;
    private boolean prescriptionFlag;
    public PrescriptionForm(JPanel userProcessContainer,Patient patient,boolean prescriptionFlag) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.patient = patient;
        this.prescriptionFlag= prescriptionFlag;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicationTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        dateGiven = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Emergency Contact name :");
        add(jLabel16);
        jLabel16.setBounds(330, 70, 180, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("Emergency Contact Name/Phone :");
        add(jLabel17);
        jLabel17.setBounds(110, 120, 260, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("Date Last Updated :");
        add(jLabel18);
        jLabel18.setBounds(110, 160, 180, 30);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setText("Name :");
        add(jLabel26);
        jLabel26.setBounds(110, 70, 60, 20);

        medicationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of the Medication", "Strength and Frequency", "Condition Medication Taken For", "Physician who Prescribed Med", "Notes"
            }
        ));
        jScrollPane1.setViewportView(medicationTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 220, 810, 160);

        jButton1.setText("Edit Row");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(520, 410, 130, 40);

        jButton2.setText("Add Row");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(220, 410, 130, 40);

        jButton3.setText("Delete Row");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(370, 410, 130, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(510, 70, 160, 30);
        add(dateGiven);
        dateGiven.setBounds(280, 160, 160, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        add(jTextField3);
        jTextField3.setBounds(160, 70, 160, 30);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        add(jTextField4);
        jTextField4.setBounds(340, 120, 160, 30);

        jButton4.setText("Save Prescription");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(400, 520, 150, 50);

        backBtn.setBackground(new java.awt.Color(255, 204, 51));
        backBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(6, 6, 164, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -10, 1410, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel  dtm = (DefaultTableModel)medicationTable.getModel();
        Object[] row = new Object[5];
        dtm.addRow(row);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

 if(!Validation.nullPointerException(jTextField3) &&  !Validation.nullPointerException(jTextField1) &&
                !Validation.nullPointerException(jTextField4) && !Validation.nullPointerException(dateGiven) 
              )
        {  
        Prescription p=patient.getMedicalRecord().getPrescriptionDir().addPrescription();
        PillsGiven pg=p.addPills();
        prescriptionFlag = true;
       // p.setPresGiven(dateGiven.getText());
        int rowCount =  medicationTable.getRowCount();
        for(int i=0;i<rowCount;i++)
        {
           
            pg.setNameOfMedication((String)medicationTable.getValueAt(i, 0));
            pg.setFrequency((String)medicationTable.getValueAt(i, 1));
            pg.setConditionMedicationTaken((String)medicationTable.getValueAt(i, 2));
            pg.setNotes((String)medicationTable.getValueAt(i, 3));
            pg.setPhysician((String)medicationTable.getValueAt(i, 4));
            pg.setStrength((String)medicationTable.getValueAt(i, 5));
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
     	     char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        	     char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
       	     char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateGiven;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable medicationTable;
    // End of variables declaration//GEN-END:variables
}
