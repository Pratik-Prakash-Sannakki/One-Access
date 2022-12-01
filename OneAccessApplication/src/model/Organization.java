/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public abstract class Organization {

     String name;
     Type enterpriseType1;
      

    public Type getEnterpriseType1() {
        return enterpriseType1;
    }

    public void setEnterpriseType1(Type enterpriseType) {
        this.enterpriseType1 = enterpriseType;
    }


   
   
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
   
    private int organizationID;
    private static int counter=1;
    
    public enum Type{
        HospitalAdmin("HospitalAdmin"),
        Patient("Patient"),
        DeliveryMan("DeliveryMan"),
        SysAdmin("Sysadmin"),
        LabAdmin("LabAdmin"),
        InsuranceAdmin("InsuranceAdmin"),
        Doctor("Doctor"),
        SupportAdmin("SupportAdmin"),
        EmergencyAdmin("EmergencyAdmin"),
        SupplierAdmin("SupplierAdmin"),
        PharamacyAdmin("PharamacyAdmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
       
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

