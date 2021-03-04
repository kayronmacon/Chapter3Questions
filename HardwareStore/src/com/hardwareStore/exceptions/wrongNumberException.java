package com.hardwareStore.exceptions;


public class wrongNumberException extends RuntimeException {
    public wrongNumberException() {
        super();
        System.out.println("Wrong input number");
    }
}
