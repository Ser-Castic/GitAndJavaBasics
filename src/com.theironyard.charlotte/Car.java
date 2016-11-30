package com.theironyard.charlotte;

public class Car {

    String make;
    String model;
    String type;
    String color;
    int year;
    int price;
    int apr;

    int monthlyPayments (Car cost) {

        int payment = cost.price;
        int portion = cost.apr;
        payment = (payment / 36);
        payment = payment / portion;

        return payment;
    }


}