package com.EugenePark;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // This gets called every time this class gets called
    public Account() {
        // the keyword 'this' is calling the constructor below
        //In order to set default values for the constructor params, this needs to be the first line in this constructor
        // if you don't give me params, then I will set the default params in this constructor like so...
        this("Default number", 1.50, "Default name", "Default address", "Default phone");
    }

    public Account(String number, double balance, String customerName, String customerEmail) {
        this(number, balance, customerName, customerEmail, "default phone number");
    }

    // The first two constructors call this constructor. The first two constructors above are just setting default values.
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Constructor with params called");
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
