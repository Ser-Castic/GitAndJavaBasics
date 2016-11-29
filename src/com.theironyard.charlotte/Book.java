package com.theironyard.charlotte;

public class Book {

    String Author;
    String Title;
    boolean fiction;
    boolean hardCover;
    double usCost;
    double canadianCost;

    double plusUsTax (Book cost) {
        double tax = 0.0475;
        double price = this.usCost + cost.usCost;
        double result =  price * tax;
        double theResult = result + price;
        return theResult/2;
    }
}