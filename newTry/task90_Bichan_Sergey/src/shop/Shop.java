package shop;

import shop.good.GoodList;

import java.util.Scanner;

import static shop.good.GoodList.addToArrayList;
import static shop.good.GoodList.readerFile;

public class Shop {

    public static void shopWork() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Магазин");
            System.out.println("Введите 1 для работы с товарами");
            System.out.println("Введите 2 для работы с заказами");
            System.out.println("Введите 3 для выхода");
            System.out.print("-->");

            switch (in.nextInt()) {
                case 1:
                    workingWithGoods();
                case 2:
                    workingWithOrders();
                case 3:
                    System.out.println("Досвидос");
                    System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void workingWithGoods() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Работаем с товарами");
            System.out.println("1->Добавить товар");
            System.out.println("2->Удалить товар");
            System.out.println("3->Посмотреть список товаров");
            System.out.println("4->Назад");
            System.out.print("-->");
            switch (in.nextInt()) {
                case 1:
                    GoodList.addGoods();
                    workingWithGoods();

                case 2:


                case 3:
                    System.out.println("\n Cписок товаров:");
                    GoodList.showGoods();
                    System.out.println("\n");
                    workingWithGoods();



                case 4:
                    //shopWork();
                    //addToArrayList();
                    readerFile();
                    workingWithGoods();


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void workingWithOrders() {
        System.out.println("Пока не реализовано!");
        shopWork();

    }


}


