package com.company;

public class Cards {

    int [] cards = new int[52];

    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"ace","2","3","4","5","6","7","8","9","10","knight","queen","king"};


    public void createCards(){
        for (int i =0; i< cards.length;i++) {
            String suit = suits[i / 13];
            String rank = ranks[i % 13];
            Card temp = new Card (suit,rank);
            System.out.println(temp);

        }

    }

}
