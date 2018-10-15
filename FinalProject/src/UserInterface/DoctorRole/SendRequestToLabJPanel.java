/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountPermissionRequest;
import Business.WorkQueue.TestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Niranjanii
 */
public class SendRequestToLabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendRequestJPAnel
     */
    DefaultListModel model;
    DefaultListModel model1;
     JPanel userProcessContainer;
    Patient patient;
      private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    public SendRequestToLabJPanel(JPanel userProcessContainer, Patient patient,Enterprise enterprise, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        model = new DefaultListModel();
        model1= new DefaultListModel();
        this.userProcessContainer = userProcessContainer;
        this.patient=patient;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.system=ecosystem;
           List1.setModel(model);
           List2.setModel(model1);
        populateJList();
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
        List2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        submitReq = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        commentTxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jScrollPane1.setViewportView(List2);

        add(jScrollPane1);
        jScrollPane1.setBounds(620, 120, 240, 130);

        jScrollPane2.setViewportView(List1);

        add(jScrollPane2);
        jScrollPane2.setBounds(210, 120, 240, 130);

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(500, 190, 100, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(500, 130, 100, 40);

        submitReq.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        submitReq.setText("Submit request");
        submitReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitReqActionPerformed(evt);
            }
        });
        add(submitReq);
        submitReq.setBounds(460, 430, 160, 40);

        commentTxt.setColumns(20);
        commentTxt.setRows(5);
        jScrollPane3.setViewportView(commentTxt);

        add(jScrollPane3);
        jScrollPane3.setBounds(210, 270, 560, 110);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Test Given :");
        add(jLabel2);
        jLabel2.setBounds(210, 70, 120, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Test Selected :");
        add(jLabel4);
        jLabel4.setBounds(620, 70, 120, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Comments :");
        add(jLabel3);
        jLabel3.setBounds(110, 300, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-130, -160, 1740, 1330);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultListModel model = (DefaultListModel)List1.getModel();
         DefaultListModel model1 = (DefaultListModel)List2.getModel();
        List<String> selectedValue = List1.getSelectedValuesList();
        int[] index=List1.getSelectedIndices();
        for(int i=0;i< index.length;i++)
        {
            model1.addElement(model.getElementAt(index[0]));
            model.removeElementAt(index[0]);
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel model1 = (DefaultListModel)List2.getModel();
        DefaultListModel model = (DefaultListModel)List1.getModel();
        List<String> selectedValue = List2.getSelectedValuesList();
        int[] index=List2.getSelectedIndices();
        for(int i=0;i< index.length;i++)
        {
            model.addElement(model1.getElementAt(index[0]));
            model1.removeElementAt(index[0]);
           
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void submitReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitReqActionPerformed

      Organization organization=null;
        for(Network network:system.getNetworkList())
        {
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(enterprise instanceof HospitalEnterprise)
                {
                   for(Organization org :((HospitalEnterprise) enterprise).getOrganizationDirectory().getOrganizationList())
                   {
                       if(org instanceof LabOrganization)
                       {
                           organization =org;
                       }
               
                   }
                   
                   
                }
            }
        }
        TestRequest testReq = new TestRequest();
       
        StringBuffer selectedValue = new StringBuffer();
        int count =0;
        for(int i =0;i<List2.getModel().getSize();i++)
        {   
            if(List2.getModel().getSize() == 0)
            {
                 selectedValue.append( List2.getModel().getElementAt(i));
            }
            else
            {
                selectedValue.append("," + List2.getModel().getElementAt(i));
            }
            
            count = count +1;
        }
        testReq.setType(selectedValue);
        testReq.setComments(commentTxt.getText());
        testReq.setSender(userAccount);
        testReq.setPatient(patient);
        testReq.setRequestDate(new Date());
        testReq.setMedicalId(patient.getMedicalRecord().getMedicalId());
        testReq.setStatus("Requested");
        
        
        organization.getWorkQueue().getWorkRequestList().add(testReq);
        userAccount.getWorkQueue().getWorkRequestList().add(testReq);
        
        JOptionPane.showMessageDialog(null, "Sent request to Lab");
    }//GEN-LAST:event_submitReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List1;
    private javax.swing.JList<String> List2;
    private javax.swing.JTextArea commentTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton submitReq;
    // End of variables declaration//GEN-END:variables

    private void populateJList() {
    
        model.addElement("Blood Test");
        model.addElement("Vaccine");
        model.addElement("Whole Body Test");
        model.addElement("Sugar Test");
        model.addElement("GFR Test");
        model.addElement("ECG Test");
        model.addElement("Cholestral Test");
        model.addElement("MELD Test");
        
        
       // List1.setModel(model);
        
    }
}