/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganDonation;

import java.util.Date;

/**
 *
 * @author akshayasuresh
 */
public class OrganRecipient extends OrganPerson{
  
   private String organ;
   private int priority=0;
   private static int counter=1;
   private int waitlistNo;
   private int DonorID;
   private Date deadline;
   
    public OrganRecipient(){
        
    waitlistNo=counter;
    ++counter;
    
    }
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
 

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getWaitlistNo() {
        return waitlistNo;
    }

    public void setWaitlistNo(int waitlistNo) {
        this.waitlistNo = waitlistNo;
    }


    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        OrganRecipient.counter = counter;
    }

    public int getDonorID() {
        return DonorID;
    }

    public void setDonorID(int DonorID) {
        this.DonorID = DonorID;
    }

    

    
   
    
}
