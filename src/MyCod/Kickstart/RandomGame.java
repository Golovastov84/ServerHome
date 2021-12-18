package MyCod.Kickstart;

import java.util.Random;
import java.util.Scanner;

/*class Typetester {
int printType(byte attempt) {
    return 1;
}
int printType(int attempt) {
    return 2;
}
int printType(float attempt) {
    return 3;
}
int printType(double attempt) {
    return 4;
}
int printType(char attempt) {
    return 5;
}
int printType(String attempt) {
    return 6;
}

}*/

public class RandomGame {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Задайте нижнюю границу: ");
            int a = new Scanner(System.in).nextInt();
        System.out.println("Задайте верхнюю границу: ");
            int b = new Scanner(System.in).nextInt();
        System.out.println("Задайте количество попыток");
            int n = new Scanner(System.in).nextInt();
                    System.out.println("Угадайте целое число от " + a + " до " + b);
        int value = new Random().nextInt((b - a) + 1) + a;
            //System.out.println(value);
            int i;
            for (i = 1; i <= n; i++) {
                Scanner scanner = new Scanner(System.in);
                int attempt;
                //int attempt = new Scanner(System.in).nextInt();
                //WRONG_ANSWER
                do {
                    System.out.println("WRONG_ANSWER_1");
                    while (!scanner.hasNextInt()) {
                        System.out.println("WRONG_ANSWER");
                        scanner.next();
                    }
                    attempt = scanner.nextInt();
                } while (attempt > b || attempt < a);
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
