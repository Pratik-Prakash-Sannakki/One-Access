/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import java.util.ArrayList;

/**
 *
 * @author adityaillur
 */
public class PatientDirectory {
    ArrayList<Patient> patList;

    public PatientDirectory() {
        patList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatList() {
        return patList;
    }

    public void setPatList(ArrayList<Patient> patList) {
        this.patList = patList;
    }
     public Patient createPatient(String name){
        
        Patient pa = new Patient();
        pa.setName(name);
        
        patList.add(pa);
        return pa;
    }
     public Patient findPatient(String name){
        
         
         for(Patient pa : patList){
             if(pa.getName().equals(name)){
                 return pa;
             }
         }
         return null;
     }
      public void deleteDoctor(Patient pa){
       patList.remove(pa);
   }
}
