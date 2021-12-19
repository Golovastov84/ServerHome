package MyCod.Kickstart;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isTrue = true;

        while (isTrue) {
            // Пока наше число не станет больше или меньше 0
            // раз за разом нам будет предложено ввести его заново.
            System.out.println("Введите цифру: ");
            while (!scanner.hasNextInt()) {
                System.out.println("WRONG_ANSWER");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n > 0 && n < 11) {
                isTrue = false;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print((i + 1) * (j + 1) + "  ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
