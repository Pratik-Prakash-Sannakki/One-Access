/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import model.WorkQueue.WorkRequest;

/**
 *
 * @author adityaillur
 */
public class SubFeedback extends WorkRequest {
    String feed;
   
   
    public String getComment() {
        return feed;
    }

    public void setComment(String comment) {
        this.feed = comment;
    }
}