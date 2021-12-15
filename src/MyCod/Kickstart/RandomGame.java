package MyCod.Kickstart;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Задайте нижнюю границу: ");
            int a = new Scanner(System.in).nextInt();
        System.out.println("Задайте верхнюю границу: ");
            int b = new Scanner(System.in).nextInt();
        System.out.println("Задайте количество попыток");
            int n = new Scanner(System.in).nextInt();

        int value = new Random().nextInt((b - a) + 1) + a;
        System.out.println("Угадайте целое число от " + a + " до " + b);
            //System.out.println(value);
            int i;
            for (i = 1; i <= n; i++) {
                int attempt = new Scanner(System.in).nextInt();
                //WRONG_ANSWER
                if (attempt == value) {
                    System.out.println("CORRECT");
                    break;
                } else if (attempt > value) {
                    System.out.println("TOO_BIG");
                } else {
                    System.out.println("TOO_SMALL");
                }
            }
            if (i > n) {
                System.out.println("Количество попыток превысило лимит " + n);
            }
        }
    }
}
