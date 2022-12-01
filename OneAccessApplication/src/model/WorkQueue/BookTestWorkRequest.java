/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.LabAdmin.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adityaillur
 */
public class BookTestWorkRequest {
    private int testID;
    private static int count = 1;
    private Date dateBooked;
    private List<Test> testList = new ArrayList<Test>();

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BookTestWorkRequest.count = count;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public Date getdateBooked() {
        return dateBooked;
    }

    public void setdateBooked(Date dateBooked) {
        this.dateBooked = dateBooked;
    }
}
