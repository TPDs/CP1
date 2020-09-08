package com.company;

public class Card {

    String rank;
    String suit;
    int value;

    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + " of "  + rank + " og dens value er " + value;
    }
}
