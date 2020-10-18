package shop;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {


    public void startWorkShop() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Магазин");
                System.out.println("1.Товары");
                System.out.println("2.Заказы");
                System.out.println("3.Третий для выхода");
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
    }


    private static void workingWithGoods() {
        Scanner in = new Scanner(System.in);
        System.out.println("Работаем с товарами");
        System.out.println("1.Добавить товар");
        System.out.println("2.Убрать товар");
        System.out.println("3.Посмотреть товар");
        System.out.println("4.Вернуться обратно");
        switch (in.nextInt()) {
            case 1:
                //String text; // строка для записи
                try (FileOutputStream fos = new FileOutputStream("goods.txt")) {
                    // перевод строки в байты
                    byte[] buffer = in.nextLine().getBytes();

                    fos.write(buffer);
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
                System.out.println("The file has been written");
//                workingWithGoods();

            case 2:
                workingWithGoods();

            case 3:
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream("goods.txt"), Charset.forName("UTF-8")));

                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        System.out.println();
                    }
                } catch (IOException e) {
                    System.out.println("Something wrong");
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            System.out.println("Не правильно");
                        }
                    }
                }
                workingWithGoods();

            case 4:
                break;

            default:
                System.out.println("Введите корректно");
                workingWithGoods();

        }


    }

    private static void workingWithOrders() {
        System.out.println("Работаем с заказами");

    }
}



