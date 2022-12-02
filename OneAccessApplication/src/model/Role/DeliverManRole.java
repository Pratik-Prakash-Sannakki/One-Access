/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

/**
 *
 * @author Akshatha
 */

import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;



public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem model) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,model);//To change body of generated methods, choose Tools | Templates.
    }
    
}
