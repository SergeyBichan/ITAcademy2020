package Shop;



import java.util.Scanner;
import Good.ListGoods;

public class Shop {
    public void shopWork() {

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Магазин");
                System.out.println("Введите 1 для работы с товарами");
                System.out.println("Введите 2 для работы с заказами");
                System.out.println("Введите 3 для выхода");
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
        Scanner products = new Scanner(System.in);
        System.out.println("Работаем с товарами");
        System.out.println("1->Добавить товар");
        System.out.println("2->Удалить товар");
        System.out.println("3->Посмотреть список товаров");
        System.out.println("4->Назад");
        System.out.print("-->");
        switch (products.nextInt()) {
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

