package by.academy.task5;

import by.academy.task5.container.*;
import by.academy.task5.deck.Deck;


import java.util.Arrays;

import static by.academy.task5.constant.Constant.*;

public class Runner {
    public static void main(String[] args) {
        Container first = new Cone("Конус большой", 10, 50, DENSITY_2000);
        Container second = new ConeSmall("Маленький конус", 50, 60, DENSITY_1000);
        Container third = new Cylinder("Цилиндр большой", 90, 10, DENSITY_2000);
        Container fourth = new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000);
        Container fifth = new Square("Большой квадрат", 25, 70, DENSITY_2000);
        Container sixth = new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000);

        //Container[] cont = new Container[4];


        Deck deck = new Deck(4);
        Deck singleDeck = new Deck(2);
        deck.add(first);
        deck.add(second);
        deck.add(third);
        deck.add(fourth);
        deck.add(sixth);
        deck.add(fifth);
//
////        singleDeck.add(first);
////        singleDeck.add(second);
//        singleDeck.add(third);


//        deck.add(second);


        System.out.println(Arrays.toString(deck.getContainers()));
        System.out.println();



    }
}
