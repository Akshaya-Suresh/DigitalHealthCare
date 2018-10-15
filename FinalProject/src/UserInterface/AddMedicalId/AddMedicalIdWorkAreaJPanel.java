/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AddMedicalId;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.MedicalId.MedicalIdDirectory;
import Business.MedicalId.MedicalRecord;
import Utilities.Validation;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Niranjanii
 */
public class AddMedicalIdWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addMedicalIdWorkAreaJPanel
     */
    HospitalEnterprise hosEnterprise;
    MedicalRecord medicalId;
    MedicalIdDirectory md;
    JPanel userProcessContainer;
    public AddMedicalIdWorkAreaJPanel(JPanel userProcessContainer,Enterprise enterprise,MedicalRecord medicalId) {
        initComponents();
        this.hosEnterprise = (HospitalEnterprise)enterprise;
        this.medicalId = medicalId;
        this.userProcessContainer=userProcessContainer;
        md = new MedicalIdDirectory();
        medicalIdTxt.setEnabled(false);
        firstnameTxt.setVisible(false);
        lastNameTxt.setVisible(false);
        DobTxt.setVisible(false);
        timeTxt.setVisible(false);
        addressTxt.setVisible(false);
        sexTxt.setVisible(false);

        placeOfBTxt.setVisible(false);
        fatherName.setVisible(false);
        motherNameTxt.setVisible(false);
         firstnameLbl.setVisible(false);
        pathLbl.setVisible(false);
        lastnameLbl.setVisible(false);
        sexLbl.setVisible(false);
        dobLbl.setVisible(false);
        timeLbl.setVisible(false);
        addrLbl.setVisible(false);

        pobLbl.setVisible(false);
        fatherLbl.setVisible(false);
        motherLbl.setVisible(false);
        bloodGrpLbl.setVisible(false);
        bloodGrpComboBox.setVisible(false);
        uploadBirthCer1.setVisible(false);
        pathLbl.setVisible(false);
        pathTxt.setVisible(false);
        removeFile.setVisible(false);
       populateBloodGrpComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicalIdTxt = new javax.swing.JTextField();
        generateId = new javax.swing.JButton();
        generateId1 = new javax.swing.JButton();
        generateId2 = new javax.swing.JButton();
        lastnameLbl = new javax.swing.JLabel();
        addrLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        timeTxt = new javax.swing.JTextField();
        fatherLbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        firstnameTxt = new javax.swing.JTextField();
        pathLbl = new javax.swing.JLabel();
        pobLbl = new javax.swing.JLabel();
        sexLbl = new javax.swing.JLabel();
        placeOfBTxt = new javax.swing.JTextField();
        sexTxt = new javax.swing.JTextField();
        motherLbl = new javax.swing.JLabel();
        motherNameTxt = new javax.swing.JTextField();
        DobTxt = new javax.swing.JTextField();
        dobLbl = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        timeLbl = new javax.swing.JLabel();
        removeFile = new javax.swing.JButton();
        generateId4 = new javax.swing.JButton();
        pathTxt = new javax.swing.JTextField();
        uploadBirthCer1 = new javax.swing.JButton();
        firstnameLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        bloodGrpLbl = new javax.swing.JLabel();
        bloodGrpComboBox = new javax.swing.JComboBox<>();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(null);
        add(medicalIdTxt);
        medicalIdTxt.setBounds(600, 160, 160, 30);

        generateId.setBackground(new java.awt.Color(255, 204, 51));
        generateId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        generateId.setText("Generate Id:");
        generateId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateIdActionPerformed(evt);
            }
        });
        add(generateId);
        generateId.setBounds(780, 160, 120, 30);

        generateId1.setBackground(new java.awt.Color(255, 204, 51));
        generateId1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        generateId1.setText("New Born");
        generateId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateId1ActionPerformed(evt);
            }
        });
        add(generateId1);
        generateId1.setBounds(520, 240, 120, 30);

        generateId2.setBackground(new java.awt.Color(255, 204, 51));
        generateId2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        generateId2.setText("Add");
        generateId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateId2ActionPerformed(evt);
            }
        });
        add(generateId2);
        generateId2.setBounds(570, 600, 120, 30);

        lastnameLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lastnameLbl.setText("Last Name :");
        add(lastnameLbl);
        lastnameLbl.setBounds(150, 360, 90, 30);

        addrLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        addrLbl.setText("Address :");
        add(addrLbl);
        addrLbl.setBounds(170, 480, 100, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Medical Id :");
        add(jLabel4);
        jLabel4.setBounds(490, 160, 90, 30);

        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });
        add(lastNameTxt);
        lastNameTxt.setBounds(310, 360, 160, 30);

        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTxtActionPerformed(evt);
            }
        });
        add(timeTxt);
        timeTxt.setBounds(310, 440, 160, 30);

        fatherLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        fatherLbl.setText("Fathers Name :");
        add(fatherLbl);
        fatherLbl.setBounds(730, 430, 120, 30);

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt);
        addressTxt.setBounds(310, 480, 160, 30);

        firstnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTxtActionPerformed(evt);
            }
        });
        add(firstnameTxt);
        firstnameTxt.setBounds(310, 320, 160, 30);

        pathLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        pathLbl.setText("Path :");
        add(pathLbl);
        pathLbl.setBounds(480, 350, 90, 30);

        pobLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        pobLbl.setText("Place of Birth :");
        add(pobLbl);
        pobLbl.setBounds(730, 400, 140, 30);

        sexLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sexLbl.setText("Sex (Male/Female) :");
        add(sexLbl);
        sexLbl.setBounds(730, 320, 140, 30);

        placeOfBTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOfBTxtActionPerformed(evt);
            }
        });
        add(placeOfBTxt);
        placeOfBTxt.setBounds(920, 400, 160, 30);

        sexTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexTxtActionPerformed(evt);
            }
        });
        add(sexTxt);
        sexTxt.setBounds(920, 320, 160, 30);

        motherLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        motherLbl.setText("Mothers Name :");
        add(motherLbl);
        motherLbl.setBounds(720, 470, 120, 30);

        motherNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherNameTxtActionPerformed(evt);
            }
        });
        add(motherNameTxt);
        motherNameTxt.setBounds(920, 480, 160, 30);

        DobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DobTxtActionPerformed(evt);
            }
        });
        add(DobTxt);
        DobTxt.setBounds(310, 400, 160, 30);

        dobLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dobLbl.setText("Date Of Birth :");
        add(dobLbl);
        dobLbl.setBounds(130, 400, 110, 30);

        fatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameActionPerformed(evt);
            }
        });
        add(fatherName);
        fatherName.setBounds(920, 440, 160, 30);

        timeLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        timeLbl.setText("Time :");
        add(timeLbl);
        timeLbl.setBounds(190, 440, 100, 30);

        removeFile.setBackground(new java.awt.Color(255, 204, 51));
        removeFile.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        removeFile.setText("Remove");
        removeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFileActionPerformed(evt);
            }
        });
        add(removeFile);
        removeFile.setBounds(910, 350, 130, 30);

        generateId4.setBackground(new java.awt.Color(255, 204, 51));
        generateId4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        generateId4.setText("Existing");
        generateId4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateId4ActionPerformed(evt);
            }
        });
        add(generateId4);
        generateId4.setBounds(690, 240, 120, 30);

        pathTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTxtActionPerformed(evt);
            }
        });
        add(pathTxt);
        pathTxt.setBounds(570, 350, 330, 30);

        uploadBirthCer1.setBackground(new java.awt.Color(255, 204, 51));
        uploadBirthCer1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        uploadBirthCer1.setText("Upload Birth certificate");
        uploadBirthCer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBirthCer1ActionPerformed(evt);
            }
        });
        add(uploadBirthCer1);
        uploadBirthCer1.setBounds(570, 310, 200, 30);

        firstnameLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        firstnameLbl.setText("First Name :");
        add(firstnameLbl);
        firstnameLbl.setBounds(150, 320, 90, 30);

        backBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(40, 20, 96, 29);

        bloodGrpLbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bloodGrpLbl.setText("Blood group:");
        add(bloodGrpLbl);
        bloodGrpLbl.setBounds(740, 360, 120, 30);

        bloodGrpComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(bloodGrpComboBox);
        bloodGrpComboBox.setBounds(920, 360, 160, 30);

        Image.setBackground(new java.awt.Color(255, 204, 102));
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(Image);
        Image.setBounds(-180, 0, 1720, 1070);
    }// </editor-fold>//GEN-END:initComponents

    private void generateIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateIdActionPerformed
        //String uniqueID = UUID.randomUUID().toString();
        
        
        Random random = new Random(System.nanoTime() % 100000);

         int randomInt = random.nextInt(1000000000);
        medicalIdTxt.setText(String.valueOf(randomInt));
    }//GEN-LAST:event_generateIdActionPerformed

    private void generateId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateId1ActionPerformed
        firstnameTxt.setVisible(true);
        lastNameTxt.setVisible(true);
        DobTxt.setVisible(true);
        timeTxt.setVisible(true);
        addressTxt.setVisible(true);
        sexTxt.setVisible(true);

        placeOfBTxt.setVisible(true);
        fatherName.setVisible(true);
        motherNameTxt.setVisible(true);
        firstnameLbl.setVisible(true);
        lastnameLbl.setVisible(true);
        sexLbl.setVisible(true);
        dobLbl.setVisible(true);
        timeLbl.setVisible(true);
        addrLbl.setVisible(true);
        pobLbl.setVisible(true);
        fatherLbl.setVisible(true);
        motherLbl.setVisible(true);
         bloodGrpLbl.setVisible(true);
        bloodGrpComboBox.setVisible(true);
           
        uploadBirthCer1.setVisible(false);
        pathLbl.setVisible(false);
        pathTxt.setVisible(false);
        removeFile.setVisible(false);
    }//GEN-LAST:event_generateId1ActionPerformed

    private void generateId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateId2ActionPerformed

      if(!(Validation.nullPointerException(firstnameTxt)&& Validation.nullPointerException(lastNameTxt) && 
              Validation.nullPointerException(motherNameTxt) && Validation.nullPointerException(fatherName) && Validation.nullPointerException(DobTxt) && Validation.nullPointerException(addressTxt)&& Validation.nullPointerException(sexTxt) && Validation.nullPointerException(placeOfBTxt)))
      {
        MedicalRecord medicalIdValue = medicalId;
        medicalIdValue.setFirstName(firstnameTxt.getText());
        medicalIdValue.setLastName(lastNameTxt.getText());
        medicalIdValue.setMotherName(motherNameTxt.getText());
        medicalIdValue.setFatherName(fatherName.getText());
       // medicalIdValue.setDateOfBirth(Validation.DobTxt.getText());
        medicalIdValue.setAddress(addressTxt.getText());
        medicalIdValue.setPlaceOfBirth(placeOfBTxt.getText());

   
        medicalIdValue.setBloodGroup(bloodGrpComboBox.getSelectedItem().toString());

        medicalIdValue.setSex(sexTxt.getText());
            medicalIdValue.setMedicalId(Integer.parseInt(medicalIdTxt.getText()));

            
      //  m.setTimeOfBirth(timeTxt.getText());
        JOptionPane.showMessageDialog(null, "Details are saved");
      }
        
    }//GEN-LAST:event_generateId2ActionPerformed

    private void lastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTxtActionPerformed

    private void timeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void firstnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTxtActionPerformed

    private void placeOfBTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOfBTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeOfBTxtActionPerformed

    private void sexTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexTxtActionPerformed

    private void motherNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motherNameTxtActionPerformed

    private void DobTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DobTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DobTxtActionPerformed

    private void fatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherNameActionPerformed

    private void removeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFileActionPerformed
       pathTxt.setText("");
    }//GEN-LAST:event_removeFileActionPerformed

    private void generateId4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateId4ActionPerformed
        firstnameTxt.setVisible(false);
        lastNameTxt.setVisible(false);
        DobTxt.setVisible(false);
        timeTxt.setVisible(false);
        addressTxt.setVisible(false);
        sexTxt.setVisible(false);
        
        placeOfBTxt.setVisible(false);
        fatherName.setVisible(false);
        motherNameTxt.setVisible(false);
         firstnameLbl.setVisible(false);
        lastnameLbl.setVisible(false);
        sexLbl.setVisible(false);
        dobLbl.setVisible(false);
        timeLbl.setVisible(false);
        addrLbl.setVisible(false);
        
        pobLbl.setVisible(false);
        fatherLbl.setVisible(false);
        motherLbl.setVisible(false);
        
        uploadBirthCer1.setVisible(true);
        pathLbl.setVisible(true);
        pathTxt.setVisible(true);
        removeFile.setVisible(true);
        
        
    }//GEN-LAST:event_generateId4ActionPerformed

    private void uploadBirthCer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBirthCer1ActionPerformed
       JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File selectedFile = chooseFile.getSelectedFile();
        String filePath=selectedFile.getAbsolutePath();
        pathTxt.setText(filePath);
    }//GEN-LAST:event_uploadBirthCer1ActionPerformed

    private void pathTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DobTxt;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel addrLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> bloodGrpComboBox;
    private javax.swing.JLabel bloodGrpLbl;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JLabel fatherLbl;
    private javax.swing.JTextField fatherName;
    private javax.swing.JLabel firstnameLbl;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JButton generateId;
    private javax.swing.JButton generateId1;
    private javax.swing.JButton generateId2;
    private javax.swing.JButton generateId4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel lastnameLbl;
    private javax.swing.JTextField medicalIdTxt;
    private javax.swing.JLabel motherLbl;
    private javax.swing.JTextField motherNameTxt;
    private javax.swing.JLabel pathLbl;
    private javax.swing.JTextField pathTxt;
    private javax.swing.JTextField placeOfBTxt;
    private javax.swing.JLabel pobLbl;
    private javax.swing.JButton removeFile;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JTextField sexTxt;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JTextField timeTxt;
    private javax.swing.JButton uploadBirthCer1;
    // End of variables declaration//GEN-END:variables

    private void populateBloodGrpComboBox() {
        String[] BloodGrps= {"O+","O-","A+","A-","B+","B-","AB+","AB-"};
        bloodGrpComboBox.removeAllItems();
        for (String s : BloodGrps){
            bloodGrpComboBox.addItem(s);
        } 
    }

//    private void populateCombo() {
//        Organization orgPat=null;
//        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
//        {
//            if(org instanceof PatientOrganization)
//            {
//                orgPat = org;
//                break;
//            }
//        }
//       employeeJComboBox.removeAllItems();
//        
//        for (Employee employee : orgPat.getEmployeeDirectory().getEmployeeList()){
//            employeeJComboBox.addItem(employee.getName());
//        }
//    }
}
