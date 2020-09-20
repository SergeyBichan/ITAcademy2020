package by.academy.runner;


import by.academy.cats.Cat;

public class CatRunner {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.CreatingCatsByWhile();
        System.out.println();
        cat.CreatingCatsByFor();

        cat = new Cat(Cat.getRandomName(), Cat.getRandomAge());
        cat.CreatingCatsByDoWhile();

        cat.catArray();

    }
}
