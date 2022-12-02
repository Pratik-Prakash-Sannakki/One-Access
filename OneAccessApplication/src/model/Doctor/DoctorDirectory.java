/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Doctor;

import java.util.ArrayList;

/**
 *
 * @author Akshatha
 */
public class DoctorDirectory {
    ArrayList<Doctor> docList;
    

    public DoctorDirectory() {
        docList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor> docList) {
        this.docList = docList;
    }
    public Doctor createDoctor(String name, String specialization){
        
        Doctor doc = new Doctor();
        doc.setName(name);
        doc.setSpecialization(specialization);
        
        docList.add(doc);
        return doc;
    
    }
     public Doctor findDoctor(String name){
        
         
         for(Doctor doc : docList){
             if(doc.getName().equals(name)){
                 return doc;
             }
         }
         return null;
     }
      public void deleteDoctor(Doctor doc){
       docList.remove(doc);
   }
}

