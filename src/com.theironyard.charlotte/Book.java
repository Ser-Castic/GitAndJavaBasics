package com.theironyard.charlotte;

public class Book {

    String Author;
    String Title;
    boolean fiction;
    boolean hardCover;
    double usCost;
    double canadianCost;
    // Method Calculates book price after sales tax in the US
    double plusUsTax (Book cost) {
        double tax = 0.0475;
        double price = this.usCost + cost.usCost;
        double result =  price * tax;
        double theResult = result + price;
        return theResult/2;
    }
    // Method Calculates book price after sales tax in Canada
    double plusCanTax (Book cost) {
        double tax = 0.13;
        double price = this.canadianCost + cost.canadianCost;
        double result =  price * tax;
        double theResult = result + price;
        return theResult/2;
    }
}