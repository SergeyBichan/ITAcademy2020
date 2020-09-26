package by.academy.task4.array;

public class Radnomizer {
    //Заполняет массив
    public static String[][] initArrWithRandomStrings(String[][] matrice, int strLength) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
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
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();

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

    public static int getRandomeNum() {
        int result = 0;
        int i = (int) (Math.random() * 20 + 1);
        result = result + i;
        return result;
    }


//    public static void getPrimaryDiag(String matrice[][], int stringLength){
//        for (int i = 0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[i].length ; j++) {
//                if (i < j) {
//                    aboveMain[i][j] = arr[i][j];
//                }
//                if (i > j) {
//                    underMain[i][j] = arr[i][j];
//                }
//                if (i + j < n + 1) {
//                    aboveSecond[i][j] = arr[i][j];
//                }
//                if (i + j > n + 1) {
//                    underSecond[i][j] = arr[i][j];
//                }
//            }
//        }
//
//    }

}
