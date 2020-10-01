package by.academy.task4.array;

import java.util.ArrayList;

public class Radnomizer {

    public static void initArrWithRandomStrings(String[][] matrice, int strLength) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (j % 2 == 0) {
                    matrice[i][j] = getRandomeChar(strLength);
                } else {
                    matrice[i][j] = getRandomeNum(strLength);
                }
            }
        }
    }


    public static void printArr(String matrice[][]) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void printArrSolo(String diag[]) {
        for (int i = 0; i < diag.length; i++) {
            System.out.print(diag[i] + " ");
        }
        System.out.println();

    }


    public static String getRandomeChar(int stringLength) {
        String result = "";
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int j = 0; j < stringLength; j++) {
            int i = (int) (Math.random() * str.length());
            char l = str.charAt(i);
            result = result + l;
        }
        return result;
    }

    public static String getRandomeNum(int strLength) {
        String result;
        double i = (Math.random() * 9);
        result = String.format("%.3f", i);
        return result.replace(",", ".");
    }


    public static void getDiags(String[][] matrice, String[] primDig, String[] doublDiag, int sizeFirst) {
        System.out.println();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    primDig[i] = matrice[i][j];
                }
                if (i + j == sizeFirst - 1) {
                    doublDiag[i] = matrice[i][j];
                }
            }
        }
    }

    public static void creatingArrayDromDiags(String[] primDiag, String[] doublDiag, String[] bothDiags) {
        int count = 0;
        for (int i = 0; i < primDiag.length; i++) {
            bothDiags[i] = primDiag[i];
            count++;
        }
        for (int j = 0; j < doublDiag.length; j++) {
            bothDiags[count++] = doublDiag[j];
        }
        for (int i = 0; i < bothDiags.length; i++)
            System.out.print(bothDiags[i] + " ");
    }

    public static Boolean isDouble(String d) {
        try {
            Double.parseDouble(d);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }


    public static void parsingArrayLists(ArrayList<Double> arrOfNums, ArrayList<String> arrOfChars,
                                         String[] bothDiags, int sizeSecond) {
        for (int i = 0; i < sizeSecond; i++) {
            if (Radnomizer.isDouble(bothDiags[i])) {
                double d = Double.parseDouble(bothDiags[i]);
                if (d - Math.floor(d) >= 0.7)
                    d = Math.ceil(d);
                else
                    d = Math.floor(d);
                arrOfNums.add(d);

            } else {
                String s = bothDiags[i];

                arrOfChars.add(s);
            }


        }
    }

    public static void creatingStringBuilderFromChars(ArrayList<String> arrOfChars, StringBuilder strStr) {
        for (int i = 0; i < arrOfChars.size(); i++) {
            strStr.append(arrOfChars.get(i), 1, 4).append(",");

        }

        strStr.deleteCharAt(strStr.length() - 1);
        System.out.println(strStr);
    }

    public static void blowingByStrangeSymbol(ArrayList<Double> arrOfNums) {
        for (int i = 0; i < arrOfNums.size(); i++) {
            System.out.print(arrOfNums.get(i) + "_");

        }


    }


}
