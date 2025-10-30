package com.pluralsight;

import com.sun.jdi.Value;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;

public class Vehicle extends Asset {

    String makeModel;
    int year;
    int odometer;
    String color;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer, String color) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }



    @Override
    public double getValue() { // A car's value is determined as
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double v = 0;

        if (age <= 3) {// 0-3 years old
             v = originalCost * (1-0.03 * age);//  3% reduced value of cost per year
        } else if (age <= 6) { // 4-6 years old
            v = originalCost * (1-0.06 * age);// 6% reduced value of cost per year
        } else if (age <= 10) {// 7-10 years old
            v = originalCost * (1-0.08 * age);;// 8% reduced value of cost per year
        } else if (age > 10) { // over 10 years old
            v = 1000;// $1000.00
        }

        if (odometer >= 100000 && !(makeModel.contains ("Honda") || makeModel.contains("Toyota"))) {
        // MINUS  reduce final value by 25% if over 100,000 miles
            //   unless makeModel contains word Honda or Toyota
            v = v * .75;
        }
        return v;
    }
}
