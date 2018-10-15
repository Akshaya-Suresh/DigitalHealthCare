/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganBank.OrganRegistration;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.MedicalId.MedicalIdDirectory;
import Business.MedicalId.MedicalRecord;
import Business.Network.Network;
import Business.OrganDonation.OrganRecipient;
import Business.OrganDonation.OrganRecipientDirectory;
import Business.Organization.OrganBankOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akshayasuresh
 */
public class RecipientRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecipientRegistrationJPanel
     */
   private JPanel userProcessContainer;
    private OrganBankOrg organization;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
     private MedicalIdDirectory medicalRecords;
     private OrganRecipientDirectory ord;
     int checkRequest=0;
  

    public RecipientRegistrationJPanel(JPanel userProcessContainer, UserAccount userAccount, OrganBankOrg organization, EcoSystem ecosystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
            this.organization = (OrganBankOrg)organization;
            this.ecosystem = ecosystem;
            this.userAccount = userAccount;
            
              medicalRecords = new MedicalIdDirectory();
               HospitalEnterprise enterprise = null;
            
            for(Network network: ecosystem.getNetworkList()){
                for(Enterprise centerprise: network.getEnterpriseDirectory().getEnterpriseList()){
                    if(centerprise instanceof HospitalEnterprise){
                        enterprise= (HospitalEnterprise)centerprise;
                        for(MedicalRecord mr : enterprise.getMedicalIdDirec().getMedicalIdList()){
                            medicalRecords.getMedicalIdList().add(mr);
                    }
                    }
                }
            }
             for(MedicalRecord m: medicalRecords.getMedicalIdList()){
                    System.out.println(m.getMedicalId());
                }
            
            registerBtn.setVisible(false);
            updateBtn.setVisible(false);
            withdrawBtn.setVisible(false);
            populateGenderComboBox();
            populateStateComboBox();
            populateOrganComboBox();
            ord = new OrganRecipientDirectory();
    }

   
     private void populateGenderComboBox() {
            genderComboBox.removeAllItems();
            String[] sex = {"Male", "Female", "Others" };
            for(String s: sex){
                genderComboBox.addItem(s);
            }
        }

     private void populateStateComboBox() {
         stateComboBox.removeAllItems();
          String[] states= {
        "Alabama", "Alaska", "Arizona", "Arkansas", "California",
        "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
        "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
        "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
        "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
        "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
        "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
        "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
        "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
        "Wisconsin", "Wyoming"
    };
          for(String state: states){
          stateComboBox.addItem(state);
          }
 
     }
      private void populateOrganComboBox() {
            organComboBox.removeAllItems();
            String[] organs = {"R.Lung", "L.Lung", "Pancreas", "Intestine","Heart", "L.Kidney", "R.Kidney","Liver" };
            for(String o: organs){
                organComboBox.addItem(o);
            }
        }
      private void clearFields() {
                medicalIdTxt.setText("");
                firstnameTxt.setText("");
                lastNameTxt.setText("");
                
                dobTxt.setText("");
                bloodTxt.setText("");
                hlaTypeTxt.setText("");
                emailTxt.setText("");
                addressTxt.setText("");
                cityTxt.setText("");
                
                zipTxt.setText("");
                
                emergencyContactTxt.setText("");
                emergencyNoTxt.setText("");
                refDrTxt.setText("");
                refDrHosTxt.setText("");
                refDrNetworkTxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastnameLbl = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        dobLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        sexLbl = new javax.swing.JLabel();
        regisLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        dobTxt = new javax.swing.JTextField();
        firstnameLbl4 = new javax.swing.JLabel();
        bloodTxt = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        addressTxt = new javax.swing.JTextField();
        firstnameLbl1 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        firstnameLbl2 = new javax.swing.JLabel();
        zipTxt = new javax.swing.JTextField();
        firstnameLbl3 = new javax.swing.JLabel();
        organComboBox = new javax.swing.JComboBox<>();
        regisLbl2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        medicalIdTxt = new javax.swing.JTextField();
        firstnameLbl = new javax.swing.JLabel();
        firstnameTxt = new javax.swing.JTextField();
        agreeCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        registerBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        firstnameLbl6 = new javax.swing.JLabel();
        hlaTypeTxt = new javax.swing.JTextField();
        firstnameLbl7 = new javax.swing.JLabel();
        withdrawBtn = new javax.swing.JButton();
        firstnameLbl5 = new javax.swing.JLabel();
        emergencyContactTxt = new javax.swing.JTextField();
        firstnameLbl8 = new javax.swing.JLabel();
        emergencyNoTxt = new javax.swing.JTextField();
        firstnameLbl9 = new javax.swing.JLabel();
        refDrNetworkTxt = new javax.swing.JTextField();
        stateComboBox = new javax.swing.JComboBox<>();
        refDrHosTxt = new javax.swing.JTextField();
        refDrTxt = new javax.swing.JTextField();
        firstnameLbl10 = new javax.swing.JLabel();
        firstnameLbl11 = new javax.swing.JLabel();
        firstnameLbl12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lastnameLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lastnameLbl.setText("Last Name ");
        add(lastnameLbl);
        lastnameLbl.setBounds(478, 91, 90, 30);

        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });
        add(lastNameTxt);
        lastNameTxt.setBounds(478, 128, 160, 30);

        dobLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dobLbl.setText("Date Of Birth ");
        add(dobLbl);
        dobLbl.setBounds(176, 233, 123, 30);

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        add(emailTxt);
        emailTxt.setBounds(183, 341, 456, 30);

        sexLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sexLbl.setText("Gender");
        add(sexLbl);
        sexLbl.setBounds(176, 164, 59, 30);

        regisLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        regisLbl.setText("Email");
        add(regisLbl);
        regisLbl.setBounds(176, 305, 168, 30);

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

        dobTxt.setText("MM-DD-YYYY");
        dobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTxtActionPerformed(evt);
            }
        });
        add(dobTxt);
        dobTxt.setBounds(182, 269, 457, 30);

        firstnameLbl4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl4.setText("Blood Group");
        add(firstnameLbl4);
        firstnameLbl4.setBounds(710, 120, 90, 30);

        bloodTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTxtActionPerformed(evt);
            }
        });
        add(bloodTxt);
        bloodTxt.setBounds(720, 160, 210, 30);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(genderComboBox);
        genderComboBox.setBounds(176, 200, 462, 27);

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt);
        addressTxt.setBounds(183, 419, 456, 30);

        firstnameLbl1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl1.setText("State");
        add(firstnameLbl1);
        firstnameLbl1.setBounds(333, 456, 90, 30);

        cityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTxtActionPerformed(evt);
            }
        });
        add(cityTxt);
        cityTxt.setBounds(182, 492, 145, 30);

        firstnameLbl2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl2.setText("Zip code");
        add(firstnameLbl2);
        firstnameLbl2.setBounds(510, 456, 90, 30);

        zipTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipTxtActionPerformed(evt);
            }
        });
        add(zipTxt);
        zipTxt.setBounds(510, 492, 129, 30);

        firstnameLbl3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl3.setText("City");
        add(firstnameLbl3);
        firstnameLbl3.setBounds(176, 456, 90, 30);

        organComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organComboBox);
        organComboBox.setBounds(720, 390, 450, 27);

        regisLbl2.setFont(regisLbl2.getFont().deriveFont((regisLbl2.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, regisLbl2.getFont().getSize()+1));
        regisLbl2.setText("Street Address");
        add(regisLbl2);
        regisLbl2.setBounds(176, 383, 168, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Medical Id ");
        add(jLabel4);
        jLabel4.setBounds(252, 43, 90, 30);

        medicalIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalIdTxtActionPerformed(evt);
            }
        });
        add(medicalIdTxt);
        medicalIdTxt.setBounds(362, 43, 160, 30);

        firstnameLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl.setText("First Name ");
        add(firstnameLbl);
        firstnameLbl.setBounds(182, 91, 90, 30);

        firstnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTxtActionPerformed(evt);
            }
        });
        add(firstnameTxt);
        firstnameTxt.setBounds(182, 128, 160, 30);

        agreeCheckBox.setText(" AGREE TO THE TERMS AND CONDITIONS");
        agreeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeCheckBoxActionPerformed(evt);
            }
        });
        add(agreeCheckBox);
        agreeCheckBox.setBounds(720, 420, 291, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("This registration is a binding, legal document of organ recipient\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(180, 880, 441, 29);

        registerBtn.setBackground(new java.awt.Color(255, 204, 51));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn);
        registerBtn.setBounds(10, 50, 160, 40);

        updateBtn.setBackground(new java.awt.Color(255, 204, 51));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(340, 920, 120, 30);

        firstnameLbl6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl6.setText("HLA Type");
        add(firstnameLbl6);
        firstnameLbl6.setBounds(940, 120, 90, 30);

        hlaTypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlaTypeTxtActionPerformed(evt);
            }
        });
        add(hlaTypeTxt);
        hlaTypeTxt.setBounds(950, 160, 220, 30);

        firstnameLbl7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl7.setText("Organ needed");
        add(firstnameLbl7);
        firstnameLbl7.setBounds(720, 350, 159, 30);

        withdrawBtn.setBackground(new java.awt.Color(255, 204, 51));
        withdrawBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        withdrawBtn.setText("Withdraw");
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });
        add(withdrawBtn);
        withdrawBtn.setBounds(470, 920, 120, 30);

        firstnameLbl5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl5.setText("Emergency Contact");
        add(firstnameLbl5);
        firstnameLbl5.setBounds(720, 200, 170, 30);

        emergencyContactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyContactTxtActionPerformed(evt);
            }
        });
        add(emergencyContactTxt);
        emergencyContactTxt.setBounds(720, 230, 210, 30);

        firstnameLbl8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl8.setText("Emergency Contact No");
        add(firstnameLbl8);
        firstnameLbl8.setBounds(930, 200, 170, 40);

        emergencyNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyNoTxtActionPerformed(evt);
            }
        });
        add(emergencyNoTxt);
        emergencyNoTxt.setBounds(950, 230, 220, 30);

        firstnameLbl9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl9.setText(" Doctor");
        add(firstnameLbl9);
        firstnameLbl9.setBounds(720, 290, 159, 30);

        refDrNetworkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refDrNetworkTxtActionPerformed(evt);
            }
        });
        add(refDrNetworkTxt);
        refDrNetworkTxt.setBounds(1020, 320, 150, 30);

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(stateComboBox);
        stateComboBox.setBounds(333, 495, 165, 27);

        refDrHosTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refDrHosTxtActionPerformed(evt);
            }
        });
        add(refDrHosTxt);
        refDrHosTxt.setBounds(870, 320, 150, 30);

        refDrTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refDrTxtActionPerformed(evt);
            }
        });
        add(refDrTxt);
        refDrTxt.setBounds(720, 320, 150, 30);

        firstnameLbl10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl10.setText("Hospital");
        add(firstnameLbl10);
        firstnameLbl10.setBounds(860, 290, 159, 30);

        firstnameLbl11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl11.setText("Network");
        add(firstnameLbl11);
        firstnameLbl11.setBounds(1020, 290, 159, 30);

        firstnameLbl12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl12.setText("Referred by");
        add(firstnameLbl12);
        firstnameLbl12.setBounds(720, 260, 159, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -190, 1330, 1510);
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void dobTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTxtActionPerformed

    }//GEN-LAST:event_dobTxtActionPerformed

    private void bloodTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void cityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTxtActionPerformed

    private void zipTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTxtActionPerformed

    private void firstnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTxtActionPerformed

    private void agreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeCheckBoxActionPerformed
        // TODO add your handling code here:
         if(agreeCheckBox.isSelected()){
            registerBtn.setVisible(true);
            updateBtn.setVisible(true);
            withdrawBtn.setVisible(true);
        }
        if(!agreeCheckBox.isSelected()){
            registerBtn.setVisible(false);
            updateBtn.setVisible(false);
            withdrawBtn.setVisible(false);
        }
      
        
    }//GEN-LAST:event_agreeCheckBoxActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
 
        
        
        String organ = (String) organComboBox.getSelectedItem();
        int id = Integer.parseInt(medicalIdTxt.getText());
        
        for(OrganRecipient or1 : ord.getOrganRecipientList()){
            if(or1.getMedicalID()==id && or1.getOrgan()== organ){
                checkRequest=1;
                JOptionPane.showMessageDialog(null,"Already the request for "+organ+" has been placed");
            }
        }
        if(checkRequest==0){
       OrganRecipient or = ord.addOrganRecipient();
       SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
        Date dob = new Date();
        try {
            dob = ft.parse(dobTxt.getText());
        } catch (ParseException ex) {
            Logger.getLogger(DonorRegistrationJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        or.setFname(firstnameTxt.getText());
        or.setLname(lastNameTxt.getText());
        or.setMedicalID(id);
        or.setAddress(addressTxt.getText());
        or.setBloodGrp(bloodTxt.getText());
        or.setHlaType(hlaTypeTxt.getText());
        or.setCity(cityTxt.getText());
        or.setState((String) stateComboBox.getSelectedItem());
        or.setZip(Integer.parseInt(zipTxt.getText()));
        or.setDob(dob);
        or.setEmailID(emailTxt.getText());
        or.setEmergencyContactName(emergencyContactTxt.getText());
        or.setEmergencyContactNo(Long.parseLong(emergencyNoTxt.getText()));
        or.setGender((String) genderComboBox.getSelectedItem());
        or.setOrgan(organ);
        or.setRefDr(refDrTxt.getText());
        or.setRefDrHospital(refDrHosTxt.getText());
        or.setRefDrNetwork(refDrNetworkTxt.getText());
        
        JOptionPane.showMessageDialog(null, "Your registered successfully. Note your waitlist number:"+or.getWaitlistNo());
        
        }
    
    }//GEN-LAST:event_registerBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
        organComboBox.setVisible(false);
        int id = Integer.parseInt(medicalIdTxt.getText());
        for(OrganRecipient or : ord.getOrganRecipientList()){
            if(or.getMedicalID()== id){
               String organ = or.getOrgan();
               organComboBox.setSelectedItem(organ);
       SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
        Date dob = new Date();
        try {
            dob = ft.parse(dobTxt.getText());
        } catch (ParseException ex) {
            Logger.getLogger(DonorRegistrationJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        or.setFname(firstnameTxt.getText());
        or.setLname(lastNameTxt.getText());
        or.setMedicalID(id);
        or.setAddress(addressTxt.getText());
        or.setBloodGrp(bloodTxt.getText());
        or.setHlaType(hlaTypeTxt.getText());
        or.setCity(cityTxt.getText());
        or.setState((String) stateComboBox.getSelectedItem());
        or.setZip(Integer.parseInt(zipTxt.getText()));
        or.setDob(dob);
        or.setEmailID(emailTxt.getText());
        or.setEmergencyContactName(emergencyContactTxt.getText());
        or.setEmergencyContactNo(Long.parseLong(emergencyNoTxt.getText()));
        or.setGender((String) genderComboBox.getSelectedItem());
        or.setOrgan(organ);
        or.setRefDr(refDrTxt.getText());
        or.setRefDrHospital(refDrHosTxt.getText());
        or.setRefDrNetwork(refDrNetworkTxt.getText());
               
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void hlaTypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlaTypeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hlaTypeTxtActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        // TODO add your handling code here:
         int id = Integer.parseInt(medicalIdTxt.getText());
        for(OrganRecipient or : ord.getOrganRecipientList()){
           if(id == or.getMedicalID()){
               JOptionPane.showConfirmDialog(null,"Are you sure?");
               int answer = 0;
                 if (answer == JOptionPane.YES_OPTION) {
                       ord.deleteOrganRecipient(or);
                       break;
                } else if (answer == JOptionPane.NO_OPTION) {
                    break;
                 }
               
           }
        }
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void emergencyContactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyContactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyContactTxtActionPerformed

    private void emergencyNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyNoTxtActionPerformed

    private void refDrNetworkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refDrNetworkTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refDrNetworkTxtActionPerformed

    private void refDrHosTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refDrHosTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refDrHosTxtActionPerformed

    private void refDrTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refDrTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refDrTxtActionPerformed

    private void medicalIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalIdTxtActionPerformed
        // TODO add your handling code here:
         int check=0;
         for(MedicalRecord mr : medicalRecords.getMedicalIdList()){
            if(medicalIdTxt.equals(mr.getMedicalId())){
               check=1;
               firstnameTxt.setText(mr.getFirstName());
               lastNameTxt.setText(mr.getLastName());
               genderComboBox.setSelectedItem(mr.getSex());
               dobTxt.setText(mr.getDateOfBirth().toString());
               bloodTxt.setText(mr.getBloodGroup());
               break;
           }
          
        }
        for(OrganRecipient or : ord.getOrganRecipientList()){
            if(medicalIdTxt.equals(or.getMedicalID())){
                check=1;
                firstnameTxt.setText(or.getFname());
                lastNameTxt.setText(or.getLname());
                genderComboBox.setSelectedItem(or.getGender());
                dobTxt.setText(or.getDob().toString());
                bloodTxt.setText(or.getBloodGrp());
                hlaTypeTxt.setText(or.getHlaType());
                emailTxt.setText(or.getEmailID());
                addressTxt.setText(or.getAddress());
                cityTxt.setText(or.getCity());
                int zip = or.getZip();
                zipTxt.setText(String.valueOf(zip));
                stateComboBox.setSelectedItem(or.getState());
                emergencyContactTxt.setText(or.getEmergencyContactName());
                emergencyNoTxt.setText(String.valueOf(or.getEmergencyContactNo()));
                refDrTxt.setText(or.getRefDr());
                refDrHosTxt.setText(or.getRefDrHospital());
                refDrNetworkTxt.setText(or.getRefDrNetwork());
                break;
            }
        }
        
         if(check==0){
               JOptionPane.showMessageDialog(null, "Enter a valid Medical ID");
           }
      
    
    }//GEN-LAST:event_medicalIdTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bloodTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField emergencyContactTxt;
    private javax.swing.JTextField emergencyNoTxt;
    private javax.swing.JLabel firstnameLbl;
    private javax.swing.JLabel firstnameLbl1;
    private javax.swing.JLabel firstnameLbl10;
    private javax.swing.JLabel firstnameLbl11;
    private javax.swing.JLabel firstnameLbl12;
    private javax.swing.JLabel firstnameLbl2;
    private javax.swing.JLabel firstnameLbl3;
    private javax.swing.JLabel firstnameLbl4;
    private javax.swing.JLabel firstnameLbl5;
    private javax.swing.JLabel firstnameLbl6;
    private javax.swing.JLabel firstnameLbl7;
    private javax.swing.JLabel firstnameLbl8;
    private javax.swing.JLabel firstnameLbl9;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField hlaTypeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel lastnameLbl;
    private javax.swing.JTextField medicalIdTxt;
    private javax.swing.JComboBox<String> organComboBox;
    private javax.swing.JTextField refDrHosTxt;
    private javax.swing.JTextField refDrNetworkTxt;
    private javax.swing.JTextField refDrTxt;
    private javax.swing.JLabel regisLbl;
    private javax.swing.JLabel regisLbl2;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton withdrawBtn;
    private javax.swing.JTextField zipTxt;
    // End of variables declaration//GEN-END:variables
}
