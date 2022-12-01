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

public abstract class Role {
    
    public enum RoleType{
        HospitalAdmin("HospitalAdmin"),
        Patient("Patient"),
        DeliveryMan("DeliveryMan"),
        SysAdmin("Sysadmin"),
        InsuranceAdmin("InsuranceAdmin"),
        PharamacyAdmin("PharamacyAdmin"),
        SupportAdmin("SupportAdmin"),
        EmergencyAdmin("EmergencyAdmin"),
        VoluntaryAdmin("VoluntaryAdmin"),
        LabAdmin("LabAdmin"),
        Doctor("Doctor");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
