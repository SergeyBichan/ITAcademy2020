package Shop;


import java.util.Scanner;

import Good.ListGoods;

public class Shop {
    public void shopWork() {
        Scanner sc = new Scanner(System.in);

        try {
            switch (sc.nextInt()) {
                case 1:
                    workingWithGoods();
                case 2:
                    workingWithOrders();
                case 3:
                    break;
                default:
                    System.out.println("Введите 1 или 2");

            }

        } catch (Exception e) {
            System.out.println("Введите корректный символ");

        }
    }




    private void workingWithGoods() {
        Scanner in = new Scanner(System.in);
        System.out.println("Работаем с товарами");
        System.out.println("1->Добавить товар");
        System.out.println("2->Удалить товар");
        System.out.println("3->Посмотреть список товаров");
        System.out.println("4->Назад");
        System.out.print("-->");
        switch (in.nextInt()) {
            case 1:
                ListGoods goodForShop = new ListGoods();
                goodForShop.addProducts();


            case 2:


            case 3:
                ListGoods list = new ListGoods();
                System.out.println("\n Cписок товаров:");
                list.viewProducts();
                System.out.println("\n");



            case 4:


        }

    }

    private static void workingWithOrders() {
        System.out.println("Работаем с заказами");

    }

}

