/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author akshayasuresh
 */
public abstract class WorkRequest {
    private int MedicalID;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private long senderNo;
    private String status;
    private Date requestDate;
    private String organisation;
   
   
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public int getMedicalID() {
        return MedicalID;
    }

    public void setMedicalID(int MedicalID) {
        this.MedicalID = MedicalID;
    }

    public long getSenderNo() {
        return senderNo;
    }

    public void setSenderNo(long senderNo) {
        this.senderNo = senderNo;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }
 
}
