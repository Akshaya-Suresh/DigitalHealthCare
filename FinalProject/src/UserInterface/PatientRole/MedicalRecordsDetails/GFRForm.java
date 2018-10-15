/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole.MedicalRecordsDetails;

import Business.GFRTest.gfrTest;
import Business.Patient.Patient;
import Utilities.Validation;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Niranjanii
 */
public class GFRForm extends javax.swing.JPanel {

    /**
     * Creates new form GFRForm
     */
     private JPanel userProcessContainer;
    private Patient patient;
     private boolean gfrFlag;


    private String typepd;
    private gfrTest gfrtestobj;
   
    public GFRForm(JPanel userProcessContainer, Patient patient, String typepd,boolean gfrFlag, gfrTest gfrtestobj) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.patient=patient;
        this.typepd=typepd;
        this.gfrFlag=gfrFlag;
        this.gfrtestobj=gfrtestobj;
        if(("patient").equals(typepd)){
            populate();
            Add.setVisible(false);
        }
    }

   public void populate(){
       
       serumMean.setText(gfrtestobj.getSerumCreatinineMean());
       serumSd.setText(gfrtestobj.getSerumCreatinineSd());
       bunMean.setText(gfrtestobj.getBunMean());
       bunSd.setText(gfrtestobj.getBunSd());
       ktMean.setText(gfrtestobj.getKtvUreaMean());
       ktSd.setText(gfrtestobj.getKtvUreaSd());
       gfrMean.setText(gfrtestobj.getGfrIothalamateMean());
       gfrSd.setText(gfrtestobj.getGfrIothalamateSd());
       gfrMdrdMean.setText(gfrtestobj.getGfrMDRDMean());
       gfrMdrdSd.setText(gfrtestobj.getGfrMDRDSd());
       ccrMean.setText(gfrtestobj.getCcrMeasuredMean());
       ccrcSd.setText(gfrtestobj.getCcrMeasuredSd());
       ccrCockMean.setText(gfrtestobj.getCcrCockcroftEquationMean());
       ccrCockSd.setText(gfrtestobj.getCcrCockcroftEquationSd());
       ccrcUreaMean.setText(gfrtestobj.getCcrCUreaMean());
       ccrcUreaSD.setText(gfrtestobj.getCcrCUreaSd());
       hospital.setText(gfrtestobj.getHospital());
       
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        serumSd = new javax.swing.JTextField();
        bunSd = new javax.swing.JTextField();
        bunMean = new javax.swing.JTextField();
        ktMean = new javax.swing.JTextField();
        ktSd = new javax.swing.JTextField();
        gfrMean = new javax.swing.JTextField();
        gfrSd = new javax.swing.JTextField();
        gfrMdrdMean = new javax.swing.JTextField();
        gfrMdrdSd = new javax.swing.JTextField();
        ccrMean = new javax.swing.JTextField();
        ccrcSd = new javax.swing.JTextField();
        ccrCockMean = new javax.swing.JTextField();
        ccrCockSd = new javax.swing.JTextField();
        ccrcUreaSD = new javax.swing.JTextField();
        ccrcUreaMean = new javax.swing.JTextField();
        serumMean = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        hospital = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        hospital1 = new javax.swing.JTextField();
        doctor = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Measurement");
        add(jLabel10);
        jLabel10.setBounds(190, 160, 120, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Mean :");
        add(jLabel11);
        jLabel11.setBounds(380, 160, 120, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("SD :");
        add(jLabel12);
        jLabel12.setBounds(540, 160, 120, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Range :");
        add(jLabel13);
        jLabel13.setBounds(700, 160, 120, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("Serum Creatinie (mg/dL) :");
        add(jLabel14);
        jLabel14.setBounds(130, 220, 180, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("BUN(mg/dL) :");
        add(jLabel15);
        jLabel15.setBounds(190, 280, 120, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Kt/V urea :");
        add(jLabel16);
        jLabel16.setBounds(190, 340, 120, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("GFR (125 I-iothalamate clearance)*  :");
        add(jLabel17);
        jLabel17.setBounds(190, 440, 120, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("GFR(MDRD Study Equation)* :");
        add(jLabel18);
        jLabel18.setBounds(190, 490, 120, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Ccr(Measured)* :");
        add(jLabel19);
        jLabel19.setBounds(190, 540, 120, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setText("Ccr(Cockcroft-Gault Equation)* :");
        add(jLabel20);
        jLabel20.setBounds(190, 570, 120, 60);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText("* Units for clearence Measurements: mL/min/1.73m2");
        add(jLabel21);
        jLabel21.setBounds(190, 680, 410, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel22.setText("0.8 - 3.2");
        add(jLabel22);
        jLabel22.setBounds(700, 340, 120, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel23.setText("4.1 - 18.2");
        add(jLabel23);
        jLabel23.setBounds(690, 440, 120, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel24.setText("4.9 - 18.3");
        add(jLabel24);
        jLabel24.setBounds(690, 490, 120, 30);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel25.setText("3.9 - 25.7");
        add(jLabel25);
        jLabel25.setBounds(690, 540, 120, 30);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setText("6.2 - 25.3");
        add(jLabel26);
        jLabel26.setBounds(690, 580, 120, 30);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel27.setText("3.3 - 18.8");
        add(jLabel27);
        jLabel27.setBounds(690, 620, 120, 30);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel28.setText("3.3 - 11.5");
        add(jLabel28);
        jLabel28.setBounds(700, 210, 120, 30);

        serumSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serumSdKeyTyped(evt);
            }
        });
        add(serumSd);
        serumSd.setBounds(540, 220, 140, 30);

        bunSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bunSdKeyTyped(evt);
            }
        });
        add(bunSd);
        bunSd.setBounds(530, 280, 140, 30);

        bunMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bunMeanKeyTyped(evt);
            }
        });
        add(bunMean);
        bunMean.setBounds(370, 280, 140, 30);

        ktMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ktMeanKeyTyped(evt);
            }
        });
        add(ktMean);
        ktMean.setBounds(370, 340, 140, 30);

        ktSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ktSdKeyTyped(evt);
            }
        });
        add(ktSd);
        ktSd.setBounds(530, 340, 140, 30);

        gfrMean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gfrMeanActionPerformed(evt);
            }
        });
        gfrMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gfrMeanKeyTyped(evt);
            }
        });
        add(gfrMean);
        gfrMean.setBounds(370, 440, 140, 30);

        gfrSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gfrSdKeyTyped(evt);
            }
        });
        add(gfrSd);
        gfrSd.setBounds(530, 440, 140, 30);

        gfrMdrdMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gfrMdrdMeanKeyTyped(evt);
            }
        });
        add(gfrMdrdMean);
        gfrMdrdMean.setBounds(370, 490, 140, 30);

        gfrMdrdSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gfrMdrdSdKeyTyped(evt);
            }
        });
        add(gfrMdrdSd);
        gfrMdrdSd.setBounds(530, 490, 140, 30);

        ccrMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccrMeanKeyTyped(evt);
            }
        });
        add(ccrMean);
        ccrMean.setBounds(370, 540, 140, 30);

        ccrcSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccrcSdKeyTyped(evt);
            }
        });
        add(ccrcSd);
        ccrcSd.setBounds(530, 540, 140, 30);

        ccrCockMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccrCockMeanKeyTyped(evt);
            }
        });
        add(ccrCockMean);
        ccrCockMean.setBounds(370, 580, 140, 30);

        ccrCockSd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccrCockSdKeyTyped(evt);
            }
        });
        add(ccrCockSd);
        ccrCockSd.setBounds(530, 580, 140, 30);

        ccrcUreaSD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccrcUreaSDKeyTyped(evt);
            }
        });
        add(ccrcUreaSD);
        ccrcUreaSD.setBounds(530, 620, 140, 30);

        ccrcUreaMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccrcUreaMeanKeyTyped(evt);
            }
        });
        add(ccrcUreaMean);
        ccrcUreaMean.setBounds(370, 620, 140, 30);

        serumMean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serumMeanKeyTyped(evt);
            }
        });
        add(serumMean);
        serumMean.setBounds(370, 220, 140, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel29.setText("28 - 118");
        add(jLabel29);
        jLabel29.setBounds(700, 280, 120, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel30.setText("(Ccr + Curea) 2 * :");
        add(jLabel30);
        jLabel30.setBounds(190, 620, 120, 30);
        add(hospital);
        hospital.setBounds(750, 80, 140, 30);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel32.setText("Hospital :");
        add(jLabel32);
        jLabel32.setBounds(510, 80, 180, 30);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        add(Add);
        Add.setBounds(820, 500, 120, 40);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel31.setText("Doctor :");
        add(jLabel31);
        jLabel31.setBounds(510, 30, 180, 30);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel33.setText("Hospital :");
        add(jLabel33);
        jLabel33.setBounds(510, 80, 180, 30);
        add(hospital1);
        hospital1.setBounds(750, 80, 140, 30);
        add(doctor);
        doctor.setBounds(750, 30, 140, 30);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageedit_1_7751284971.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -10, 1410, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

      
        if(!Validation.nullPointerException(bunMean) &&  !Validation.nullPointerException(ccrcUreaMean) &&
                !Validation.nullPointerException(ccrCockMean) && !Validation.nullPointerException(ccrMean) 
                && !Validation.nullPointerException(gfrMean) && !Validation.nullPointerException(gfrMdrdMean) &&
                !Validation.nullPointerException(ccrMean) && !Validation.nullPointerException(ccrMean) &&
                !Validation.nullPointerException(ktMean) && !Validation.nullPointerException(serumMean) &&
                !Validation.nullPointerException(bunSd) &&  !Validation.nullPointerException(ccrcUreaSD) &&
                !Validation.nullPointerException(ccrCockSd) && !Validation.nullPointerException(ccrcSd) 
                && !Validation.nullPointerException(gfrSd) && !Validation.nullPointerException(gfrMdrdSd) &&
                !Validation.nullPointerException(ccrcSd) && !Validation.nullPointerException(ccrMean) &&
                !Validation.nullPointerException(ktSd) && !Validation.nullPointerException(serumSd))
        {  
        
        gfrFlag = true;

        gfrTest gfrtst=patient.getMedicalRecord().getGfrDir().addgfrTest();
        gfrtst.setBunMean(bunMean.getText());
        gfrtst.setCcrCUreaMean(ccrcUreaMean.getText());
        gfrtst.setCcrCockcroftEquationMean(ccrCockMean.getText());
        gfrtst.setCcrMeasuredMean(ccrMean.getText());
        gfrtst.setGfrIothalamateMean(gfrMean.getText());
        gfrtst.setGfrMDRDMean(gfrMdrdMean.getText());
        gfrtst.setKtvUreaMean(ktMean.getText());
        gfrtst.setSerumCreatinineMean(serumMean.getText());
        
        gfrtst.setBunSd(bunSd.getText());
        gfrtst.setCcrCUreaSd(ccrcUreaSD.getText());
        gfrtst.setCcrCockcroftEquationSd(ccrCockSd.getText());
        gfrtst.setCcrMeasuredSd(ccrcSd.getText());
        gfrtst.setGfrIothalamateSd(gfrSd.getText());
        gfrtst.setGfrMDRDSd(gfrMdrdSd.getText());
        gfrtst.setKtvUreaSd(ktSd.getText());
        gfrtst.setSerumCreatinineSd(serumSd.getText());
        }

    }//GEN-LAST:event_AddActionPerformed

    private void serumMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serumMeanKeyTyped
           char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_serumMeanKeyTyped

    private void serumSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serumSdKeyTyped
                char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_serumSdKeyTyped

    private void bunMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bunMeanKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_bunMeanKeyTyped

    private void bunSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bunSdKeyTyped
           char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_bunSdKeyTyped

    private void ktMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ktMeanKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ktMeanKeyTyped

    private void ktSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ktSdKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ktSdKeyTyped

    private void gfrMeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gfrMeanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gfrMeanActionPerformed

    private void gfrMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gfrMeanKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_gfrMeanKeyTyped

    private void gfrSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gfrSdKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_gfrSdKeyTyped

    private void gfrMdrdMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gfrMdrdMeanKeyTyped
           char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_gfrMdrdMeanKeyTyped

    private void gfrMdrdSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gfrMdrdSdKeyTyped
             char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_gfrMdrdSdKeyTyped

    private void ccrMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccrMeanKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ccrMeanKeyTyped

    private void ccrcSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccrcSdKeyTyped
             char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ccrcSdKeyTyped

    private void ccrCockMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccrCockMeanKeyTyped
             char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ccrCockMeanKeyTyped

    private void ccrCockSdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccrCockSdKeyTyped
            char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ccrCockSdKeyTyped

    private void ccrcUreaMeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccrcUreaMeanKeyTyped
             char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ccrcUreaMeanKeyTyped

    private void ccrcUreaSDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccrcUreaSDKeyTyped
          char vchar = evt.getKeyChar();
       if((Character.isLetter(vchar)) && !evt. isAltDown() )
       {
           evt.consume();
       }
    }//GEN-LAST:event_ccrcUreaSDKeyTyped

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bunMean;
    private javax.swing.JTextField bunSd;
    private javax.swing.JTextField ccrCockMean;
    private javax.swing.JTextField ccrCockSd;
    private javax.swing.JTextField ccrMean;
    private javax.swing.JTextField ccrcSd;
    private javax.swing.JTextField ccrcUreaMean;
    private javax.swing.JTextField ccrcUreaSD;
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField gfrMdrdMean;
    private javax.swing.JTextField gfrMdrdSd;
    private javax.swing.JTextField gfrMean;
    private javax.swing.JTextField gfrSd;
    private javax.swing.JTextField hospital;
    private javax.swing.JTextField hospital1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JTextField ktMean;
    private javax.swing.JTextField ktSd;
    private javax.swing.JTextField serumMean;
    private javax.swing.JTextField serumSd;
    // End of variables declaration//GEN-END:variables
}