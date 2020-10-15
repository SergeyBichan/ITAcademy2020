import myArrayList.MyArrayList;


public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrList = new MyArrayList<>();
        arrList.add(0,1);
        arrList.add(1,2);
        arrList.add(2,5);
        arrList.add(3,1);
        arrList.add(4,2);
        arrList.add(5,3);
        arrList.add(6,7);
        arrList.add(7,6);
        arrList.add(8,5);
        arrList.add(9,5);
        arrList.add(10,5);

        System.out.println(arrList);

        arrList.add(3,14);
        System.out.println(arrList);

        arrList.remove(5);
        System.out.println(arrList);











    }
}
