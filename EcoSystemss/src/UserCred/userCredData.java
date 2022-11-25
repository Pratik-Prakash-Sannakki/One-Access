/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserCred;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class userCredData {
    
    
    private  ArrayList<userCred>  userData;
    
   public userCredData() {
       this.userData=new ArrayList<userCred>();
}

    public  ArrayList<userCred> getUserData() {
        return userData;
    }

    public void setUserData(ArrayList<userCred> userData) {
        this.userData = userData;
    }
   public  userCred addDetails(){
    
    userCred usd = new userCred();
    userData.add(usd);
    return usd;
    
    }
   public void deleteDetails(userCred pe)
    {
    
    userData.remove(pe);
    
    
    }
    
}
