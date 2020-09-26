package by.academy.task4.array;

public class Radnomizer {
    //Заполняет массив
    public static String[][] initArrWithRandomStrings(String[][] matrice, int strLength) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (j % 2 == 0) {
                    matrice[i][j] = getRandomeChar(strLength);

                } else {
                    matrice[i][j] = String.valueOf(getRandomeNum());
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
    public static void printArrSolo(String primDiag[]) {
        for (int i = 0; i < primDiag.length; i++) {

                System.out.print(primDiag[i] + " ");
        }

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

    public static double getRandomeNum() {
        int result = 0;
        int i = (int) (Math.random() * 20 + 1);
        result = result + i;
        return result;
    }


    public static void getPrimaryDiag(String matrice[][], String primDig[]) {
        System.out.println("Главная диагональ ");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    primDig[i] = matrice[i][j];
                    System.out.print(matrice[i][j] + " ");
                }

            }
        }

    }




}
