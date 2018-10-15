/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganDonation;

import java.util.Date;

/**
 *
 * @author akshayasuresh
 */
public abstract class OrganPerson {
    private int medicalID;
    private String fname;
    private String lname;
    private String gender;
    private Date dob;
    private String bloodGrp;
    private String hlaType;
    private String emailID;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String emergencyContactName;
    private long emergencyContactNo;
    private String refDr;
    private String refDrHospital;
    private String refDrNetwork;

    public int getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(int medicalID) {
        this.medicalID = medicalID;
    }

   

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getHlaType() {
        return hlaType;
    }

    public void setHlaType(String hlaType) {
        this.hlaType = hlaType;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public long getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(long emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getRefDr() {
        return refDr;
    }

    public void setRefDr(String refDr) {
        this.refDr = refDr;
    }

    public String getRefDrHospital() {
        return refDrHospital;
    }

    public void setRefDrHospital(String refDrHospital) {
        this.refDrHospital = refDrHospital;
    }

    public String getRefDrNetwork() {
        return refDrNetwork;
    }

    public void setRefDrNetwork(String refDrNetwork) {
        this.refDrNetwork = refDrNetwork;
    }
    
    
    
}
