/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import model.SupplierAdmin.Inventory;

/**
 *
 * @author adityaillur
 */
public class OrderInventoryWorkRequest {
     private List<Inventory> inventoryList = new ArrayList<Inventory>();

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
