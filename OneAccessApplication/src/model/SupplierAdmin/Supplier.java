/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.SupplierAdmin;

import java.util.ArrayList;
import model.Organization;
import model.Role.Role;
import model.Role.SupplierAdminRole;

/**
 *
 * @author Akshatha
 */
public class Supplier extends Organization{
    
    String name;
    String address;
    String PhoneNumber;
    InventoryDirectory inventoryDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }

    
    public Supplier(String name){
        this.name = name;
        inventoryDirectory = new InventoryDirectory();
    }

    public void deleteInventory(Inventory i){
        inventoryDirectory.getInventoryList().remove(i);
    }
    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
        public Supplier(){
        inventoryDirectory = new InventoryDirectory();
    
    }
       
    
    
    
}