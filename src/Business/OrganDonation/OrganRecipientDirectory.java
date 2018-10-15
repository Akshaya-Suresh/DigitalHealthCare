/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganDonation;

import java.util.ArrayList;

/**
 *
 * @author akshayasuresh
 */
public class OrganRecipientDirectory {
     ArrayList<OrganRecipient> organRecipientList; 

    public OrganRecipientDirectory() {
        
        organRecipientList  = new ArrayList<OrganRecipient>();
    }

    public ArrayList<OrganRecipient> getOrganRecipientList() {
        return organRecipientList;
    }

    public void setOrganRecipientList(ArrayList<OrganRecipient> organRecipientList) {
        this.organRecipientList = organRecipientList;
    }
     
    public OrganRecipient addOrganRecipient()
    {
        OrganRecipient or = new OrganRecipient();
        organRecipientList.add(or);
        return or;
    }
     public void deleteOrganRecipient(OrganRecipient or)
    {
        organRecipientList.remove(or);
        
    } 
}
