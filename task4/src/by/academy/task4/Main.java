package by.academy.task4;

import by.academy.task4.array.Radnomizer;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int strLength = 6;
        int sizeFirst = 10;
        int sizeSecond = 10;
        String[] doublDiag = new String[sizeFirst];
        String[] primDiag = new String[sizeFirst];
        String[][] matrix = new String[sizeFirst][sizeSecond];
        String[] bothDiags = new String[primDiag.length + doublDiag.length];
        Double[] arrOfNums = new Double[sizeFirst];
        String[] arrOfChars = new String[sizeFirst];

        Radnomizer.initArrWithRandomStrings(matrix, strLength);
        Radnomizer.printArr(matrix);
        Radnomizer.getDiags(matrix, primDiag, doublDiag, sizeFirst);


        System.out.println("Главная диагональ: ");
        Radnomizer.printArrSolo(primDiag);
        System.out.println("Побочная диагональ: ");
        Radnomizer.printArrSolo(doublDiag);

        System.out.println(primDiag.equals(doublDiag));
        System.out.println("Слияние: ");
        Radnomizer.CreatingArrayDromDiags(primDiag, doublDiag, bothDiags);
        System.out.println();

       Double[] test = new Double[sizeFirst];
        for (int i = 0; i < bothDiags.length; i++) {
            try{
                Double.parseDouble(bothDiags[i]);
              //  test[i] = bothDiags[i];


            }
            catch (NumberFormatException e){

                System.out.println("Ошибка");
            }

        }
        System.out.println(Arrays.toString(test));




    }

}



