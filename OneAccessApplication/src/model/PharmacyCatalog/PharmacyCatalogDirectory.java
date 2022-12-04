/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PharmacyCatalog;

import java.util.ArrayList;

/**
 *
 * @author adityaillur
 */
public class PharmacyCatalogDirectory {
            ArrayList<PharmacyCatalog> catalog;
    
    public PharmacyCatalogDirectory(){
        this.catalog = new ArrayList<>();
        
    }

    public ArrayList<PharmacyCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<PharmacyCatalog> catalog) {
        this.catalog = catalog;
    }
}
