package myArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

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
            growArray();
            for (int i = size + 1; i > index; i--) {
                arrList[i] = arrList[i-1];
            }
        arrList[index] = obj;
        size++;
    }


    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return arrList[index];

    }


    @Override
    public int indexOf(Object obj) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.arrList[i].equals(obj)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.arrList[i].equals(obj)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean addAll(int index, MyArrayList<E> list) {
        if (list.size>0) {
            for (int i = 0; i < list.index; i++) {
                add(index++,list.arrList[i]);
            }
        }
        return true;
    }

    @Override
    public E set(int index, E obj) {
        if (index > size || index < 0){
            throw new RuntimeException("Index: " + index + ", Size " + size);
        }
        if (index < size){
            E Object = arrList[index];
            arrList[index] = obj;
        }

        return obj;
    }

    @Override
    public E remove(int index) {
        if (index >= size) {
            throw new RuntimeException("Index: " + index + ", Size " + size);
        }
        E obj = arrList[index];
        int value = size - index - 1;
        if (value > 0){
            System.arraycopy(arrList, index+1, arrList, index, value);
        }
        arrList[--size] = null;
        return obj;
    }

    @Override
    public E subList(int start, int end) {
        E[] temp = arrList;
        int lenght = end - start;
        arrList = (E[]) new Object[lenght];
        System.arraycopy(temp,start,arrList,0,lenght);

        return null;
    }

    @Override
    public int size() {
        return arrList.length;
    }


    public void growArray() {
        E[] newArray = (E[]) new Object[arrList.length + 1];
        for (int i = 0; i < arrList.length; i++) {
            newArray[i] = arrList[i];
        }
        arrList = newArray;
    }

    public int getSize() {
        int calc = 0;
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] != null) {
                calc = i + 1;
            }
        }
        return calc;
    }
}
