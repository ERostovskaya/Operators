package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        System.out.println ("Введите 3 любых целых числаx через enter: ");
        int number1 = x.nextInt();
        int number2 = y.nextInt();
        int number3 = z.nextInt();
        int d = (number1 + number2 + number3) / 3;
        double f = (Math.floor(d / 2));
        System.out.println("Среднее арифметическое значение = " + d);

        if (f > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
