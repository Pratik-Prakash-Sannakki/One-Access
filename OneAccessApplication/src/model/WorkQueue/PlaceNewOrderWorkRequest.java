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
public class PlaceNewOrderWorkRequest extends WorkRequest {
    private int orderId;
    private static int count = 1;
    private List<PharmacyOrder> orderTotal = new ArrayList<PharmacyOrder>();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        this.orderId = orderId;
    }

    public List<PharmacyOrder> getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(List<PharmacyOrder> orderTotal) {
        this.orderTotal = orderTotal;
    }

    public PharmacyOrder addItem(PharmacyOrder orderItemTotal) {
        orderTotal.add(orderItemTotal);
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
