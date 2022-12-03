/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.LabAdmin;

/**
 *
 * @author pratiksannakki
 */
public class Test {
    
    String name; //name of the test
    String sample; // sample to be collected for test
    Double lowerRange; //Reference lower cap of value to be considered as Normal
    Double upperRange; //Reference upper cap of value to be considered as Normal
    String apparatus; //Method or apparatus used for sampling
    Double price; //price of the test

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public Double getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(Double lowerRange) {
        this.lowerRange = lowerRange;
    }

    public Double getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(Double upperRange) {
        this.upperRange = upperRange;
    }


    public String getApparatus() {
        return apparatus;
    }

    public void setApparatus(String apparatus) {
        this.apparatus = apparatus;
    }

    public Test(String name, String sample, Double lowerRange, Double upperRange, String apparatus, Double price) {
        this.name = name;
        this.sample = sample;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
        this.apparatus = apparatus;
        this.price = price;
    }

    @Override
    public String toString() {
        return name ;
    }
    
    
}
