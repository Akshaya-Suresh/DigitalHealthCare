
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Patient.PatientDirectory;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akshayasuresh
 */
public class PatientOrganization extends Organization {
     PatientDirectory patientDirec;
      public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
         patientDirec = new PatientDirectory();
    }
      
    public PatientDirectory getPatientDirec() {
        return patientDirec;
    }

    public void setPatientDirec(PatientDirectory patientDirec) {
        this.patientDirec = patientDirec;
    }
 
       @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
}
