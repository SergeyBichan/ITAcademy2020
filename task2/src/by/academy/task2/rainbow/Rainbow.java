package by.academy.task2.rainbow;

public class Rainbow {
    public static final byte RED = 1;
    public static final byte ORANGE = 2;
    public static final byte YELLOW = 3;
    public static final byte GREEN = 4;
    public static final byte LIGHT_BLUE = 5;
    public static final byte BLUE = 6;
    public static final byte VIOLET = 7;


    public void choosingColour(byte colour) {
        if (colour >= 1 || colour <= 7) {
            switch (colour) {
                case RED:
                    System.out.print("RED");
                    break;
                case ORANGE:
                    System.out.print("ORANGE");
                    break;
                case YELLOW:
                    System.out.print("YELLOW");
                    break;
                case GREEN:
                    System.out.print("GREEN");
                    break;
                case LIGHT_BLUE:
                    System.out.print("LIGHT BLUE");
                    break;
                case BLUE:
                    System.out.print("BLUE");
                    break;
                case VIOLET:
                    System.out.print("VIOLET");
                    break;
                default:
                    System.out.print("Incorrect input");
                    break;

            }
        }

    }

    public Rainbow() {

    }


    public void chooseColour(byte colour) {
        System.out.print("You choosed ");
        choosingColour(colour);
        System.out.println(" color");


    }


    public void chooseColour(byte colourFirst, byte colourSecond) {
        System.out.println();
        System.out.print("You choosed ");
        choosingColour(colourFirst);
        System.out.print(" - ");
        choosingColour(colourSecond);
        System.out.println(" colour");


    }


}
