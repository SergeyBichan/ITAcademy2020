import myArrayList.MyArrayList;

import java.lang.reflect.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrList = new MyArrayList<>();
        arrList.add(0,1);
        arrList.add(1,2);
        arrList.add(2,5);
        arrList.add(3,1);
        arrList.add(4,2);
        arrList.add(5,3);


//        arrList.add(3,1);
//        arrList.add(9,656);
        //arrList.add(-1,-1);


//        arrList.get(2);
//
        System.out.println(arrList);
//
        arrList.add(3,14);
        System.out.println(arrList);
//
//        System.out.println(arrList.indexOf(5));
//        System.out.println(arrList.lastIndexOf(5));
//        System.out.println(arrList);











    }
}
