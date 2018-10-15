/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.BloodTest.BloodTest;
import Business.ECGTest.ecgTest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.GFRTest.gfrTest;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.VaccineTest.Vaccine;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niranjanii
 */
public class ListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListJPanel
     */
      JPanel userProcessContainer;
    Patient patient;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private String type;
    public ListJPanel(JPanel userProcessContainer,String type, Patient patient,Enterprise enterprise, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.patient=patient;
        this.type=type;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.system=ecosystem;
         DefaultTableModel model = (DefaultTableModel)listTbl.getModel();
        if(type.equals("bloodTest"))
        {
              int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }

            for(BloodTest bloodTest :patient.getMedicalRecord().getBloodtestDir().getBloodTestList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = bloodTest;
                           row[1] = bloodTest.getCollectionDate();
                           row[2] = bloodTest.getHospital();
                           row[3] = bloodTest.getDoctor();
                           model.addRow(row);
      
            }
        }
        if(type.equals("ECGTest"))
        {
              int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
                  for(ecgTest ecgTst :patient.getMedicalRecord().getEcgDir().getEcgList())
                    {

                                  Object[] row = new Object[4];
                                   row[0] = ecgTst;
                                   row[1] = ecgTst.getEcgTaken();
                                   row[2] = ecgTst.getHospital();
                                   row[3] = ecgTst.getDoctor();
                                   model.addRow(row);

                    }

        }
        if(type.equals("GFRTest"))
        {
                   int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
           for(gfrTest gfrTst :patient.getMedicalRecord().getGfrDir().getGfrTestList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = gfrTst;
                           row[1] = gfrTst.getDateGiven();
                           row[2] = gfrTst.getHospital();
                           row[3] = gfrTst.getDoctor();
                           model.addRow(row);
      
            }
        }
        if(type.equals("VaccineTest"))
        {
                   int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
           for(Vaccine vaccine :patient.getMedicalRecord().getVaccineDir().getVaccineList())
            {
               
                          Object[] row = new Object[4];
                           row[0] = vaccine;
                           row[1] = vaccine.getDateGiven();
                           row[2] = vaccine.getHopital();
                           row[3] = vaccine.getDoctor();
                           model.addRow(row);
      
            }
        }
        if(type.equals("Prescription"))
        {
                   int rowCount= model.getRowCount();
                 for(int i=0;i<rowCount;i++)
                 {
                    model.removeRow(i);
                 }
                 
                  for(BloodTest bloodTest :patient.getMedicalRecord().getBloodtestDir().getBloodTestList())
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

        setLayout(null);

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
        jScrollPane1.setBounds(180, 80, 680, 160);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTbl;
    // End of variables declaration//GEN-END:variables
}
