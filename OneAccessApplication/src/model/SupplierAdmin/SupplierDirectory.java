/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.SupplierAdmin;

import java.util.ArrayList;

/**
 *
 * @author Akshatha
 */
public class SupplierDirectory {
    
    ArrayList<Supplier> supplierDirectory = new ArrayList<>();

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(ArrayList<Supplier> logisticsDirectory) {
        this.supplierDirectory = logisticsDirectory;
    }
    
    public Supplier createSupplier(String name)  {
        Supplier l = new Supplier(name);
        supplierDirectory.add(l);
        return l;
    }
    public boolean doesSupplierExist(String name){
        for(Supplier ic: supplierDirectory){
            if (ic.getName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    
    public Supplier findSupplier(String name){
        for(Supplier ic: supplierDirectory) {
            if(ic.getName().equals(name)){
                return ic;
            }
        }
        Supplier l = new Supplier(name);
        return l;
    }
    
    public void deleteSupplier(Supplier ic){
        supplierDirectory.remove(ic);
    }
    
    
}

