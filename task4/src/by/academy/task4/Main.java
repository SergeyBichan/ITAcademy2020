package by.academy.task4;

import by.academy.task4.array.Radnomizer;

public class Main {
    public static void main(String[] args) {
        int strLength = 6;
        int sizeFirst = 10;
        int sizeSecond = 10;
        String[] doublDiag = new String[sizeFirst];
        String[] primDiag = new String[sizeFirst];
        String[][] matrix = new String[sizeFirst][sizeSecond];

        Radnomizer.initArrWithRandomStrings(matrix, strLength);
        Radnomizer.printArr(matrix);
        Radnomizer.getDiags(matrix, primDiag, doublDiag, sizeFirst);


        System.out.println("Главная диагональ: ");
        Radnomizer.printArrSolo(primDiag);
        System.out.println("Побочная диагональ: ");
        Radnomizer.printArrSolo(doublDiag);

        System.out.println(primDiag.equals(doublDiag));





    }


}
