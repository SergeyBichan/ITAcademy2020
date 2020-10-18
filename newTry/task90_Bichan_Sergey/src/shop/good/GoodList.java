package shop.good;

import shop.Shop;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodList {


    public static void addGoods() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("goods.txt", true))) {
            // чтение построчно
            String text;
            while (!(text = br.readLine()).equals("ESC")) {

                bw.append(text).append("\n");
                bw.flush();
                Shop.workingWithGoods();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    public static void showGoods() {
        try (FileInputStream fin = new FileInputStream("goods.txt")) {
            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    public static void addToArrayList(){
        Scanner in = new Scanner("goods.txt");
        List<String> unit = new ArrayList<String>();
        while(in.hasNextLine()){
            unit.add(in.nextLine());
        }
        System.out.println(unit);
    }
}
