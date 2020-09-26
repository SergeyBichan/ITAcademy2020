package by.academy.task4.array;

public class Radnomizer {
    //Заполняет массив
    public static String[][] initArrWithRandomStrings(String[][] matrice, int strLength) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (j % 2 == 0) {
                    matrice[i][j] = getRandomeChar(strLength);

                } else {
                    matrice[i][j] = String.valueOf(getRandomeNum(strLength));
                }

            }

        }
        return matrice;


    }

    //Печатает массив
    public static void printArr(String matrice[][]) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();

        }

    }

    //  пытался понять записало оно мне в отдельный массив эту даигональ или нет.. если что так и не понял
    //вроде понял
    //это ужасно.. я пишу и теряю мысль на ходу

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

    public static double getRandomeNum(int strLength) {
        double result = 0;
        double i = (Math.random() * 20 + 1);
        result = result + i;
        return result;
    }

    //не понимаю пока как разнести по разным методам вывод диагоналей. но разберусь думаю
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


}
