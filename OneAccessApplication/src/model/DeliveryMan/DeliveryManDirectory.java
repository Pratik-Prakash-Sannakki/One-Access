/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author Akshatha
 */
public class DeliveryManDirectory {
            ArrayList<DeliveryMan> deliveryList;
    
    public DeliveryManDirectory(){
        this.deliveryList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(ArrayList<DeliveryMan> deliveryList) {
        this.deliveryList = deliveryList;
    }


public DeliveryMan createDeliveryMan(String name){
       
       DeliveryMan dm = new DeliveryMan();
       dm.setDeliveryManName(name);
      // dm.setUsername(username);
       deliveryList.add(dm);
       return dm;      
       
   }
   
   public DeliveryMan findDeliveryMan(String name){
       for(DeliveryMan dm :deliveryList ){
           
           if(dm.getDeliveryManName().equals(name)){
               return dm;
           }
       }
       return null;
   }
   
   public void deleteDeliveryMan(DeliveryMan deliveryMan){
       deliveryList.remove(deliveryMan);
   }
}
