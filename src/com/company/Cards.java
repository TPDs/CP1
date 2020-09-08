package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Cards {

    ArrayList<Card> deck = new ArrayList<>();

    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"ace","2","3","4","5","6","7","8","9","10","knight","queen","king"};


    public void createCards(){
        for (int i =0; i < 52;i++) {
            String suit = suits[i / 13];
            String rank = ranks[i % 13];
            Card temp = new Card (suit,rank,i);
            deck.add(temp);
           // System.out.println(temp);

        }

    }

    public void shuffel() {
        Collections.shuffle(deck);
        System.out.println(deck.get(2).value); // test

    }

    public void firstcard() {
        System.out.println(deck.get(0));
        Card removed = deck.get(0);
        deck.remove(0);
        System.out.println(deck.get(0));

        System.out.println(removed + " er blevet fjernet");


    }

    public void leftOver() {
        System.out.println(deck.size());
    }
}
