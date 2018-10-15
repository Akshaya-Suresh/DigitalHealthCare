/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bloodbankinventory;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class BloodbankInventory {
    
    private ArrayList<Bloodtypeandquantity> bloodbankinv;

    public BloodbankInventory() {
        
        bloodbankinv=new ArrayList<>();
    }

    public ArrayList<Bloodtypeandquantity> getBloodbankinv() {
        return bloodbankinv;
    }

    public void setBloodbankinv(ArrayList<Bloodtypeandquantity> bloodbankinv) {
        this.bloodbankinv = bloodbankinv;
    }
    
    public Bloodtypeandquantity Addblood(Bloodtypeandquantity btq)
    {
        bloodbankinv.add(btq);
       return btq;
    }
    
    
    
}
