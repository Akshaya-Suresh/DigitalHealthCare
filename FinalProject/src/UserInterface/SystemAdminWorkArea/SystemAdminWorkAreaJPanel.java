/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import UserInterface.AddMedicalId.AddMedicalIdWorkAreaJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author akshayasuresh
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
        JPanel userProcessContainer;
    EcoSystem system;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,
    EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system= system;
         populateTree();
    }
    
     public void populateTree()
    {
      DefaultTreeModel dtm = (DefaultTreeModel) jTree.getModel();

        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) dtm.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);

                }
            }
        }
        dtm.reload();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        manageEnterprise = new javax.swing.JButton();
        manageNetwork = new javax.swing.JButton();
        manageEnterAdmin = new javax.swing.JButton();
        selectedNodeJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Admin Panel");
        add(jLabel3);
        jLabel3.setBounds(730, 10, 340, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 140, 780);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(null);

        manageEnterprise.setBackground(new java.awt.Color(255, 204, 51));
        manageEnterprise.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        manageEnterprise.setText("Manage Enterprise");
        manageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(manageEnterprise);
        manageEnterprise.setBounds(670, 180, 200, 40);

        manageNetwork.setBackground(new java.awt.Color(255, 204, 51));
        manageNetwork.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        manageNetwork.setText("Manage NetWork");
        manageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(manageNetwork);
        manageNetwork.setBounds(400, 180, 210, 40);

        manageEnterAdmin.setBackground(new java.awt.Color(255, 204, 51));
        manageEnterAdmin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        manageEnterAdmin.setText("Manage Enterprise Admin");
        manageEnterAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterAdminActionPerformed(evt);
            }
        });
        jPanel2.add(manageEnterAdmin);
        manageEnterAdmin.setBounds(540, 280, 210, 40);

        selectedNodeJLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        selectedNodeJLabel.setText("<View Selected Node>");
        jPanel2.add(selectedNodeJLabel);
        selectedNodeJLabel.setBounds(720, 80, 180, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Selected Node");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(560, 80, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, -10, 1410, 780);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1);
        jSplitPane1.setBounds(-1, 5, 1520, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkActionPerformed
        ManageNetworkJPanel manageNetWorkJPanel = new ManageNetworkJPanel(userProcessContainer,system,selectedNodeJLabel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", manageNetWorkJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
         DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
       if(selectedNode != null)
       {
           selectedNodeJLabel.setText(selectedNode.toString());
       }
    }//GEN-LAST:event_jTreeValueChanged

    private void manageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseActionPerformed
         ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer,system,selectedNodeJLabel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", manageEnterpriseJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseActionPerformed

    private void manageEnterAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterAdminActionPerformed
           ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer,system,selectedNodeJLabel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", manageEnterpriseAdminJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JButton manageEnterAdmin;
    private javax.swing.JButton manageEnterprise;
    private javax.swing.JButton manageNetwork;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
