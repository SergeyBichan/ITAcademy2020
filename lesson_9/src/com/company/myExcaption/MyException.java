package com.company.myExcaption;

public class MyException extends Exception{

    private static void getR(){
        int catNumber;
        int zero;

        catNumber = 1;
        zero = 0;
        int result = catNumber / zero;
        System.out.println("Не увидите это сообщение");
        System.out.println("Нельзя котов делить на ноль!");
        System.out.println("Жизнь продолжается");

    }
}
