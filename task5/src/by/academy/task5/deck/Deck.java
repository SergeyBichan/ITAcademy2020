package by.academy.task5.deck;


import by.academy.task5.container.Container;

import java.util.Arrays;


public class Deck {
    private Container[] containers;
    private int count;

    public Container[] getContainers() {
        return containers;
    }

    public void setContainers(Container[] containers) {
        this.containers = containers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "контейнеры=" + Arrays.toString(containers) +
                ", количество контейнеров=" + count +
                '}';
    }

    public Deck(int containerCount) {
        this.containers = new Container[containerCount];
    }

    public void add(Container container) {
        if (count < containers.length) {
            if (containers[count] == null)
                containers[count] = container;
            count++;
        }
    }


    public void remove(String name) {
        if (count > 0) {
            containers[count] = null;
            count--;
        }
    }
}
