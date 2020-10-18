package shop;

import shop.good.ListGood;

import java.util.Scanner;

public class Shop {
    public void shopWork() {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Магазин");
            System.out.println("Введите 1 для работы с товарами");
            System.out.println("Введите 2 для работы с заказами");
            System.out.println("Введите 3 для выхода");
            switch (in.nextInt()) {
                case 1:
                    workingWithGoods();

                case 2:
                    workingWithOrders();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private void workingWithOrders() {
    }

    private void workingWithGoods() {
        System.out.println("Работаем с товарами");
        System.out.println("stop для выхода из добавления");
        System.out.println("1->Добавить товар");
        System.out.println("2->Удалить товар");
        System.out.println("3->Посмотреть список товаров");
        System.out.println("4->Назад");
        ListGood list = new ListGood();
        Scanner in = new Scanner(System.in);
        try {
            switch (in.nextInt()) {
                case 1:
                    list.addProducts();
                case 2:
                case 3:
                    list.viewProducts();
                case 4:
                    shopWork();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}


