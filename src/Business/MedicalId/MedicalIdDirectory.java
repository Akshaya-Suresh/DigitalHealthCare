/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalId;

import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class MedicalIdDirectory {
    
    ArrayList<MedicalRecord> medicalIdList; 

    public MedicalIdDirectory() {
        
        medicalIdList  = new ArrayList<MedicalRecord>();
    }

    public ArrayList<MedicalRecord> getMedicalIdList() {
        return medicalIdList;
    }

    public void setMedicalIdList(ArrayList<MedicalRecord> medicalIdList) {
        this.medicalIdList = medicalIdList;
    }
     
    public MedicalRecord addMedicalId()
    {
        MedicalRecord medicalId = new MedicalRecord();
        medicalIdList.add(medicalId);
        return medicalId;
    }
}
