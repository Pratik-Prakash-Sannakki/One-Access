/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

/**
 *
 * @author Akshatha
 */

import javax.management.relation.Role;
import userinterface.HospitalAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer,business,account);
    }

