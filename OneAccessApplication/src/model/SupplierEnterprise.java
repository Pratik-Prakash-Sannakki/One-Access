/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.SupplierAdminRole;

/**
 *
 * @author pratiksannakki
 */
public class SupplierEnterprise extends Enterprise {

 
    
        public SupplierEnterprise(String name) {
         super(name,EnterpriseType.Supplier);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new SupplierAdminRole());
        return role;
    }

    
}
