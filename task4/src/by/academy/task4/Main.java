package by.academy.task4;

import by.academy.task4.array.Radnomizer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int strLength = 6;
        int sizeFirst = 10;
        int sizeSecond = 20;
        String[] doublDiag = new String[sizeFirst];
        String[] primDiag = new String[sizeFirst];
        String[][] matrix = new String[sizeFirst][sizeFirst];
        String[] bothDiags = new String[primDiag.length + doublDiag.length];
        ArrayList<Double> arrOfNums = new ArrayList<>();
        ArrayList<String> arrOfChars = new ArrayList<>();
//

        Radnomizer.initArrWithRandomStrings(matrix, strLength);
        Radnomizer.printArr(matrix);
        Radnomizer.getDiags(matrix, primDiag, doublDiag, sizeFirst);


        System.out.println("Главная диагональ: ");
        Radnomizer.printArrSolo(primDiag);
        System.out.println("Побочная диагональ: ");
        Radnomizer.printArrSolo(doublDiag);

        System.out.println(primDiag.equals(doublDiag));
        System.out.println("Слияние: ");
        Radnomizer.creatingArrayDromDiags(primDiag, doublDiag, bothDiags);
        System.out.println();

        Radnomizer.parsingArrayLists(arrOfNums, arrOfChars, bothDiags, sizeSecond);
        System.out.println(arrOfNums);
        System.out.println(arrOfChars);





//        String[] string = new String[sizeFirst];
//
//        for (int i = 0; i < sizeFirst * 2; i++) {
//            if(Radnomizer.isDouble(bothDiags[i])){
//              num[i] = Double.parseDouble(bothDiags[i]);
//
//            }
////            else {
////
////
////            }


//        }
//        System.out.println(Arrays.toString(num));
////        for (int i = 0; i < num.length; i++) {
////            if( num[i] != null){
////                arrOfNums[i] = num[i];
////            }
//        }
//        System.out.println(Arrays.toString(arrOfNums));


    }

}



