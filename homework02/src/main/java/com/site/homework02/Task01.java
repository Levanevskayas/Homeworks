import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        double c;

        System.out.println("Введите градусы по Фаренгейту:");
        Scanner scanner = new Scanner (System.in);
        double f = scanner.nextDouble();

        System.out.println("Градусы Цельсия:" + f / 2.12);
    }
}