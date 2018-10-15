/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author akshayasuresh
 */
public class OrganAvailableRequest extends WorkRequest {
    ArrayList<String> organsAvailable;
    private String bloodGrp;
    private String hlaType;
    private String deathReason;
    private Date availUntil;

    public OrganAvailableRequest(){
        availUntil = new Date();
    }

    public ArrayList<String> getOrgansAvailable() {
        return organsAvailable;
    }

    public void setOrgansAvailable(ArrayList<String> organsAvailable) {
        this.organsAvailable = organsAvailable;
    }
    
    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getHlaType() {
        return hlaType;
    }

    public void setHlaType(String hlaType) {
        this.hlaType = hlaType;
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
