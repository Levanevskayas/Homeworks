package ru.innopolis.java;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        decision();
    }
    public static void decision() {
        System.out.println("Введите букву с клавиатуры");
        Scanner scanner = new Scanner(System.in);
        try {
            String letter = scanner.nextLine();
            String alphabet = "qwertyuiopasdfghjklzxcvbnm";
            int index = alphabet.indexOf(letter);
            int leftIndex = index - 1;

            if (letter.equals("q")) {
                leftIndex = 25;
            }
            System.out.println("Левая буква: " + alphabet.charAt(leftIndex));
        } catch (IndexOutOfBoundsException exception) {
            System.out.printf("Ошибка: Необходимо ввести букву английского алфавита! %s\n", exception);
        }
    }
}
