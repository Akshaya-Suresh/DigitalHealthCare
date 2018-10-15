/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalId;

import Business.BloodTest.BloodTestDirectory;
import Business.Chlostral.CholestralDirectory;
import Business.ECGTest.ecgTestDirectory;
import Business.GFRTest.gfrTestDirectory;
import Business.MeldTest.MeldTestDirectory;
import Business.Prescription.PrescriptionDirectory;
import Business.VaccineTest.VaccineDirectory;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Niranjanii
 */
public class MedicalRecord {
    
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Time timeOfBirth;
    private String fatherName;
    private String motherName;
    private String sex;
    private String registrationNum;
    private String address;
    private String placeOfBirth;
    private int medicalId;
    private BloodTestDirectory bloodtestDir;
    private VaccineDirectory vaccineDir;
    private ecgTestDirectory ecgDir;
    private gfrTestDirectory gfrDir;
    private PrescriptionDirectory prescriptionDir;
    private CholestralDirectory cholestralDir;
     private String bloodGroup;
    private String dead;
    private Date deathDate;
    private MeldTestDirectory meldTestDir;
    
    public MedicalRecord()
    {
        bloodtestDir = new BloodTestDirectory();
        vaccineDir = new VaccineDirectory();
        ecgDir = new ecgTestDirectory();
        gfrDir = new gfrTestDirectory();
        prescriptionDir = new PrescriptionDirectory();
        cholestralDir = new CholestralDirectory();
        meldTestDir = new MeldTestDirectory();
        
    }

    public MeldTestDirectory getMeldTestDir() {
        return meldTestDir;
    }

    public void setMeldTestDir(MeldTestDirectory meldTestDir) {
        this.meldTestDir = meldTestDir;
    }
    
    
    public PrescriptionDirectory getPrescriptionDir() {
        return prescriptionDir;
    }

    public void setPrescriptionDir(PrescriptionDirectory prescriptionDir) {
        this.prescriptionDir = prescriptionDir;
    }

 

    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Time getTimeOfBirth() {
        return timeOfBirth;
    }

    public void setTimeOfBirth(Time timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }


    public BloodTestDirectory getBloodtestDir() {
        return bloodtestDir;
    }

    public void setBloodtestDir(BloodTestDirectory bloodtestDir) {
        this.bloodtestDir = bloodtestDir;
    }

    public VaccineDirectory getVaccineDir() {
        return vaccineDir;
    }

    public void setVaccineDir(VaccineDirectory vaccineDir) {
        this.vaccineDir = vaccineDir;
    }

    public ecgTestDirectory getEcgDir() {
        return ecgDir;
    }

    public void setEcgDir(ecgTestDirectory ecgDir) {
        this.ecgDir = ecgDir;
    }

    public gfrTestDirectory getGfrDir() {
        return gfrDir;
    }

    public void setGfrDir(gfrTestDirectory gfrDir) {
        this.gfrDir = gfrDir;
    }
    public String getBloodGroup() {


        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDead() {
        return dead;
    }

    public void setDead(String dead) {
        this.dead = dead;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public CholestralDirectory getCholestralDir() {
        return cholestralDir;
    }

    public void setCholestralDir(CholestralDirectory cholestralDir) {
        this.cholestralDir = cholestralDir;
    }
    
    

}
