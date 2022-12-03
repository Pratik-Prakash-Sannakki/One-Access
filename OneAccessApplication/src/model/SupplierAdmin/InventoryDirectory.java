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

public class InventoryDirectory {
    ArrayList<Inventory> inventoryList = new ArrayList<>();

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
        public void getInventoryItem(Inventory inv) {
        inventoryList.add(inv);
    }

    public void deleteInventoryItem(Inventory inv) {
        inventoryList.remove(inv);
    }
    
        public void addInventory(Inventory i){
        inventoryList.add(i);
    }
        public Inventory findInventory(String name){
        
         
         for(Inventory doc : inventoryList){
             if(doc.getName().equals(name)){
                 return doc;
             }
         }
         return null;
     }
}

