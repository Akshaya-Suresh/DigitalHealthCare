/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.MedicalId.MedicalIdDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akshayasuresh
 */
public class HospitalEnterprise extends Enterprise{
    private   MedicalIdDirectory medicalIdDirec;
      
       
    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
        medicalIdDirec = new MedicalIdDirectory();
       
    }

    public MedicalIdDirectory getMedicalIdDirec() {
        return medicalIdDirec;
    }

    public void setMedicalIdDirec(MedicalIdDirectory medicalIdDirec) {
        this.medicalIdDirec = medicalIdDirec;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
