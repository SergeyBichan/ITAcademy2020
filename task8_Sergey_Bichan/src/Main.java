import myArrayList.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrList = new MyArrayList<>();
        arrList.add(0, 0);
        arrList.add(1, 1);
        arrList.add(2,2);
        arrList.add(3,3);
        arrList.add(4,4);
        arrList.add(5,5);
        //arrList.add(6);



        System.out.println(arrList);

    }
}
