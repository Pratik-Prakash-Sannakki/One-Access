/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Pharmacist;

import java.util.ArrayList;
import model.Organization;
import model.PharmacyCatalog.PharmacyCatalogDirectory;
import model.Role.PharamacyAdminRole;
import model.Role.Role;
/**
 *
 * @author adityaillur
 */
public class PharamacyAdmin extends Organization{
    private String name;
    private String pharlocation;

    public PharmacyCatalogDirectory getPharDir() {
        return pharDir;
    }

    public void setPharDir(PharmacyCatalogDirectory pharDir) {
        this.pharDir = pharDir;
    }
    PharmacyCatalogDirectory pharDir;

    public String getPharlocation() {
        return pharlocation;
    }

    public void setPharlocation(String pharlocation) {
        this.pharlocation = pharlocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
         @Override
    public String toString(){
        return name;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharamacyAdminRole());
        return roles;
    }
}
