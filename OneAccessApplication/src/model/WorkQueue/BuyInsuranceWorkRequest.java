/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.InsuranceAdmin.InsurancePlan;

/**
 *
 * @author adityaillur
 */
public class BuyInsuranceWorkRequest extends WorkRequest {
    InsurancePlan plan;

    public InsurancePlan getPlan() {
        return plan;
    }

    public void setPlan(InsurancePlan plan) {
        this.plan = plan;
    }
}
