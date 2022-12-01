/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Role.LabAdminRole;
import model.Role.Role;

/**
 *
 * @author pratiksannakki
 */
public class LabEnterprise extends Enterprise {

     public LabEnterprise(String name) {
         super(name,EnterpriseType.Lab);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new LabAdminRole());
        return role;
    }

   
    
}
