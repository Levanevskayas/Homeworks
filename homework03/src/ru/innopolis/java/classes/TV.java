package ru.innopolis.java.classes;

public class TV {
    private String brand;
    private int diagonal;
    private String color;

    public TV() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TV(String brand, int diagonal, String color) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.color = color;
    }
    public String toString() {
        return "TV с параметрами\r\n" +
                this.brand   + " - Имя\r\n" +
                this.diagonal  + " - Диагональ\r\n" +
                this.color + " - Цвет\r\n" ;




    };

}
