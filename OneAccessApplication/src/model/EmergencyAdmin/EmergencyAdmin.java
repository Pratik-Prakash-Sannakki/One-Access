/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.EmergencyAdmin;

import model.Organization;
import model.Role.EmergencyAdminRole;
import model.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author adityaillur
 */
public class EmergencyAdmin extends Organization{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyAdminRole());
        return roles;
    }
}
