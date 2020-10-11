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
        if (index == arrList.length) {
            growArray();
        }

            arrList[index] = obj;
            size++;

    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return arrList[index];

    }


    public void growArray() {
        E[] newArray = (E[]) new Object[arrList.length + 1];
        for (int i = 0; i < arrList.length; i++) {
            newArray[i] = arrList[i];
        }
        arrList = newArray;
    }
}
