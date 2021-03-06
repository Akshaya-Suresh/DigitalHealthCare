/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bloodbank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodbankOrg;
import Business.UserAccount.UserAccount;
import Business.bloodbankmembers.BloodBankmember;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Registeredmemberjpanel extends javax.swing.JPanel {

    /**
     * Creates new form Registeredmemberjpanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private BloodbankOrg bloodbankOrg;
    private Enterprise enterprise;
    private EcoSystem business;

    Registeredmemberjpanel(JPanel userProcessContainer, UserAccount account, BloodbankOrg bloodbankOrg, Enterprise enterprise, EcoSystem business) {
        initComponents();
              this.userProcessContainer=userProcessContainer;
          this.account=account;
          this.enterprise=enterprise;
          this.business=business;
          this.bloodbankOrg=bloodbankOrg;
          populate();
    }
    
        public void populate(){
               DefaultTableModel model = (DefaultTableModel)Registeredmembersjtable.getModel();
        
       model.setRowCount(0);
        
      for(BloodBankmember bbm :enterprise.getBloodbankmembersdirectory().getBloodbankdirectory() ){
            
            
                Object[] row = new Object[2];
                row[0] = bbm.getMedicalId();
                row[1] =bbm.getFirstName();
                model.addRow(row);
            
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
        Registeredmembersjtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(null);

        Registeredmembersjtable.setBackground(new java.awt.Color(0, 0, 0));
        Registeredmembersjtable.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Registeredmembersjtable.setForeground(new java.awt.Color(255, 255, 255));
        Registeredmembersjtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MedicalID", "First Name"
            }
        ));
        jScrollPane1.setViewportView(Registeredmembersjtable);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 180, 452, 187);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(40, 40, 110, 40);

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-240, -90, 1740, 1330);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Registeredmembersjtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
