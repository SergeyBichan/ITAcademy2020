package by.academy.task5;

import by.academy.task5.container.*;
import by.academy.task5.deck.Deck;
import by.academy.task5.port.SeaPort;
import by.academy.task5.ships.Ship;


import static by.academy.task5.constant.Constant.*;

public class Runner {
    public static void main(String[] args) {
        Container first = new Cone("Конус большой", 10, 50, DENSITY_2000);
        Container second = new ConeSmall("Маленький конус", 50, 60, DENSITY_1000);
        Container third = new Cylinder("Цилиндр большой", 90, 10, DENSITY_2000);
        Container fourth = new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000);
        Container fifth = new Square("Большой квадрат", 25, 70, DENSITY_2000);
        Container sixth = new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000);

        Deck deck1 = new Deck(4);
        Deck deck2 = new Deck(2);
        Deck deck3 = new Deck(4);
        Deck deck4 = new Deck(2);
        Deck deck5 = new Deck(4);
        Deck deck6 = new Deck(2);
        Deck deck7 = new Deck(4);
        Deck deck8 = new Deck(2);
        Deck deck9 = new Deck(4);
        Deck deck10 = new Deck(2);


        deck1.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));
        deck1.add(new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000));
        deck1.add(new SmallCylinder("Малый цилиндр", 55, 44, DENSITY_1000));
        deck1.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));

        deck2.add(new Square("Большой квадрат", 25, 70, DENSITY_2000));
        deck2.add(new Cylinder("Цилиндр большой", 90, 10, DENSITY_2000));


        deck3.add(new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000));
        deck3.add(new SmallCylinder("Малый цилиндр", 55, 44, DENSITY_1000));
        deck3.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));
        deck3.add(new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000));

        deck4.add(new Square("Большой квадрат", 25, 70, DENSITY_2000));
        deck4.add(new Cylinder("Цилиндр большой", 90, 10, DENSITY_2000));

        deck5.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));
        deck5.add(new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000));
        deck5.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));
        deck5.add(new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000));

        deck6.add(new Cone("Конус большой", 10, 50, DENSITY_2000));
        deck6.add(new Square("Большой квадрат", 25, 70, DENSITY_2000));

        deck7.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));
        deck7.add(new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000));
        deck7.add(new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000));
        deck7.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));

        deck8.add(new Cylinder("Цилиндр большой", 90, 10, DENSITY_2000));
        deck8.add(new Square("Большой квадрат", 35, 70, DENSITY_2000));

        deck9.add(new SmallSquare("Малый квадрат", 47, 64, DENSITY_1000));
        deck9.add(new ConeSmall("Маленький конус", 50, 60, DENSITY_1000));
        deck9.add(new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000));
        deck9.add(new SmallCylinder("Малый цилинд", 74, 15, DENSITY_1000));

        deck10.add(new Cylinder("Цилиндр большой", 90, 10, DENSITY_2000));
        deck10.add(new Square("Большой квадрат", 25, 70, DENSITY_2000));


        Ship ship = new Ship(2);
        Ship shipSecond = new Ship(1);
        Ship shipThird = new Ship(2);
        Ship shipFourth = new Ship(2);
        Ship shipFifth = new Ship(1);
        Ship shipSixth = new Ship(2);
        Ship shipSeventh = new Ship(1);
        Ship shipEighth = new Ship(2);
        Ship shipNinth = new Ship(2);
        Ship shipTenth = new Ship(1);


        ship.add(deck1);
        ship.add(deck3);

        shipSecond.add(deck8);

        shipThird.add(deck5);
        shipThird.add(deck2);

        shipFourth.add(deck10);
        shipFourth.add(deck6);

        shipFifth.add(deck9);

        shipSixth.add(deck2);
        shipSixth.add(deck6);

        shipSeventh.add(deck4);

        shipEighth.add(deck8);
        shipEighth.add(deck9);

        shipNinth.add(deck1);
        shipNinth.add(deck9);

        shipTenth.add(deck5);


        SeaPort port = new SeaPort(10);
        port.add(ship);
        port.add(shipSecond);
        port.add(shipThird);
        port.add(shipFourth);
        port.add(shipFifth);
        port.add(shipSixth);
        port.add(shipSeventh);
        port.add(shipEighth);
        port.add(shipNinth);
        port.add(shipTenth);


        System.out.println(port);


    }
}
