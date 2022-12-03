/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.LabAdmin;

import model.Organization;
import model.Role.LabAdminRole;
import model.Role.Role;
import model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class Lab extends Organization {
    String name;
    String address;
    String phoneNumber;
    TestDirectory testlist;


    public Lab(String name) {

        this.name = name; //To change body of generated methods, choose Tools | Templates.
        testlist = new TestDirectory();
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

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TestDirectory getTestlist() {
        return testlist;
    }

    public void setTestlist(TestDirectory testlist) {
        this.testlist = testlist;
    }
    
    public void deleteTest(Test t){
        testlist.getTestList().remove(t);
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
               ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Lab(){
        testlist = new TestDirectory();
    
    }
    
 
}
