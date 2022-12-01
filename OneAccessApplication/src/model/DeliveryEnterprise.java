/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Role.DeliverManRole;
import model.Role.Role;

/**
 *
 * @author pratiksannakki
 */
public class DeliveryEnterprise extends Enterprise {

    public DeliveryEnterprise(String name) {
         super(name,Enterprise.EnterpriseType.Delivery);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new DeliverManRole());
        return role;
    }
   
}

