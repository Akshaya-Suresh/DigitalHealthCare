/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganDonation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author akshayasuresh
 */
public class OrganDonor extends OrganPerson {
    
    ArrayList<String> organs; 
    private String deathReason;
    private Date availUntil;

  

    public ArrayList<String> getOrgans() {
        return organs;
    }

    public void setOrgans(ArrayList<String> organs) {
        this.organs = organs;
    }
    
    public String getDeathReason() {
        return deathReason;
    }

    public void setDeathReason(String deathReason) {
        this.deathReason = deathReason;
    }

    public Date getAvailUntil() {
        return availUntil;
    }

    public void setAvailUntil(Date availUntil) {
        this.availUntil = availUntil;
    }

}
