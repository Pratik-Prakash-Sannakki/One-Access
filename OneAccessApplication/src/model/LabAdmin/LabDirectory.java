/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.LabAdmin;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class LabDirectory {
    ArrayList<Lab> labList = new ArrayList<>();

    public ArrayList<Lab> getLabList() {
        return labList;
    }

    public void setLabList(ArrayList<Lab> labList) {
        this.labList = labList;
    }
    
        public Lab createLab(String name){
        
        Lab lab = new Lab();
        lab.setName(name);
//        lab.setAddress(address);
//        lab.setPhoneNumber(phone);
       // phar.setPharlocation(location);
        labList.add(lab);
        return lab;
    
    }
        
    public boolean doesLabExist(String name){
        for(Lab l: labList){
            if (l.getName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    
    public Lab findLab(String name){
        for(Lab l: labList) {
            if(l.getName().equals(name)){
                return l;
            }
        }
        Lab l = new Lab(name);
        return l;
    }
    
    public void deleteLab(Lab l){
        labList.remove(l);
    }
}
