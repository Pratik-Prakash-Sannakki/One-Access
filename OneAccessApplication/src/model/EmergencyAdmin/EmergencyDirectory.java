/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.EmergencyAdmin;

import java.util.ArrayList;

/**
 *
 * @author adityaillur
 */
public class EmergencyDirectory {
        ArrayList<Emergency> emergencyUnitDirectory = new ArrayList<>();

    public ArrayList<Emergency> getEmergencyUnitDirectory() {
        return emergencyUnitDirectory;
    }

    public void setEmergencyUnitDirectory(ArrayList<Emergency> emergencyUnitDirectory) {
        this.emergencyUnitDirectory = emergencyUnitDirectory;
    }


    
        public Emergency createEmergencyUnit(String name){
        
        Emergency unit = new Emergency(name);
        emergencyUnitDirectory.add(unit);
        return unit;
    
    }
        
    public boolean doesEmergencyUnitExist(String name){
        for(Emergency unit: emergencyUnitDirectory){
            if (unit.getEmergencyUnitName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    
    public Emergency findEmergency(String name){
        for(Emergency l: emergencyUnitDirectory) {
            if(l.getEmergencyUnitName().equals(name)){
                return l;
            }
        }
        Emergency l = new Emergency(name);
        return l;
    }
    
    public void deleteEmergency(Emergency l){
        emergencyUnitDirectory.remove(l);
    }
}
