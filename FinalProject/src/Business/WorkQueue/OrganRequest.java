/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Collections;
import java.util.Date;

/**
 *
 * @author akshayasuresh
 */
public class OrganRequest extends WorkRequest implements Comparable<OrganRequest> {
    private int priority;
    private Date deadline;
    private int waitlistNo; // Add default
    private int donorID;
    private String organsNeeded;
    private String bloodGrp;
    private String hlaType;

    public OrganRequest(){
        deadline = new Date(); 
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
  
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getWaitlistNo() {
        return waitlistNo;
    }

    public void setWaitlistNo(int waitlistNo) {
        this.waitlistNo = waitlistNo;
    }

  

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

   

    public String getOrgansNeeded() {
        return organsNeeded;
    }

    public void setOrgansNeeded(String organsNeeded) {
        this.organsNeeded = organsNeeded;
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

    @Override
    public int compareTo(OrganRequest o) {
        int compare = Integer.compare(priority,o.priority);
        if(compare == 0){
            compare = Integer.compare(waitlistNo,o.waitlistNo);
        }
        return compare;
    }
  
           
    
}
