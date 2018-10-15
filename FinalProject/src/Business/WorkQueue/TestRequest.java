/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Patient.Patient;


/**
 *
 * @author Niranjanii
 */
public class TestRequest extends WorkRequest {

    StringBuffer type;
    String comments;
    String additionalTests;
    int medicalId;
    Patient patient;


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }



    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }

    public StringBuffer getType() {
        return type;
    }

    public void setType(StringBuffer type) {

        this.type = type;

    }

  

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAdditionalTests() {
        return additionalTests;
    }

    public void setAdditionalTests(String additionalTests) {
        this.additionalTests = additionalTests;
    }
    
    
}
