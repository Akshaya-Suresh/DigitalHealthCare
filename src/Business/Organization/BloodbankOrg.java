/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Bloodbankinventory.BloodbankInventory;
import Business.Role.BloodbankRole;
import Business.Role.DistributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BloodbankOrg extends Organization{
    private BloodbankInventory bbi;
    public BloodbankOrg() {
        super(Organization.Type.BloodBank.getValue());
        bbi=new BloodbankInventory();
    }
    
        public BloodbankInventory getBbi() {
        return bbi;
    }

    public void setBbi(BloodbankInventory bbi) {
        this.bbi = bbi;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BloodbankRole());
        return roles;
    }
    
}
