/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

/**
 *
 * @author Akshatha
 */
public class Employee {
    
    private String name;
    private String city;
    
    public String getCity() {
        return city;
    }
private boolean hasInsurance;
   

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }
    public void setCity(String city) {
        this.city = city;
    }
    private int id;
    private static int count = 1;

    public Employee() {
        
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
