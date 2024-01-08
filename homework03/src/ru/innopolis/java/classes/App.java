package ru.innopolis.java.classes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        TV SONY = new TV("Sony", 20, "black");
        TV LG = new TV("LG", 25, "white");
        TV DEXP = new TV();
        DEXP.setBrand("Dexp");
        DEXP.setDiagonal(25);
        DEXP.setColor("grey");

        System.out.println(SONY);
        System.out.println();
        System.out.println(LG);
        System.out.println();
        System.out.println(DEXP);
    }



    }
