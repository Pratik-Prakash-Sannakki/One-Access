/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.InsuranceAdmin;

import model.Organization;
import model.Role.InsuranceAdminRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class InsuranceeAdmin extends Organization{
    InsurancePlanDirectory insurancePlanDirectory;

    public InsurancePlanDirectory getInsurancePlanDirectory() {
        return insurancePlanDirectory;
    }

    public void setInsurancePlanDirectory(InsurancePlanDirectory insurancePlanDirectory) {
        this.insurancePlanDirectory = insurancePlanDirectory;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String name;

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAdminRole());
        return roles;
    }
}
