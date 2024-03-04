package com.koboldhunters.beaver.model;

public class Customer extends Person{
    private long id;
    private int pin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
