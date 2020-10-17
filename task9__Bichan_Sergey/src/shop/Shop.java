package shop;


import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Shop {
   //ArrayList good = new ArrayList();

    public Shop() {
    }

    public void workShop() throws RuntimeException {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Магазин");
                System.out.println("1.Товары");
                System.out.println("2.Заказы");
                System.out.println("3.Выход");
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
        System.out.println("2.Удалить товар");
        System.out.println("3.Просмотреть список товаров");
        System.out.println("4.Назад");
        switch (in.nextInt()) {
            case 1:
                System.out.println("Наименование товара\n");
                try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     BufferedWriter bw =
                             new BufferedWriter(new FileWriter("e:\\ITAcademy2020\\" +
                                             "task9__Bichan_Sergey\\goodForShop.txt"))) {
                     //чтение построчно
                    String text;
                    while (!(text = br.readLine()).equals("ESC")) {

                        bw.write(text + "\n");
                        bw.flush();
                        workingWithGoods();

                    }
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }

            case 2:

            case 3:
                try (FileInputStream fin =
                             new FileInputStream("e:\\ITAcademy2020\\task9__Bichan_Sergey\\goodForShop.txt")) {
                    System.out.printf("File size: %d bytes \n", fin.available());
                    int i = -1;
                    while ((i = fin.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            case 4:
                break;


        }


    }

    private static void workingWithOrders() {
        System.out.println("Работаем с заказами");

    }

}
