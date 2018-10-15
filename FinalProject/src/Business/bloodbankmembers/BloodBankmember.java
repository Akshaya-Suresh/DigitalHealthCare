/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.bloodbankmembers;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Admin
 */
public class BloodBankmember {
    
    private int medicalId;
    private String firstName;
    private UserAccount useraccount;

    public BloodBankmember() {
        useraccount=new UserAccount();
             
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

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
    
    
}
