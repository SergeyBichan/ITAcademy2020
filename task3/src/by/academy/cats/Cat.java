package by.academy.cats;

public class Cat {
    String name = "John";
    int age = 1;
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

    public int getSumCat() {
        return sumCat;
    }

    public void setSumCat(int sumCat) {
        this.sumCat = sumCat;
    }


    public Cat() {
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

            System.out.println("Name: " + getName() + " " + "Age: " + getAge());
            sumCat++;
        }
    }


    public void CreatingCatsByFor() {
        for (int i = 0; i < 10; i++) {

            System.out.println(getRandomAge() + "," + getRandomName());

        }
    }


}
