import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
//       int m[] = new int[6];
//        for (int i = 0; i < m.length; i++) {
//            m[i] = (int)(Math.random() * 100 + 1);
//
//        }
//
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//        }
//
//        Arrays.sort(m);
//
//
//        System.out.println();
//
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//        }
//
//
//            String[] str = new String[];
//
//
//
//


        String[] ss = {"asw", "igf"};
        String[] s = {"igf", "asw"};             //Сортировка строки
        Arrays.sort(s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }

        System.out.println(Arrays.equals(ss,s));
    }


}
