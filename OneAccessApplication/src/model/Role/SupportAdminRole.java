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
import userinterface.SupportAdmin.SupportJPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ash
 */
public class SupportAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
       return new SupportJPanel(userProcessContainer, business,account);  }
    
}
