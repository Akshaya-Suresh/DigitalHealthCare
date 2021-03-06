/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Utilities.Validation;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Editprofilepatient extends javax.swing.JPanel {

    /**
     * Creates new form Editprofilepatient
     */
     private JPanel userProcessContainer;
    private PatientOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
 
  
    Editprofilepatient(JPanel userProcessContainer, UserAccount userAccount, PatientOrganization organization, Enterprise enterprise) {
         initComponents();
            this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        populatedata();
    }
    
      public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage=new ImageIcon(ImagePath);
        Image img=MyImage.getImage();
        Image newImg=img.getScaledInstance(250,250, Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImg);
        return image;
    }
    
    public void populatedata(){
        jTextField1.setText(userAccount.getPatient().getFirstName());
        jTextField2.setText(userAccount.getPatient().getLastName());
        jTextField3.setText(String.valueOf(userAccount.getPatient().getPhoneNumber()));
        jTextField4.setText(userAccount.getPatient().getAddress().getLine1());
        jTextField5.setText(userAccount.getPatient().getAddress().getLine2());
        jTextField6.setText(userAccount.getPatient().getAddress().getCity());
        jTextField7.setText(userAccount.getPatient().getAddress().getState());
         String path=userAccount.getPatient().getImagePath();
       jLabel8.setIcon(ResizeImage(path));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imagelabel1 = new javax.swing.JLabel();
        Imagebutton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(257, 398, 130, 29);

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setText("Add Emergency Contact");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(402, 398, 210, 29);

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Address line1");
        add(jLabel4);
        jLabel4.setBounds(59, 211, 120, 20);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        add(jTextField4);
        jTextField4.setBounds(172, 208, 121, 20);

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        add(jTextField5);
        jTextField5.setBounds(172, 249, 121, 20);

        jLabel5.setBackground(new java.awt.Color(255, 204, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Address Line 2");
        add(jLabel5);
        jLabel5.setBounds(59, 252, 120, 20);

        jLabel6.setBackground(new java.awt.Color(255, 204, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("City:");
        add(jLabel6);
        jLabel6.setBounds(59, 290, 120, 20);

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        add(jTextField6);
        jTextField6.setBounds(172, 287, 121, 20);

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        add(jTextField7);
        jTextField7.setBounds(172, 325, 121, 20);

        jLabel7.setBackground(new java.awt.Color(255, 204, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("State:");
        add(jLabel7);
        jLabel7.setBounds(59, 328, 120, 20);

        jLabel8.setText("jLabel8");
        add(jLabel8);
        jLabel8.setBounds(457, 31, 207, 167);

        imagelabel1.setBackground(new java.awt.Color(255, 204, 0));
        imagelabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        imagelabel1.setText("Picture");
        add(imagelabel1);
        imagelabel1.setBounds(402, 208, 100, 20);

        Imagebutton1.setBackground(new java.awt.Color(255, 204, 0));
        Imagebutton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Imagebutton1.setText("Browse");
        Imagebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imagebutton1ActionPerformed(evt);
            }
        });
        add(Imagebutton1);
        Imagebutton1.setBounds(512, 204, 130, 29);

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("First Name:");
        add(jLabel9);
        jLabel9.setBounds(402, 248, 120, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(512, 245, 121, 20);

        jLabel10.setBackground(new java.awt.Color(255, 204, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Last Name:");
        add(jLabel10);
        jLabel10.setBounds(402, 286, 120, 20);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(512, 283, 121, 20);

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("PhoneNo:");
        add(jLabel11);
        jLabel11.setBounds(402, 328, 120, 20);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        add(jTextField3);
        jTextField3.setBounds(512, 325, 121, 20);

        backBtn.setBackground(new java.awt.Color(255, 204, 0));
        backBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(30, 30, 170, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-30, -10, 1130, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Addemergencycontact addemergencycontact = new Addemergencycontact(userProcessContainer,userAccount,organization,enterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DoctorRequestJPanel",addemergencycontact);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!Validation.nullPointerException(jTextField1) &&  !Validation.nullPointerException(jTextField2) &&
                !Validation.nullPointerException(jTextField3)  &&  !Validation.nullPointerException(jTextField2)
                &&  !Validation.nullPointerException(jTextField4)
                &&  !Validation.nullPointerException(jTextField5)
                )
        {
          userAccount.getPatient().setFirstName(jTextField1.getText());
        userAccount.getPatient().setLastName(jTextField2.getText());
        userAccount.getPatient().setPhoneNumber(Long.parseLong(jTextField3.getText()));
        userAccount.getPatient().getAddress().setLine1(jTextField4.getText());
        userAccount.getPatient().getAddress().setLine2(jTextField5.getText());
        userAccount.getPatient().getAddress().setCity(jTextField6.getText());
        userAccount.getPatient().getAddress().setState(jTextField7.getText());
        
        JOptionPane.showMessageDialog(null,"Details saved");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Imagebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imagebutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagebutton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
         
	       char vchar = evt.getKeyChar();
       if(! (Character.isLetter(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
	   
	   
	   
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
               char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
	  
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
               char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
	  
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
              char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
	  
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
              char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
	  
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
             char vchar = evt.getKeyChar();
       if(! (Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
	  
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
       	     char vchar = evt.getKeyChar();
       if(! (Character.isAlphabetic(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imagebutton1;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel imagelabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
