package com.site.homework02;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Введите значение числа a");
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        System.out.println("Введите значение числа b");
        Scanner scanner1 = new Scanner (System.in);
        int b = scanner.nextInt();
        System.out.println("Сумма чисел a и b:" + (a + b));
        System.out.println("Разность чисел a и b:" + (a - b));
        System.out.println("Произведение чисел a и b:" + (a * b));
        System.out.println("Среднее значение чисел a и b:" + (a + b) / 2 );
        System.out.println("Расстояние чисел a и b:" + (a - b));
        System.out.println("Максимальное из чисел a и b:" + Math.max(a,b));
        System.out.println("Минимальное из чисел a и b:" + Math.min(a,b));
    }
}
