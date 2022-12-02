/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalAdmin;

import java.util.ArrayList;

/**
 *
 * @author Akshatha
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }


    public Hospital createHospital(String name, String address){
        
        Hospital hos = new Hospital();
        hos.setName(name);
        hos.setAddress(address);
        
        hospitalList.add(hos);
        return hos;
    
    }

    public HospitalDirectory() {
        hospitalList = new ArrayList<>();
    }
     public Hospital findHospital(String name){
        
         
         for(Hospital doc : hospitalList){
             if(doc.getName().equals(name)){
                 return doc;
             }
         }
         return null;
     }
      public void deleteDoctor(Hospital hos){
       hospitalList.remove(hos);
   }
}

