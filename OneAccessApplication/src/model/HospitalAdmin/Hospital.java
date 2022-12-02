/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalAdmin;

import java.util.ArrayList;
import model.Doctor.DoctorDirectory;
import model.Organization;
import model.Patient.PatientDirectory;
import model.Role.HospitalAdminRole;
import model.Role.Role;

/**
 *
 * @author Akshatha
 */
public class Hospital extends Organization {
    String name;
    String address;
    DoctorDirectory docDirectory;
    PatientDirectory patDirectory;

    public PatientDirectory getPatientDirectory() {
        return patDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return docDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.docDirectory = doctorDirectory;
    }

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

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdminRole());
        return roles;
    }
}
