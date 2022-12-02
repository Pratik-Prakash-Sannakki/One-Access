/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Doctor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Organization;
import model.Patient.Patient;
import model.Role.DoctorRole;
import model.Role.Role;

/**
 *
 * @author Akshatha
 */
public class Doctor extends Organization {
    String name;
    String comments;
    List<String> timings ;

     @Override
    public String toString(){
        return name;
    }

    public List<String> getTimings() {
        return timings;
    }

    public void setTimings(List<String> timings) {
        this.timings = timings;
    }
    ArrayList<Patient> doctorPatientList;

    public Doctor() {
        doctorPatientList = new ArrayList<>();
        timings = new ArrayList<>(Arrays.asList("8am", "9am","10am", "11am","12pm", "1pm","2pm", "3pm","4pm"));
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    public ArrayList<Patient> getDoctorPatientList() {
        return doctorPatientList;
    }

     public void setDoctorPatientList(ArrayList<Patient> doctorPatientList) {
        this.doctorPatientList = doctorPatientList;
    }

public void addPatientsToDoctor(Patient p)
{
   
    doctorPatientList.add(p);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    String specialization;
    
    public void updateTimings(String time){
        System.out.println("time"+time);
        timings.remove(time);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
    
    
}