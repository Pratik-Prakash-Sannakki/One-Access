/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import UI.PharmacyAdmin.PharamacyAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Akshatha
 */
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class PharamacyAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
         return new PharamacyAdminJPanel(userProcessContainer,account,business);
    }
    
}
