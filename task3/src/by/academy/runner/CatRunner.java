package by.academy.runner;


import by.academy.cats.Cat;

import java.util.Arrays;

public class CatRunner {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.CreatingCatsByWhile();
        System.out.println();
        cat.CreatingCatsByFor();

        cat = new Cat(Cat.getRandomName(), Cat.getRandomAge());
        cat.CreatingCatsByDoWhile();

        cat.catArray();


/*        Cat[] cat = new Cat[10];
        //for(int i = 0; i < 10; i++) {
        //cat[i] = new Cat("DFD",10);
        cat[0] = new Cat("Томас",2);
        cat[1] = new Cat();
        cat[2] = new Cat();
        // System.out.println(cat[0].toString());
        System.out.println(Arrays.toString(cat));*/
    }
}
