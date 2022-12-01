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
import userinterface.InsuranceAdmin.InsuranceAdminJPanel;


public class InsuranceAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new InsuranceAdminJPanel(userProcessContainer,business,account);
    }
    
}
