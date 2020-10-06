package by.academy.task5.port;

import by.academy.task5.deck.Deck;
import by.academy.task5.ships.Ship;

import java.util.Arrays;

public class SeaPort {
    private Ship[] ships;
    private int count;

    @Override
    public String toString() {
        return "\nSeaPort " +
                "Карабли =" + Arrays.toString(ships) +
                ", Количество кораблей = " + count +
                "\nколичество воды на кораблях = " + getMass() +
                '}' + "\n";
    }

    public double getMass() {
        int i = 0;
        double mass = 0;
        while (i < count) {
            mass += ships[i].getMass();
            i++;
        }
        return (long)mass;
    }

    public SeaPort(int shipCount) {
        this.ships = new Ship[shipCount];
    }

    public void add(Ship ship) {
        if (count < ships.length) {
            if (ships[count] == null)
                ships[count] = ship;
            count++;
        }
    }

    public void remove(String name) {
        if (count > 0) {
            ships[count] = null;
            count--;
        }
    }


}
