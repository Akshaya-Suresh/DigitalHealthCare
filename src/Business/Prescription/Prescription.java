/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import Business.PillsGiven.PillsGiven;
import java.util.ArrayList;

/**
 *
 * @author Niranjanii
 */
public class Prescription {
    
    ArrayList<PillsGiven> pillsList;
    
    
    public Prescription()
    {
         pillsList = new ArrayList<PillsGiven>();
    }

    public ArrayList<PillsGiven> getPillsList() {
        return pillsList;
    }

    public void setPillsList(ArrayList<PillsGiven> pillsList) {
        this.pillsList = pillsList;
    }
    
    
    public PillsGiven addPills()
    {
        PillsGiven pillsGiven = new PillsGiven();
        pillsList.add(pillsGiven);
        return pillsGiven;
        
    }
}
