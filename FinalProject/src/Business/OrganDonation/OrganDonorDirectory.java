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
public class OrganDonorDirectory {
       ArrayList<OrganDonor> organDonorList; 
   
    public OrganDonorDirectory() {
        
        organDonorList  = new ArrayList<OrganDonor>();
    }

    public ArrayList<OrganDonor> getOrganDonorList() {
        return organDonorList;
    }

    public void setOrganDonorList(ArrayList<OrganDonor> organDonorList) {
        this.organDonorList = organDonorList;
    }
     
 
      
    public OrganDonor addOrganDonor()
    {
        OrganDonor od = new OrganDonor();
        organDonorList.add(od);
        return od;
    }
     public void deleteOrganDonor(OrganDonor od)
    {
        organDonorList.remove(od);
        
    } 
}
