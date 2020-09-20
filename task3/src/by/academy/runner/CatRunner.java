package by.academy.runner;


import by.academy.cats.Cat;

import java.util.Arrays;

public class CatRunner {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.CreatingCatsByWhile();
        System.out.println();
        cat.CreatingCatsByFor();
        System.out.println();
        cat = new Cat(Cat.getRandomName(), Cat.getRandomAge());
        cat.CreatingCatsByDoWhile();
        System.out.println();
        cat.catArray();
    }
}
