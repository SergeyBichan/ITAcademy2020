package shop;

import shop.good.Good;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public Shop() {
    }

    public void workShop() {
        ArrayList good = new ArrayList();
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Магазин");
                System.out.println("1.Товары");
                System.out.println("2.Заказы");
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
        Scanner in = new Scanner(System.in);
        System.out.println("Работаем с товарами");
        System.out.println("1.Создать товар");
        System.out.println("2.Удлить товар");
        System.out.println("3.Назад");
        switch (in.nextInt()) {
            case 1:


            case 2:


        }

    }

    private static void workingWithOrders() {
        System.out.println("Работаем с заказами");

    }

    private void createGood() {

    }
}
