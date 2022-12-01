/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.Date;
import model.UserAccount.UserAccount;

/**
 *
 * @author adityaillur
 */
public class WorkRequest {
    private String msg;
    private UserAccount sender;
    private UserAccount recevr;
    private String stat;
    private Date reqDate;
    private Date resDate;

    public UserAccount getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(UserAccount deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    private UserAccount deliveryMan;
    
    public WorkRequest(){
        reqDate = new Date();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getRecevr() {
        return recevr;
    }

    public void setRecevr(UserAccount recevr) {
        this.recevr = recevr;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getResDate() {
        return resDate;
    }

    @Override
    public String toString() {
        return sender.getEmployee().getName();
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }
}
