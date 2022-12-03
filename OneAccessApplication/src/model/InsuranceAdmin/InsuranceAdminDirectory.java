/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.InsuranceAdmin;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class InsuranceAdminDirectory {
    ArrayList<InsuranceeAdmin> insuranceList;

    public ArrayList<InsuranceeAdmin> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<InsuranceeAdmin> hospitalList) {
        this.insuranceList = hospitalList;
    }


    public InsuranceeAdmin createInsuranceeAdmin(String name){
        
        InsuranceeAdmin hosp = new InsuranceeAdmin();
        hosp.setName(name);
        
        insuranceList.add(hosp);
        return hosp;
    
    }

    public InsuranceAdminDirectory() {
        insuranceList = new ArrayList<>();
    }
     public InsuranceeAdmin findInsuranceAdmin(String name){
        
         
         for(InsuranceeAdmin doc : insuranceList){
             if(doc.getName().equals(name)){
                 return doc;
             }
         }
         return null;
     }
      public void deleteInsuranceAdmin(InsuranceeAdmin ins){
       insuranceList.remove(ins);
   }
}
