/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineTest;

import java.util.Date;

/**
 *
 * @author Niranjanii
 */
public class Vaccine {
    
    String hopital;
    String vaccineName;
    String typesOfVaccine;
    String expiryDate;
    String vaccinator;
    String doctor;
    String medicalId;
    Date dateGiven;
    Date validTill;
    String dosage;

    public String getHopital() {
        return hopital;
    }

    public void setHopital(String hopital) {
        this.hopital = hopital;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getTypesOfVaccine() {
        return typesOfVaccine;
    }

    public void setTypesOfVaccine(String typesOfVaccine) {
        this.typesOfVaccine = typesOfVaccine;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getVaccinator() {
        return vaccinator;
    }

    public void setVaccinator(String vaccinator) {
        this.vaccinator = vaccinator;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    public Date getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(Date dateGiven) {
        this.dateGiven = dateGiven;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
}
