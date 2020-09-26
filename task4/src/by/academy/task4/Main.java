package by.academy.task4;

import by.academy.task4.array.Radnomizer;

public class Main {
    public static void main(String[] args) {
        int strLength = 6;
        int sizeFirst = 10;
        int sizeSecond = 10;
        String[] primDiag = new String[sizeFirst];
        String[][] matrix = new String[sizeFirst][sizeSecond];

        Radnomizer.initArrWithRandomStrings(matrix, strLength);
        Radnomizer.printArr(matrix);
        Radnomizer.getPrimaryDiag(matrix, primDiag);

        System.out.println();
        Radnomizer.printArrSolo(primDiag);











    }


}
