package com.hardwareStore;

public class Employee {
    private String firstName = "";
    private String lastName = "";
    private double monthlySalary = 0.0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary <= 0) {
            monthlySalary = 0;
        }else {
            this.monthlySalary = monthlySalary;
        }
    }
    public void raise(double amount){
        amount = amount * .01;
        this.monthlySalary= monthlySalary+= monthlySalary * amount;

    }



}
