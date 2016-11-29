package com.theironyard.charlotte;

public class Bank {

    double checkings;
    double savings;

    double totalAmount (Bank end) {

        //sets the checkings and savings accounts
        double check = this.checkings + end.checkings;
        double save = this.savings + end.savings;
        //sets the sum of the checkings and savings accounts
        double total = check + save;
        return total;
    }
}