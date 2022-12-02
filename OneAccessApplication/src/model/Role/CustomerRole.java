/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

/**
 *
 * @author Akshatha
 */


import UI.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;

public class CustomerRole extends Role{

    public CustomerRole() {
    }

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem model) {
        return new CustomerAreaJPanel(userProcessContainer, account,model);
    }
    
    
}