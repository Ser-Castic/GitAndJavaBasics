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


        }
}