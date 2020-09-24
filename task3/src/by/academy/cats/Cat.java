package by.academy.cats;

import java.util.Objects;

public class Cat {
    String name = "John";
    int age = 1;
    private Tail tail;

    public Cat(String name, int age, Tail tail) {
        this.name = name;
        age = 10;
        this.age = age;
        tail.setColour("red");
        this.tail = tail;

    }

    int sumCat;

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;           //сравнение обьектов(сравнивание ссылок)
        if (o == null || getClass() != o.getClass()) return false;   // сравнение класов
        Cat cat = (Cat) o;
        return age == cat.age &&
                sumCat == cat.sumCat &&
                Objects.equals(name, cat.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, sumCat);
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
        while (sumCat < 10)
            System.out.println(new Cat().toString());
        sumCat++;

    }


    public void CreatingCatsByFor() {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName(getRandomName());
            cat.setAge(getRandomAge());
            System.out.println(cat.toString());

        }
    }


    public void CreatingCatsByDoWhile() {
        sumCat = 0;
        do {
            Cat cat = new Cat();
            cat.setName(getRandomName());
            cat.setAge(getRandomAge());
            System.out.println(cat.toString());
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
            System.out.println(i);
        }

        for (int i = 0; i < catsArr.length - 1; i++) {
            System.out.println("object " + catsArr[i] + " and " +
                    "object " + catsArr[i + 1] + " is " + catsArr[i].equals(catsArr[i + 1]));
        }

    }


}
