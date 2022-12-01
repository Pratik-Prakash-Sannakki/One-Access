/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Role.HospitalAdminRole;
import model.Role.Role;

/**
 *
 * @author pratiksannakki
 */


public class HospitalEnterprise extends Enterprise {
   
    public HospitalEnterprise(String name) {
         super(name,Enterprise.EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HospitalAdminRole());
        return role;
    }
    
}
