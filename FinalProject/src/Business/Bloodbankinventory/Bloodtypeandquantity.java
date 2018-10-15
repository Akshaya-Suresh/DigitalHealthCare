/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bloodbankinventory;

/**
 *
 * @author Admin
 */
public class Bloodtypeandquantity {
    String Bloodtype;
    int Quantity;

    public String getBloodtype() {
        return Bloodtype;
    }

    public void setBloodtype(String Bloodtype) {
        this.Bloodtype = Bloodtype;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    @Override
    public String toString(){
        return Bloodtype;
    }
    
    
    
}
