/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.bloodbankmembers.Bloodbankmembersdirectory;
import Business.bloodbankcampaign.Campaigndirectory;
/**
 *
 * @author akshayasuresh
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType; 
    private OrganizationDirectory organizationDirectory;
    private Bloodbankmembersdirectory bloodbankmembersdirectory;
    private Campaigndirectory bbcampaigndirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        bloodbankmembersdirectory=new Bloodbankmembersdirectory();
        bbcampaigndirectory=new Campaigndirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Insurance("Insurance"),
        Pharmacy("Pharmacy"),
        Patient("Patient"),
        OrganBank("Organ Bank"),
        BloodBank("Blood Bank")
        ;
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public Bloodbankmembersdirectory getBloodbankmembersdirectory() {
        return bloodbankmembersdirectory;
    }

    public void setBloodbankmembersdirectory(Bloodbankmembersdirectory bloodbankmembersdirectory) {
        this.bloodbankmembersdirectory = bloodbankmembersdirectory;
    }

    public Campaigndirectory getBbcampaigndirectory() {
        return bbcampaigndirectory;
    }

    public void setBbcampaigndirectory(Campaigndirectory bbcampaigndirectory) {
        this.bbcampaigndirectory = bbcampaigndirectory;
    }
    
    
}
