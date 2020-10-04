package by.academy.task5;

import by.academy.task5.container.*;

import static by.academy.task5.constant.Constant.*;

public class Runner {
    public static void main(String[] args) {
        Container first = new Cone(10, "Конус большой", 50, DENSITY_2000);
        Container second = new ConeSmall(70, "Маленький конус", 60, DENSITY_1000);
        Container third = new Cylinder(25, "Цилиндр большой", 10, DENSITY_2000);
        Container fourth = new SmallCylinder(25, "Малый цилинд", 15, DENSITY_1000);
        Container fifth = new Square(20, "Большой квадрат", 70, DENSITY_2000);
        Container sixth = new SmallSquare(20,"Малый квадрат", 64, DENSITY_1000);
        System.out.println("Масса " + first.MassCalculation());
        System.out.println("Масса " + second.MassCalculation());
        System.out.println("Масса " + third.MassCalculation());
        System.out.println("Масса " + fourth.MassCalculation());
        System.out.println("Масса квадрата " + fifth.MassCalculation());
        System.out.println("Малый квадрат " + sixth.MassCalculation());










    }
}
