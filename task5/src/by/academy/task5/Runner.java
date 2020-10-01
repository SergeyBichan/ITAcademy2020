package by.academy.task5;

import by.academy.task5.container.Cone;
import by.academy.task5.container.Container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;

public class Runner {
    public static void main(String[] args) {
        Container first = new Cone(45,44,"Большой конус",RADIUS_MAX);
        System.out.println(first.VolumeCalculation());
        System.out.println("Масса " + first.MassCalculation(2000));
        System.out.println(first);


    }
}
