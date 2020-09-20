package by.academy.cats;

import java.util.Arrays;
import java.util.Objects;

public class Cat {
    String name = "John";
    int age = 1;
    int sumCat;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Cat() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return Objects.equals(name, cat.name);
    }



    public static String getRandomName() {
        String result = "";
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int j = 0; j < 5; j++) {
            int i = (int) (Math.random() * str.length());
            char l = str.charAt(i);
            result = result + l;
        }
        return result;
    }

    public static int getRandomAge() {
        int result = 0;
        int i = (int) (Math.random() * 20 + 1);
        result = result + i;
        return result;
    }


    public void CreatingCatsByWhile() {
        while (sumCat < 10) {
            setName(getRandomName());
            setAge(getRandomAge());
            sumCat++;
            System.out.println("name " + getName() + "," + "age " + getAge());
        }

    }

    public void CreatingCatsByFor() {
        for (int i = 0; i < 10; i++) {
            setName(getRandomName());
            setAge(getRandomAge());
            System.out.println("name " + getName() + "," + "age " + getAge());

        }
    }


    public void CreatingCatsByDoWhile() {
        sumCat = 0;
        do {
            setName(getRandomName());
            setAge(getRandomAge());
            System.out.println(getName() + " " + getAge());
            sumCat++;

        }
        while (sumCat < 10);
    }


    public void catArray() {
        Cat[] catsArr = new Cat[10];
        for (int i = 0; i < catsArr.length; i++) {
            catsArr[i] = new Cat(getRandomName(), getRandomAge());
        }
        for (Cat i : catsArr) {
            catsArr[0].equals(i);
           // System.out.println(Arrays.toString(catsArr));

            System.out.println(i);

        }

        System.out.println(catsArr[0].equals(catsArr[1]));
    }}



