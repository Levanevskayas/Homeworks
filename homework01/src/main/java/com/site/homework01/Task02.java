package com.site.lesson1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task02 {
    public static void main(String[] args) {
        double a1 = Math.random() * 3; //результат Пети
        double b1 = Math.random() * 3; //результат Васи
        int a = (int) a1;
        int b = (int) b1;
        System.out.println(a);
        System.out.println(b);
        String ans;
        if(a==b)
            ans = "Ничья";
        else{
            if(((a >= 0 && a < 1) && (b >= 1 && b < 2)) || ((a >= 1 && a < 2) && (b >= 2 && b < 3)) || ((a >= 2 && a < 3) && (b >= 0 && b < 1))){
                ans= "Петя победил";
            }
            else
                ans= "Вася победил";
        }
        System.out.println (ans);
        }
    }