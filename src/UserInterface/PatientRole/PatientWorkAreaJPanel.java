/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshayasuresh
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PatientOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
 
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PatientOrganization patientOrg, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = patientOrg;
        this.enterprise = enterprise;
        this.userAccount = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editBtn = new javax.swing.JButton();
        notificationBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        viewBtn1 = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();


        setLayout(null);

        editBtn.setBackground(new java.awt.Color(255, 204, 51));
        editBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        editBtn.setText("Edit Profile");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        add(editBtn);
        editBtn.setBounds(20, 30, 210, 40);

        notificationBtn.setBackground(new java.awt.Color(255, 204, 51));
        notificationBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        notificationBtn.setText("Notifications");
        notificationBtn.setToolTipText("");
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });
        add(notificationBtn);
        notificationBtn.setBounds(560, 30, 210, 40);

        viewBtn.setBackground(new java.awt.Color(255, 204, 51));
        viewBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        viewBtn.setText("Donate Blood");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn);

        viewBtn.setBounds(300, 150, 210, 40);


        viewBtn1.setBackground(new java.awt.Color(255, 204, 51));
        viewBtn1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        viewBtn1.setText("View Medical Records");
        viewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn1ActionPerformed(evt);
            }
        });
        add(viewBtn1);
        viewBtn1.setBounds(290, 30, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -100, 1740, 1330);

    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
        // TODO add your handling code here:
       NotificationJPanel notificationJPanel = new NotificationJPanel(userProcessContainer,userAccount,organization,enterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("NotificationJPanel", notificationJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_notificationBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        Bloodregisterjpanel bloodregisterjpanel = new Bloodregisterjpanel(userProcessContainer,userAccount,organization,enterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("Bloodregisterjpanel", bloodregisterjpanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void viewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JButton notificationBtn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewBtn1;
    // End of variables declaration//GEN-END:variables
}
