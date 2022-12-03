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
public class TestDirectory {
    ArrayList<Test> testList = new ArrayList<>();

    public ArrayList<Test> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Test> testList) {
        this.testList = testList;
    }
    
    public void addTest(Test t) {
        testList.add(t);
    }
    
     public Test findTest(String name){
        
         
         for(Test t : testList){
             if(t.getName().equals(name)){
                 return t;
             }
         }
         return null;
     }
}
