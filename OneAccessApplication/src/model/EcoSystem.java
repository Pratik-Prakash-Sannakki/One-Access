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
public class EcoSystem extends Organization{
    private ArrayList<Network> networkList; 
    private static EcoSystem business;
  public Network createNetwork(String name){
      
        Network network=new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }
     public Network findNetwork(String name){
        
         
         for(Network net : networkList){
             if(net.getName().equals(name)){
                 return net;
             }
         }
         return null;
     }

   
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
