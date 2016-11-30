package com.theironyard.charlotte;

public class Card {

    String nameTo;
    String nameFrom;
    String contents;
    boolean holidayCard;
    boolean wellCard;
    double price;

    String findDimension (Card type) {

        String sizeOne = "9x9";
        String sizeTwo = "8x10";
        String errorMessage = "Size not found";
        boolean holCheck = type.holidayCard;
        boolean wellCheck = type.wellCard;
        if (holCheck == true && wellCheck == false) {
            return sizeOne;
        } else if (wellCheck == true && holCheck == false) {
            return sizeTwo;
        } else {
            return errorMessage;
        }
    }
}