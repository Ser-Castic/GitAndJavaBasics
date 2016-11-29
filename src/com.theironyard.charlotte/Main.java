package com.theironyard.charlotte;

public class Main {
    public static void main(String[] args) {

        Bank acctOne = new Bank();
        Bank acctTwo = new Bank();

        acctOne.checkings = 40.0;
        acctOne.savings = 60.0;
        acctTwo.checkings = 10.0;
        acctTwo.savings = 90.0;

        System.out.println(acctOne.totalAmount(acctTwo));

        }
}