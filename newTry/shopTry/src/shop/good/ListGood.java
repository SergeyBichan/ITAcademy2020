package shop.good;

import java.io.*;


public class ListGood {
    public void addProducts() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("goods.txt", true))) {
            // чтение построчно
            String text;
            while (!(text = br.readLine()).equals("ESC")) {

                bw.append(text).append("\n");
                bw.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


    }


    public void viewProducts() {
        try (FileInputStream fin = new FileInputStream("goods.txt")) {
            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }


}
