/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.BloodTest.BloodTest;
import Business.ECGTest.ecgTest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.GFRTest.gfrTest;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.VaccineTest.Vaccine;
import UserInterface.PatientRole.MedicalRecordsDetails.ECGForm;
import UserInterface.PatientRole.MedicalRecordsDetails.GFRForm;
import UserInterface.PatientRole.MedicalRecordsDetails.VaccineReport;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Listoftests extends javax.swing.JPanel {

    /**
     * Creates new form Listoftests
     */
   JPanel userProcessContainer;
    
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private String type;

    Listoftests(JPanel userProcessContainer, UserAccount userAccount, PatientOrganization organization, Enterprise enterprise, String type) {
          initComponents();
         this.userProcessContainer = userProcessContainer;
        
        this.type=type;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        populate();
    }
    
    public void populate(){
         DefaultTableModel model = (DefaultTableModel)listTbl.getModel();
        if(type.equals("bloodtest"))
        {
              int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }

            for(BloodTest bloodTest :userAccount.getPatient().getMedicalRecord().getBloodtestDir().getBloodTestList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = bloodTest;
                           row[1] = bloodTest.getCollectionDate();
                           row[2] = bloodTest.getHospital();
                           row[3] = bloodTest.getDoctor();
                           model.addRow(row);
      
            }
        }
        if(type.equals("Ecgtest"))
        {
              int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
                  for(ecgTest ecgTst :userAccount.getPatient().getMedicalRecord().getEcgDir().getEcgList())
                    {

                                  Object[] row = new Object[4];
                                   row[0] = ecgTst;
                                   row[1] = ecgTst.getEcgTaken();
                                   row[2] = ecgTst.getHospital();
                                   row[3] = ecgTst.getDoctor();
                                   model.addRow(row);

                    }

        }
        if(type.equals("Gfrtest"))
        {
                   int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
           for(gfrTest gfrTst :userAccount.getPatient().getMedicalRecord().getGfrDir().getGfrTestList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = gfrTst;
                           row[1] = gfrTst.getDateGiven();
                           row[2] = gfrTst.getHospital();
                           row[3] = gfrTst.getDoctor();
                           model.addRow(row);
      
            }
        }
        if(type.equals("vaccinetest"))
        {
                   int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
           for(Vaccine vaccine :userAccount.getPatient().getMedicalRecord().getVaccineDir().getVaccineList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = vaccine;
                           row[1] = vaccine.getDateGiven();
                           row[2] = vaccine.getHopital();
                           row[3] = vaccine.getDoctor();
                           model.addRow(row);
      
            }
        }
        if(type.equals("prescription"))
        {
                   int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
                  for(BloodTest bloodTest :userAccount.getPatient().getMedicalRecord().getBloodtestDir().getBloodTestList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = bloodTest;
                           row[1] = bloodTest.getCollectionDate();
                           row[2] = bloodTest.getHospital();
                           row[3] = bloodTest.getDoctor();
                           model.addRow(row);
      
            }
        }
        
        if(type.equals("OrganDetails"))
        {
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        listTbl.setBackground(new java.awt.Color(0, 0, 0));
        listTbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        listTbl.setForeground(new java.awt.Color(255, 255, 255));
        listTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Test Request Id ", "Date Taken :", "Doctor Name :", "Hospital Name :"
            }
        ));
        jScrollPane1.setViewportView(listTbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 110, 680, 160);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("View in Detail:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(383, 340, 200, 50);

        backBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(20, 20, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-30, -10, 1130, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String typepd;
        typepd="doctor";
        
        if(type.equals("Vaccine"))
        {
            
            int selectedRow = listTbl.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        Vaccine vacctestobj = (Vaccine)listTbl.getValueAt(selectedRow, 0);
            VaccineReport vaccineReport = new VaccineReport(userProcessContainer,userAccount.getPatient(),typepd,false,vacctestobj);
            userProcessContainer.add("PatientViewJPanel", vaccineReport);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else if(type.equals("GFR Test"))
        {
            
            int selectedRow = listTbl.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        gfrTest gfrtestobj = (gfrTest)listTbl.getValueAt(selectedRow, 0);
            GFRForm gfrForm = new GFRForm(userProcessContainer,userAccount.getPatient(),typepd,false,gfrtestobj);
            userProcessContainer.add("PatientViewJPanel", gfrForm);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else if(type.equals("ECG Test"))
        {
            int selectedRow = listTbl.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        ecgTest ecgtestobj = (ecgTest)listTbl.getValueAt(selectedRow, 0);
            ECGForm ecgForm = new ECGForm(userProcessContainer,userAccount.getPatient(),typepd,ecgtestobj,false);
            userProcessContainer.add("PatientViewJPanel", ecgForm);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTbl;
    // End of variables declaration//GEN-END:variables
}
