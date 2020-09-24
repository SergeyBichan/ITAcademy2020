package by.academy.cats;



public class Main {
    private static final String SPACE = " ";

    public static void main(String[] args) {
        Tail tail = new Tail();
        tail.setColour("red");
        Cat cat = new Cat("Bill", 5, tail);
        System.out.println(cat);
    }
}
