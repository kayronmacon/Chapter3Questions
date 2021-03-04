package com.hardwareStore;
import com.hardwareStore.exceptions.wrongNumberException;

public class Date {
    private int month;
    private int day;
    private int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 0 || month >12){
            throw new wrongNumberException();
        }else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 0 || day >31){
            throw new wrongNumberException();
        }else {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2100){
            throw new wrongNumberException();
        } else {
            this.year = year;
        }
    }
    public String displayDate(){
        return ""+ this.getDay()+"/"+this.getMonth()+"/"+this.getYear()+"";
    }


}
