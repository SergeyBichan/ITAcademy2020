
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Магазин");
                System.out.println("Первый");
                System.out.println("Второй");
                System.out.println("Третий для выхода");
                int num = sc.nextInt();
                if (1 == num) {
                    workingWithGoods();
                } else if (2 == num) {
                    workingWithOrders();
                } else if (3 == num) {
                    break;
                } else {
                    System.out.println("Введите 1 или 2");
                }

            } catch (Exception e) {
                System.out.println("Введите корректный символ");
            }
        }
    }


    private static void workingWithGoods() {
        System.out.println("Работаем с товарами");

    }

    private static void workingWithOrders() {
        System.out.println("Работаем с заказами");

    }

}
