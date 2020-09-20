package by.academy.cats;

public class Cat {
    String name = "John";
    int age;
    int sumCat;


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

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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
        int i = (int) (Math.random() * 20);
        result = result + i;
        return result;
    }


    public void CreatingCatsByWhile() {
        while (sumCat < 10) {
            Cat cat = new Cat();
            setName(getRandomName());
            setAge(getRandomAge());
            sumCat++;
            System.out.println(cat.toString());
        }

    }

    public String CreatingCatsByFor() {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            setName(getRandomName());
            setAge(getRandomAge());
            System.out.println(cat.toString());

        }
        return toString();
    }

    @Override
    public String toString() {
        return "Name " + getName() + ", " + "age " + getAge();
    }

    public void CreatingCatsByDoWhile() {
        sumCat = 0;
        do {
            Cat cat = new Cat(getRandomName(), getRandomAge());
//            setName(getRandomName());
//            setAge(getRandomAge());
            System.out.println(getName() + " " + getAge());
            sumCat++;

        }
        while (sumCat < 10);
    }


}
