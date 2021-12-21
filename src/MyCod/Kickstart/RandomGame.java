package MyCod.Kickstart;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void separatorPrint() {
        System.out.println();
        System.out.println("==================");
        System.out.println();
    }

    public static int testScan() {
        Scanner scannerTest = new Scanner(System.in);
        while (!scannerTest.hasNextInt()) {
            System.out.println("WRONG_ANSWER");
            scannerTest.next();
        }
        return scannerTest.nextInt();
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Задайте нижнюю границу: ");
            int a = testScan();

            System.out.println("Задайте верхнюю границу: ");
            int b = testScan();

            System.out.println("Задайте количество попыток");
            int n = testScan();

            System.out.println("Угадайте целое число от " + a + " до " + b);
            int value = new Random().nextInt((b - a) + 1) + a;
            int i;
            for (i = 1; i <= n; i++) {
                Scanner scanner = new Scanner(System.in);
                int attempt;
                do {
                    while (!scanner.hasNextInt()) {
                        System.out.println("WRONG_ANSWER");
                        scanner.next();
                    }
                    attempt = scanner.nextInt();
                    if (attempt > b || attempt < a) {
                        System.out.println("WRONG_ANSWER");
                    }
                } while (attempt > b || attempt < a);
                if (attempt == value) {
                    System.out.println("CORRECT");
                    separatorPrint();
                    break;
                } else if (attempt > value) {
                    System.out.println("TOO_BIG");
                } else {
                    System.out.println("TOO_SMALL");
                }
            }
            if (i > n) {
                System.out.println("Количество попыток превысило лимит " + n);
                separatorPrint();
            }
        }
    }
}
