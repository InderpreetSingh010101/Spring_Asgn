package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;

// Create a class Address for Author with instance variables streetNumber, location, State.

@Embeddable
public class Address {


    private int street_number ;
    private String location ;
    private String state ;

    public int getStreet_number() {
        return street_number;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public void setStreet_number(int street_number) {
        this.street_number = street_number;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
