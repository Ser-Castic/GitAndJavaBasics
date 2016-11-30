package com.theironyard.charlotte;

public class Main {
    public static void main(String[] args) {

        Bank acctOne = new Bank();
        Bank acctTwo = new Bank();

        acctOne.checkings = 40.0;
        acctOne.savings = 60.0;
        acctTwo.checkings = 10.0;
        acctTwo.savings = 90.0;

        System.out.println("The total amount in both accounts: " + acctOne.totalAmount(acctTwo));

        Book bookOne = new Book();

        bookOne.Author = "Dr. Suess";
        bookOne.Title = "The Cat In The Hat";
        bookOne.fiction = true;
        bookOne.hardCover = true;
        bookOne.usCost = 7.99;
        bookOne.canadianCost = 14.99;

        System.out.println("\nName of the author is: " + bookOne.Author);
        System.out.println("The title of the book is: " + bookOne.Title);
        System.out.println("The book is fiction: " + bookOne.fiction);
        System.out.println("The book is hardcover: " + bookOne.hardCover);
        System.out.println("The book costs: " + bookOne.usCost + " US Currency");
        System.out.println("The book costs: " + bookOne.canadianCost + " Canadian Currency");

        System.out.println("The book cost in the US after sales tax is: " + bookOne.plusUsTax(bookOne));
        System.out.println("The book cost in Canada after sales tax is: " + bookOne.plusCanTax(bookOne));

        Card cardOne = new Card();
        Card cardTwo = new Card();
        Card cardThree = new Card();

        cardOne.nameTo = "Kayla";
        cardOne.nameFrom = "Sam";
        cardOne.contents = "Happy Hannukah";
        cardOne.holidayCard = true;
        cardOne.wellCard = false;
        cardOne.price = 7.99;

        cardTwo.nameTo = "Mom";
        cardTwo.nameFrom = "Son";
        cardTwo.contents = "Hope you feel better soon! Sending my love.";
        cardTwo.holidayCard = false;
        cardTwo.wellCard = true;
        cardTwo.price = 5.99;

        cardThree.holidayCard = true;
        cardThree.wellCard = true;

        System.out.println("The size of this holiday card is: " +cardOne.findDimension(cardOne));
        System.out.println("The size of this get well card is: " +cardOne.findDimension(cardTwo));
        System.out.println("The size of this card is: " +cardOne.findDimension(cardThree));

        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.make = "Honda";
        carOne.model = "Accord";
        carOne.type = "Sedan";
        carOne.color = "Black";
        carOne.year = 2014;
        carOne.price = 25000;
        carOne.apr = 13;

        carTwo.make = "Acura";
        carTwo.model = "NSX";
        carTwo.type = "Sports";
        carTwo.color = "Red";
        carTwo.year = 2012;
        carTwo.price = 50000;
        carTwo.apr = 13;

        System.out.println("The monthly payments for " + carTwo.make + " " + carTwo.model + " is: " + carOne.monthlyPayments(carTwo));

        Shoe shoeOne = new Shoe();

        shoeOne.brand = "Nike";
        shoeOne.type = "Soccer Cleats";
        shoeOne.size = 12;
        shoeOne.price = 79.99;
        shoeOne.velcro = false;
        }
}