/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import java.util.ArrayList;
import model.Role.Role;
import model.Organization;
import model.Role.CustomerRole;

/**
 *
 * @author adityaillur
 */
    public class Patient extends Organization{
    String name;
    String age;
    String comment;
    String symptom;

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
    Medicine med;

   

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Medicine getMed() {
        return med;
    }

    public void setMed(Medicine med) {
        this.med = med;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList();
    roles.add(new CustomerRole());
    return roles;
    }
}
