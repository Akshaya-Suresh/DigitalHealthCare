/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminServiceRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akshayasuresh
 */
public class AdminServicesOrganization extends Organization{
      public AdminServicesOrganization() {
        super(Organization.Type.AdminServices.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
            roles.add(new AdminServiceRole());
        return roles;
    }
}
