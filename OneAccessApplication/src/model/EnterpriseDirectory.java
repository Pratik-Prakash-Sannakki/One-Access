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
public class EnterpriseDirectory {
      private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
      public Enterprise findEnterprise(String name){
        
         
         for(Enterprise net : enterpriseList){
             if(net.getName().equals(name)){
                 return net;
             }
         }
         return null;
     }
      public Enterprise findEnterpriseType(String type){
        
         
         for(Enterprise net : enterpriseList){
             if(net.getEnterpriseType().getValue().equals(type)){
                 return net;
             }
         }
         return null;
     }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
  

    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new PharmacyEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Lab){
            enterprise=new LabEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Delivery){
            enterprise=new DeliveryEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Insurance){
            enterprise=new InsuranceEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Emergency){
            enterprise=new EmergencyEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Supplier){
            enterprise=new SupplierEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
