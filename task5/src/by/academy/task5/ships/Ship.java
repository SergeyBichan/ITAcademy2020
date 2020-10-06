package by.academy.task5.ships;

import by.academy.task5.deck.Deck;

import java.util.Arrays;


public class Ship {
    int numOfDecks;
    private Deck[] decks;
    private int count;

    @Override
    public String toString() {
        return "\nShip{" +
                "decks=" + Arrays.toString(decks) +
                ", количество палуб=" + count +
                '}' + "\n";
    }


    public double getMass() {
        int i = 0;
        double mass = 0;
        while (i < count) {
            mass += decks[i].getMass();
            i++;
        }
        return (long)mass;
    }

    public int getNumOfDecks() {
        return numOfDecks;
    }

    public void setNumOfDecks(int numOfDecks) {
        this.numOfDecks = numOfDecks;
    }

    public Ship(int deckCount) {
        this.decks = new Deck[deckCount];
    }

    public void add(Deck deck) {
        if (count < decks.length) {
            if (decks[count] == null)
                decks[count] = deck;
            count++;
        }
    }
}
