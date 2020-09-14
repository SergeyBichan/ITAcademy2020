package by.academy.task1;

public class Box {
    static String name;
    static double width;
    static float length;
    static int height;

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Box.width = width;
    }

    public static float getLength() {
        return length;
    }

    public static void setLength(float length) {
        Box.length = length;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Box.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Box(String name, double width, float length, int height) {
        Box.name = name;
        Box.width = width;
        Box.length = length;
        Box.height = height;

    }


    public void Volume() {
        System.out.println("Volume of " + getName() + " is: ");
        System.out.println(getWidth() * getHeight() * getLength());
        System.out.println();
    }

    public static void main(String[] args) {

        Box boxFirst = new Box("First box", 2.6, 14.2f, 12);
        boxFirst.Volume();

        Box boxSecond = new Box("Second box", 12.4, 5.9f,11);
        boxSecond.Volume();

        Box boxThird = new Box("Third box", 10.6, 9.8f, 5);
        boxThird.Volume();
    }
}
