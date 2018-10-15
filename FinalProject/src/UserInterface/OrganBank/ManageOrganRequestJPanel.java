/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganBank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.OrganDonation.OrganDonor;
import Business.OrganDonation.OrganDonorDirectory;
import Business.OrganDonation.OrganRecipient;
import Business.OrganDonation.OrganRecipientDirectory;
import Business.Organization.OrganBankOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrganAvailableRequest;
import Business.WorkQueue.OrganRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshayasuresh
 */
public class ManageOrganRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganRequestJPanel
     */
    private JPanel userProcessContainer;
    private OrganBankOrg organization;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private OrganRecipientDirectory ord;
    private OrganDonorDirectory odd;
    private Enterprise enterprise;
 

    public ManageOrganRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, OrganBankOrg organization, EcoSystem ecosystem, Enterprise enterprise) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
            this.organization = (OrganBankOrg)organization;
            this.ecosystem = ecosystem;
            this.userAccount = userAccount;
            this.enterprise = enterprise;
            ord = new OrganRecipientDirectory();
            odd = new OrganDonorDirectory();
            populateOrganRequestTable();
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
        organRequestTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        findOrganBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        organAvailableTable = new javax.swing.JTable();
        getOrganBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        organRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Hospital", "Doctor No", "Organ needed", "Blood Type", "HLA Type", "Medical ID", "Priority", "Deadline", "Waitlist Number", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organRequestTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(370, 210, 888, 224);

        backBtn.setBackground(new java.awt.Color(255, 204, 51));
        backBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(0, 6, 139, 40);

        findOrganBtn.setBackground(new java.awt.Color(255, 204, 51));
        findOrganBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        findOrganBtn.setText("Find Organ");
        findOrganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findOrganBtnActionPerformed(evt);
            }
        });
        add(findOrganBtn);
        findOrganBtn.setBounds(700, 460, 164, 40);

        organAvailableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Organ", "Medical ID", "Blood Type", "HLA Type", "Available until", "Sender", "Organisation", "Sender's No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(organAvailableTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(470, 540, 650, 166);

        getOrganBtn.setBackground(new java.awt.Color(255, 204, 51));
        getOrganBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        getOrganBtn.setText("Get Organ");
        getOrganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOrganBtnActionPerformed(evt);
            }
        });
        add(getOrganBtn);
        getOrganBtn.setBounds(700, 730, 164, 40);

        refreshBtn.setBackground(new java.awt.Color(255, 204, 51));
        refreshBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn);
        refreshBtn.setBounds(1130, 140, 164, 39);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -200, 1400, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void findOrganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findOrganBtnActionPerformed
        // TODO add your handling code here:
        
          int selectedRow = organRequestTable.getSelectedRow();
            if (selectedRow < 0){
                JOptionPane.showMessageDialog(null,"Select atleast one row");
                return;
            }
          populateOrganAvailableTable(selectedRow);
        
    }//GEN-LAST:event_findOrganBtnActionPerformed

    private void getOrganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOrganBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = organAvailableTable.getSelectedRow();
        int selectedRow1 = organRequestTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Select atleast one row in below table");
            return;
        }
        if (selectedRow1 < 0){
            JOptionPane.showMessageDialog(null,"Select atleast one row in above table");
            return;
        }
         OrganAvailableRequest request = (OrganAvailableRequest)organAvailableTable.getValueAt(selectedRow, 8);
         OrganRequest aboveRequest = (OrganRequest)organRequestTable.getValueAt(selectedRow1,12);
         int donorID = request.getMedicalID();
         String organ =  ((OrganRequest) aboveRequest).getOrgansNeeded();
         ((OrganRequest) aboveRequest).setDonorID(donorID);
         aboveRequest.setStatus("Organ procured");
         aboveRequest.setReceiver(userAccount);
         int medID = aboveRequest.getMedicalID();
         organHandling(medID,donorID,organ);
         organization.getWorkQueue().removeWorkRequest(aboveRequest);
    }//GEN-LAST:event_getOrganBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateOrganRequestTable();
    }//GEN-LAST:event_refreshBtnActionPerformed
    private void populateOrganRequestTable() {
        
        DefaultTableModel model = (DefaultTableModel) organRequestTable.getModel();
        model.setRowCount(0);
       
        for (WorkRequest r : organization.getWorkQueue().getWorkRequestList()){
            
                Object[] row = new Object[13];
                row[0] = r.getSender().getEmployee().getFirstName();
                row[1] = r.getOrganisation();
                row[2] = r.getSenderNo();
                row[3] = ((OrganRequest) r).getOrgansNeeded();
                row[5] = ((OrganRequest) r).getBloodGrp();
                row[6] = ((OrganRequest) r).getHlaType();
                row[7] =   r.getMedicalID();
                row[8] = ((OrganRequest) r).getPriority();
                row[9] = ((OrganRequest) r).getDeadline();
                row[10] = ((OrganRequest) r).getWaitlistNo();
                row[11] = r.getStatus();
                row[12] = r;
                model.addRow(row);
                    
            } 
    }

    private void populateOrganAvailableTable(int selectedRow) {
         OrganRequest request = (OrganRequest)organRequestTable.getValueAt(selectedRow, 12);
         String organNeeded = request.getOrgansNeeded();
         DefaultTableModel model = (DefaultTableModel) organAvailableTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest r : organization.getWorkQueue().getWorkRequestList()){
            for(String organ : ((OrganAvailableRequest) r).getOrgansAvailable()){
                if(organ.equalsIgnoreCase(organNeeded)){
                Object[] row = new Object[9];
                
                row[0] = organ;
                row[1] = r.getMedicalID();
                row[2] = ((OrganAvailableRequest) r).getBloodGrp();
                row[3] = ((OrganAvailableRequest) r).getHlaType();
                row[4] = ((OrganAvailableRequest) r).getAvailUntil(); 
                row[5] = r.getSender().getEmployee().getFirstName();
                row[6] = r.getOrganisation();
                row[7] = r.getSenderNo();
                row[8] = r;
                model.addRow(row);
                    
                }
            }
               
        } 
            
            
    }
    private void organHandling(int medID, int donorID, String organ) {
        for(OrganRecipient or : ord.getOrganRecipientList()){
            if(or.getMedicalID()==medID && or.getOrgan().equalsIgnoreCase(organ)){
                or.setDonorID(donorID);
            }
        }
       for(OrganDonor od : odd.getOrganDonorList()){
           if(od.getMedicalID()==donorID){
               if(od.getOrgans().contains(organ)){
                   od.getOrgans().remove(organ);
               }
           }
       }
            
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton findOrganBtn;
    private javax.swing.JButton getOrganBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable organAvailableTable;
    private javax.swing.JTable organRequestTable;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables

    

    

    
}
