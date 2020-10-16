package shop;

import java.util.Scanner;

public class Shop {
    public void workShop(){
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("0.Магазин");
                System.out.println("1.Первый");
                System.out.println("2.Второй");
                System.out.println("3.Выход");
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
