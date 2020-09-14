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

    public Box() {

    }

    public Box(String name, double width, float length, int heigth){
        Box.name= name;
        Box.width = width;
        Box.length = length;
        Box.height = height;

    }


    public void Volume() {
        System.out.println("Name is " + getName() + ", width is " + getWidth() + ", length is " + getLength() + ", height is " + getHeight());
        System.out.println("Volume of " + getName() + " is: ");
        System.out.println(getWidth() * getHeight() * getLength());
        System.out.println();
    }

    public static void main(String[] args) {

        Box boxFirst = new Box();
        boxFirst.setName("first box");
        boxFirst.setWidth(5.6);
        boxFirst.setLength(14l);
        boxFirst.setHeight(21);

        boxFirst.Volume();
//
        Box boxSecond = new Box();
        boxSecond.setName("second box");
        boxSecond.setWidth(8.3);
        boxSecond.setLength(8l);
        boxSecond.setHeight(10);
        boxSecond.Volume();
//
        Box boxThird = new Box();
        boxThird.setName("third box");
        boxThird.setWidth(9);
        boxThird.setLength(6l);
        boxThird.setHeight(11);
        boxThird.Volume();

        Box fourthBox = new Box("fourth box", 6.38, 9l, 14);
        fourthBox.Volume();
    }
}
