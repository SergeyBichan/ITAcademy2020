package myArrayList;

public interface interfaceForMyArrayList<E> {
    void add(int index,E obj);
    E get(int index);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    boolean addAll(int index, MyArrayList<E> list);
    E set(int index, E obj);

   // ListIterator<E> listIterator ();
}
