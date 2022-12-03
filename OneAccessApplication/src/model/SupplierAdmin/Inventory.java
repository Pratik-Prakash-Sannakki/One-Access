/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.SupplierAdmin;

/**
 *
 * @author Akshatha
 */
public class Inventory {
    String name;
    String manufacturername;
    int productprice;
    int availability;

    public Inventory() {
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturername() {
        return manufacturername;
    }

    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

  

    public Inventory(String name, String manufacturer, Integer price, int availability) {
        this.name = name;
        this.manufacturername = manufacturer;
        this.productprice = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
    
    
    
}

