package ru.innopolis.java;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        decision2();
    }
    public static void decision2() {
        String symbols = "><-";
        String random = new Random().ints(106, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(random);
        String arrow1 = ">>-->";
        String arrow2 = "<--<<";

        Scanner scanner1 = new Scanner(random);
        scanner1.useDelimiter(arrow1);
        int res1 = 0;
        while (scanner1.hasNext()) {
            res1++;
            scanner1.next();
        }
        System.out.println(res1);

        Scanner scanner2 = new Scanner(random);
        scanner2.useDelimiter(arrow2);
        int res2 = 0;
        while (scanner2.hasNext()) {
            res2++;
            scanner2.next();
        }
        System.out.println(res2);

        System.out.println("Количество стрел: " + (res1 + res2));
    }
}

