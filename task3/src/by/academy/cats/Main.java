package by.academy.cats;



public class Main {
    private static final String SPACE = " ";

    public static void main(String[] args) {
        Tail tail = new Tail();
        tail.setColour("green");

        int age = 5;

        System.out.println(tail);
        System.out.println(age);
        Cat cat = new Cat("Bill", age, tail);
        System.out.println(tail);
        System.out.println(cat.getAge());
    }
}
