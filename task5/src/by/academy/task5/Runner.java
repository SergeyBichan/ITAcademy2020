package by.academy.task5;

import by.academy.task5.container.*;
import by.academy.task5.ships.Ship;
import by.academy.task5.ships.SingleDeckShip;

import java.util.Arrays;

import static by.academy.task5.constant.Constant.*;

public class Runner {
    public static void main(String[] args) {
        Container first = new Cone(10, "Конус большой", 50, DENSITY_2000);
        Container second = new ConeSmall(70, "Маленький конус", 60, DENSITY_1000);
        Container third = new Cylinder(25, "Цилиндр большой", 10, DENSITY_2000);
        Container fourth = new SmallCylinder(20,"Малый цилиндр", 10,DENSITY_1000);
        Container fifth = new Square(20, "Большой квадрат", 70, DENSITY_2000);
        Container sixth = new SmallSquare(20,"Малый квадрат", 64, DENSITY_1000);
        System.out.println("Масса " + first.MassCalculation());
        System.out.println("Масса " + second.MassCalculation());
        System.out.println("Масса " + third.MassCalculation());
        System.out.println("Масса " + fourth.MassCalculation());
        System.out.println("Масса квадрата " + fifth.MassCalculation());
        System.out.println("Малый квадрат " + sixth.MassCalculation());

        Ship firstShip = new SingleDeckShip(2);
        Ship secondShip = new SingleDeckShip(2);
        Ship thirdShip = new SingleDeckShip(2);
        Ship fourthShip = new SingleDeckShip(2);
        Ship fifthShip = new SingleDeckShip(1);
        Ship sixthShip = new SingleDeckShip(1);
        Ship seventhShip = new SingleDeckShip(2);
        Ship eighthShip = new SingleDeckShip(1);
        Ship ninthShip = new SingleDeckShip(1);
        Ship tenthShip = new SingleDeckShip(1);

        Ship[] arrayShips = new Ship[10];
        arrayShips[0] = firstShip;
        arrayShips[1] = secondShip;
        arrayShips[2] = thirdShip;
        arrayShips[3] = fourthShip;
        arrayShips[4] = fifthShip;
        arrayShips[5] = sixthShip;
        arrayShips[6] = seventhShip;
        arrayShips[7] = eighthShip;
        arrayShips[8] = ninthShip;
        arrayShips[9] = tenthShip;
















    }
}
