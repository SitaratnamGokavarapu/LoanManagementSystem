package com.loan;

public class Customer {

    String name;
    int age;
    double balance;
    long phone;
    String email;
    String city, state, country;
    int pincode;
    String pan;

    public Customer(String name, int age, double balance, long phone,
                    String email,String city, String state,
                    String country, int pincode, String pan) {

        this.name = name;
        this.age = age;
        this.balance = balance;
        this.phone = phone;
        this.email=email;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.pan = pan;
    }
}
