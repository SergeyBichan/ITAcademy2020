package lamp;

import lamp.Lamp;

public class Main {
    public static void main(String[] args) {
        Lamp first = new Lamp();
        first.on();
        System.out.println(first.getState());

        Lamp second = first;       //вторая ссылка на first
        second.off();
        System.out.println(second.getState());
        System.out.println(first.getState());
    }
}
