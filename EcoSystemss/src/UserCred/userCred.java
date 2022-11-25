/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserCred;

/**
 *
 * @author pratiksannakki
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pratiksannakki
 */
public class userCred {
    String userType;
    String UID;
    String UserName;
    String pwd;

    public userCred() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
    

    public String getUserType() {
        return userType;
    }

    public String getUID() {
        return UID;
    }

    public String getPwd() {
        return pwd;
    }

    private void populatedata() {
        
        
    }
    
    
    
}
