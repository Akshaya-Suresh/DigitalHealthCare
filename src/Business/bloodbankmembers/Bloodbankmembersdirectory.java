/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.bloodbankmembers;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Bloodbankmembersdirectory {
    private ArrayList<BloodBankmember> bloodbankdirectory;

    public Bloodbankmembersdirectory() {
        bloodbankdirectory=new ArrayList<>();
    }

    public ArrayList<BloodBankmember> getBloodbankdirectory() {
        return bloodbankdirectory;
    }

    public void setBloodbankdirectory(ArrayList<BloodBankmember> bloodbankdirectory) {
        this.bloodbankdirectory = bloodbankdirectory;
    }
    public BloodBankmember addbloodbankmember(BloodBankmember bbm){
       
       bloodbankdirectory.add(bbm);
        
        return bbm;
    }
    
    
    public void deletebloodbankmember(BloodBankmember bbm){
        bloodbankdirectory.remove(bbm);
    }
    
}
