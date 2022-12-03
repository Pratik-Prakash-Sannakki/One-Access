/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.InsuranceAdmin;

/**
 *
 * @author pratiksannakki
 */
public class InsurancePlan {
    String name;
    int totalYears;
    double monthlyPremium;
    double totalPremium;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalYears() {
        return totalYears;
    }

    public void setTotalYears(int totalYears) {
        this.totalYears = totalYears;
    }



    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(double monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public double getTotalPremium() {
        return monthlyPremium * totalYears;
    }

    public void setTotalPremium() {
        this.totalPremium = monthlyPremium * totalYears;
    }

    
    @Override
    public String toString() {
        return name ;
    }

    public InsurancePlan(String name, int totalYears, double monthlyPremium, double totalPremium) {
        this.name = name;
        this.totalYears = totalYears;
        this.monthlyPremium = monthlyPremium;
        this.totalPremium = totalPremium;
    }
    
    
}
