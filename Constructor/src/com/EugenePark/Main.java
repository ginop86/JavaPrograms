package com.EugenePark;

public class Main {

    public static void main(String[] args) {

        // call constructor with default values
        Account number2 = new Account();
        System.out.println(number2.getCustomerPhone());

        //call constructor with values that is only missing the customer phone
        Account number3 = new Account("234", 2.00, "eugene from number 3", "xyz@gmail.com");
        System.out.println(number3.getCustomerPhone());

        //call constructor with all params passed
        Account eugeneAccount = new Account("123", 0.00, "Eugene Park", "abc@gmail.com", "123-234-2345");
        System.out.println(eugeneAccount.getCustomerPhone());


    }
}
