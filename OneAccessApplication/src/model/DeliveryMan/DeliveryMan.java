/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DeliveryMan;

import java.util.ArrayList;
import model.Organization;
import model.Role.DeliverManRole;
import model.Role.Role;

/**
 *
 * @author Akshatha
 */
public class DeliveryMan extends Organization{
       String deliveryManName;
    

    public String getDeliveryManName() {
        return deliveryManName;
    }

    
    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }


    
    @Override
    public String toString(){
        return deliveryManName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliverManRole());
        return roles;
    }
    
}