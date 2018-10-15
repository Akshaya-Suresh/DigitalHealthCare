/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.MapLoction.MapLocation;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Niranjanii
 */
public class EmergencyModeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyModeJPanel
     */
    
     private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
     private EcoSystem ecoSystem;
     boolean isMedicalId;
    public EmergencyModeJPanel(EcoSystem system,JPanel userProcessContainer, UserAccount account, DoctorOrganization doctorOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = doctorOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = system;
         isMedicalId= false;
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
        medicalIdTxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Medical Id :");
        add(jLabel4);
        jLabel4.setBounds(600, 250, 90, 30);

        medicalIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalIdTxtActionPerformed(evt);
            }
        });
        add(medicalIdTxt);
        medicalIdTxt.setBounds(710, 250, 160, 30);

        loginBtn.setBackground(new java.awt.Color(255, 204, 51));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        loginBtn.setText("Go");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn);
        loginBtn.setBounds(900, 250, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -100, 1740, 1330);
    }// </editor-fold>//GEN-END:initComponents

    private void medicalIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalIdTxtActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String id= medicalIdTxt.getText();
        boolean granted = false;
        for(Network network:ecoSystem.getNetworkList())
        {
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(enterprise instanceof HospitalEnterprise)
                {
                    for(Organization org :((HospitalEnterprise) enterprise).getOrganizationDirectory().getOrganizationList())
                    {
                        if(org instanceof PatientOrganization)
                        {
                            for(UserAccount userAccount:((PatientOrganization)org).getUserAccountDirectory().getUserAccountList())
                            {
                                if(userAccount.getPatient().getMedicalRecord().getMedicalId() == Integer.parseInt(id))
                                {
                                    final MapLocation mapView = new MapLocation(ecoSystem,id);

                                        JFrame frame = new JFrame("Geocoder");

                                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                                        frame.add(mapView, BorderLayout.CENTER);
                                        frame.setSize(700, 500);
                                        frame.setLocationRelativeTo(null);
                                        frame.setVisible(true); 
                                    
                                }
                            }
                        }

                    }
                }
            }
        }

    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField medicalIdTxt;
    // End of variables declaration//GEN-END:variables
}