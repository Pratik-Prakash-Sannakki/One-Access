/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adityaillur
 */
public class PlaceNewOrderWorkRequest {
    private int orderId;
    private static int count = 1;
    private List<PharmacyOrder> orderTot = new ArrayList<PharmacyOrder>();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        this.orderId = orderId;
    }

    public List<PharmacyOrder> getOrderTot() {
        return orderTot;
    }

    public void setOrderTot(List<PharmacyOrder> orderTot) {
        this.orderTot = orderTot;
    }

    public PharmacyOrder addItem(PharmacyOrder orderItemTotal) {
        orderTot.add(orderItemTotal);
        return orderItemTotal;
    }
        public PlaceNewOrderWorkRequest(){
        orderId = count;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PlaceNewOrderWorkRequest.count = count;
    }
}
