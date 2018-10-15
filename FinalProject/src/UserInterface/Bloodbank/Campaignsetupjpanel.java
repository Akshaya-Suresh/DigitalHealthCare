/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bloodbank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodbankOrg;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodcampRequest;
import Business.bloodbankmembers.BloodBankmember;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Campaignsetupjpanel extends javax.swing.JPanel {

    /**
     * Creates new form Campaignsetupjpanel
     */
   private JPanel userProcessContainer;
    private UserAccount account;
    private BloodbankOrg bloodbankOrg;
    private Enterprise enterprise;
    private EcoSystem business;
    Campaignsetupjpanel(JPanel userProcessContainer, UserAccount account, BloodbankOrg bloodbankOrg, Enterprise enterprise, EcoSystem business) {
         initComponents();
          this.userProcessContainer=userProcessContainer;
          this.account=account;
          this.enterprise=enterprise;
          this.business=business;
          this.bloodbankOrg=bloodbankOrg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Date:");
        add(jLabel1);
        jLabel1.setBounds(138, 58, 70, 20);
        add(jTextField1);
        jTextField1.setBounds(226, 55, 120, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Location:");
        add(jLabel2);
        jLabel2.setBounds(128, 130, 80, 20);
        add(jTextField2);
        jTextField2.setBounds(226, 127, 120, 20);

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(30, 20, 63, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(226, 205, 90, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, -100, 1740, 1330);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
           
         BloodcampRequest request = new BloodcampRequest();
         SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        
        request.setMessage("Blood camp");
        request.setSender(account);
        request.setLocation(jTextField2.getText());
        request.setStatus("Pending");
        request.setResult("");
        
        String dateInString = jTextField1.getText();
        try{
        Date date = formatter.parse(dateInString);
        request.setDate(date);
        }
         catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Enter the date in proper format");
        }

      
        
        request.setStatus("Sent");
        
            for(BloodBankmember bbm:enterprise.getBloodbankmembersdirectory().getBloodbankdirectory()){
                UserAccount ua=new UserAccount();
                ua=bbm.getUseraccount();
                ua.getWorkQueue().getWorkRequestList().add(request);
            }
     
        
            
            
            account.getWorkQueue().getWorkRequestList().add(request);
        
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Enter all details");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter the date in dd-mm-yyyy format");
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
