/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;
import model.UserAccount.UserAccount;

/**
 *
 * @author adityaillur
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workReqList;

    public WorkQueue() {
        workReqList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workReqList;
    }
    public void addWorkRequest(WorkRequest workRequest) {
        workReqList.add(workRequest);
    }
    public  ArrayList<WorkRequest> findWorkRequest(UserAccount name){
        ArrayList<WorkRequest> array1 = new ArrayList<>();
         
        for(WorkRequest net : workReqList){
            if(net.getRecevr().equals(name)){
                
                array1.add(net);
                //return array1;
            }
        }
         return array1;
         // null;
    }
    public  ArrayList<WorkRequest> findWorkRequestByRec(UserAccount name){
        ArrayList<WorkRequest> array1 = new ArrayList<>();
         
        for(WorkRequest net : workReqList){
            if(net.getSender().equals(name)){
                
                array1.add(net);
                //return array1;
            }
        }
        return array1;
         // null;
    }
}
