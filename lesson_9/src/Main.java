import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        try {
            getR();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ЛАБЛА");
        }


        //Чистый код, Робин Мартин
        // Шилдт
//        Long timeOne = Calendar.getInstance().getTimeInMillis();
//        getR();
//        Long timeTwo = Calendar.getInstance().getTimeInMillis();
//        System.out.println(timeTwo - timeOne);


    }

    private static void getR() throws ArithmeticException {
        int catNumber;
        int zero;

        try {
            catNumber = 1;
            zero = 0;
            int result = catNumber / zero;
            System.out.println("Не увидите это сообщение");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Котов делить на ноль нельзя");
        }
        System.out.println("Нельзя котов делить на ноль!");
        System.out.println("Жизнь продолжается");
    }
}
