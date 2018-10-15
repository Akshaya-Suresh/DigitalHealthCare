/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.EmergencyContact.EmergencyContact;
import Business.MedicalId.MedicalRecord;
import Business.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Niranjanii
 */
public class Patient extends Person{
    
   private MedicalRecord medicalRecord;
   private EmergencyContact emergencyContact;

   public String ImagePath;

   
   public Patient()
   {
       medicalRecord = new MedicalRecord();
       emergencyContact= new EmergencyContact();
   }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }



}
