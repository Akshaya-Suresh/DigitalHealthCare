/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author akshayasuresh
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.AdminServices.getValue())){
            organization = new AdminServicesOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Distributor.getValue())){
            organization = new DistributorOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.InsuranceAgent.getValue())){
            organization = new InsuranceAgentOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.InsuranceManager.getValue())){
            organization = new InsuranceManagerOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Pharmacist.getValue())){
            organization = new PharmacistOrg();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.BloodBank.getValue())){
            organization = new BloodbankOrg();
            organizationList.add(organization);
         }
        else if (type.getValue().equals(Organization.Type.OrganBankAdmin.getValue())){
            organization = new OrganBankOrg();
            organizationList.add(organization);
        }
        return organization;
    }
}
