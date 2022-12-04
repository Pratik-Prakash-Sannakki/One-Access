/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Pharmacist;

import java.util.ArrayList;

/**
 *
 * @author adityaillur
 */
public class PharamacyAdminDirectory {
    public PharamacyAdminDirectory(ArrayList<PharamacyAdmin> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }
    ArrayList<PharamacyAdmin> pharmacyList;

    public ArrayList<PharamacyAdmin> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<PharamacyAdmin> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }
            public PharamacyAdmin createPharmacy(String name){
        
        PharamacyAdmin phar = new PharamacyAdmin();
        phar.setName(name);;
       // phar.setPharlocation(location);
        pharmacyList.add(phar);
        return phar;
    
    }
     public PharamacyAdmin findPharmacy(String name){
        
         
         for(PharamacyAdmin phar : pharmacyList){
             if(phar.getName().equals(name)){
                 return phar;
             }
         }
         return null;
     }

    public PharamacyAdminDirectory() {
        pharmacyList = new ArrayList<>();
    }
    
}
