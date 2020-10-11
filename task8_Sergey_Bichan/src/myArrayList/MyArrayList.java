package myArrayList;


import java.util.Arrays;

public class MyArrayList<E> implements interfaceForMyArrayList<E> {
    private E[] arrList;
    private int index;
    private int size;
    private static final int DEFAULT_CAPACITY = 5;

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arrList=" + Arrays.toString(arrList) +
                ", size=" + size +
                '}';
    }

    public MyArrayList() {
        arrList = (E[]) new Object[DEFAULT_CAPACITY];
    }


    @Override
    public void add(int index, E obj) {
        arrList[index] = obj;
        if (index == arrList.length) {
            growArray();
        }
        index++;
        size++;
    }

    public void growArray() {
        E[] newArray = (E[]) new Object[arrList.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrList[index];
        }
    }
}
