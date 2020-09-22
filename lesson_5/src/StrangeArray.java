import java.util.Arrays;

public class StrangeArray {
    public static void main(String[] args) {
        int m[][] = new int[5][];

        for (int i = 0; i < m.length; i++) {
            m[i]=new int[i+1];

        }

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                m[i][j] = (int)(Math.random() * 100 + 1);
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        //Класс Arrays имеет методы для работы с массивом

    }
}
