/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.bloodbankcampaign;


import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Campaigndirectory {
     private ArrayList<bloodbankcampaignmember> bloodbankcampaigndirectory;

    public Campaigndirectory() {
        bloodbankcampaigndirectory=new ArrayList<>();
    }

    public ArrayList<bloodbankcampaignmember> getBloodbankcampaigndirectory() {
        return bloodbankcampaigndirectory;
    }

    public void setBloodbankcampaigndirectory(ArrayList<bloodbankcampaignmember> bloodbankcampaigndirectory) {
        this.bloodbankcampaigndirectory = bloodbankcampaigndirectory;
    }
     
     public bloodbankcampaignmember addbloodbankcmember(bloodbankcampaignmember bbm){
       
       bloodbankcampaigndirectory.add(bbm);
        
        return bbm;
    }
    
    
    public void deletebloodbankcmember(bloodbankcampaignmember bbm){
        bloodbankcampaigndirectory.remove(bbm);
    }
    
     

    
}
