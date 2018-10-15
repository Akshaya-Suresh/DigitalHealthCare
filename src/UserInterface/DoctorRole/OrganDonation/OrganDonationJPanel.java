/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole.OrganDonation;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.OrganDonation.OrganDonor;
import Business.OrganDonation.OrganDonorDirectory;
import Business.OrganDonation.OrganRecipient;
import Business.OrganDonation.OrganRecipientDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshayasuresh
 */
public class OrganDonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganDonationJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    private OrganDonorDirectory odd;
    private OrganRecipientDirectory ord;
    int medicalID;
    public OrganDonationJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise= enterprise;
        this.userAccount = userAccount;
       
        odd= new OrganDonorDirectory();
        ord= new OrganRecipientDirectory();
        registerOrganBtn.setVisible(false);
        requestOrganBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerOrganBtn = new javax.swing.JButton();
        requestOrganBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        midTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        registerOrganBtn.setBackground(new java.awt.Color(255, 204, 51));
        registerOrganBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        registerOrganBtn.setText("Register Organ");
        registerOrganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerOrganBtnActionPerformed(evt);
            }
        });
        add(registerOrganBtn);
        registerOrganBtn.setBounds(200, 200, 210, 40);

        requestOrganBtn.setBackground(new java.awt.Color(255, 204, 51));
        requestOrganBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        requestOrganBtn.setText("Request Organ");
        requestOrganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestOrganBtnActionPerformed(evt);
            }
        });
        add(requestOrganBtn);
        requestOrganBtn.setBounds(201, 266, 210, 40);

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

        midTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midTxtActionPerformed(evt);
            }
        });
        add(midTxt);
        midTxt.setBounds(200, 130, 230, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Medical Id ");
        add(jLabel6);
        jLabel6.setBounds(100, 140, 79, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(-10, -30, 660, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void registerOrganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerOrganBtnActionPerformed
        // TODO add your handling code here:
        OrganRegisterJPanel organRegisterJPanel = new OrganRegisterJPanel(userProcessContainer, enterprise,userAccount,medicalID);
        userProcessContainer.add("organRegisterJPanel", organRegisterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_registerOrganBtnActionPerformed

    private void requestOrganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestOrganBtnActionPerformed
        // TODO add your handling code here:
        OrganRequestJPanel organRequestJPanel = new OrganRequestJPanel(userProcessContainer, enterprise,userAccount,medicalID);
        userProcessContainer.add("organRequestJPanel", organRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_requestOrganBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void midTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midTxtActionPerformed
        // TODO add your handling code here:
            int medicalID = Integer.parseInt(midTxt.getText());
            for(OrganDonor od: odd.getOrganDonorList()){
            if(medicalID == od.getMedicalID()){
                registerOrganBtn.setVisible(true);
                break;
                }
            }
            for(OrganRecipient or: ord.getOrganRecipientList()){
            if(medicalID == or.getMedicalID()){
                requestOrganBtn.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_midTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField midTxt;
    private javax.swing.JButton registerOrganBtn;
    private javax.swing.JButton requestOrganBtn;
    // End of variables declaration//GEN-END:variables
}
