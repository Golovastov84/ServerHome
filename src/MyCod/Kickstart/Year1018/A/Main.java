package MyCod.Kickstart.Year1018.A;

import java.util.Scanner;

public class Main {

    public static void separatorPrint() {
        System.out.println();
        System.out.println("==================");
        System.out.println();
    }

    public static void wrongAnswer() {
        System.out.println("WRONG_ANSWER");
    }

    public static void issueRequestT() {
        System.out.println("Задайте количество тестовых случаев: ");
    }

    public static void issueRequestN() {
        System.out.println("Задайте целое число от " +
                minN + " до " + maxN + " операция " + i + " из " + t + " : ");
    }
    public static int countNumberClicks (int a, int b) {
        int w = 0;
        while (a%2 != 0) {
            a = a - b;
            w++;
        }
        return w;
    }
    public static int i;
    public static int t;
    public static int minN = 1;
    public static int maxN = (int) 1.0e5;

    public static void main(String[] args) {

        while (true) {
            int minT = 1;
            int maxT = 100;

            int n;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                issueRequestT();
                while (!scanner.hasNextInt()) {
                    wrongAnswer();
                    issueRequestT();
                    scanner.next();
                }
                t = scanner.nextInt();
                if (minT <= t && t <= maxT) {
                    break;
                } else if (t > maxT) {
                    System.out.println("TOO_BIG");
                } else if (t < minT) {
                    System.out.println("TOO_SMALL");
                }
            }
            System.out.println(t);
            int[] arrayCase = new int[t];
            for (i = 1; i <= t; i++) {
                Scanner scanner = new Scanner(System.in);
                issueRequestN();
                while (true) {
                    while (!scanner.hasNextInt()) {
                        wrongAnswer();
                        issueRequestN();
                        scanner.next();
                    }
                    n = scanner.nextInt();
                    if (minN <= n && n <= maxN) {
                        System.out.println(n);
                        arrayCase[i - 1] = n;
                        break;
                    } else if (n > maxN) {
                        System.out.println("TOO_BIG");
                        issueRequestN();
                    } else if (n < minN) {
                        System.out.println("TOO_SMALL");
                        issueRequestN();
                    }
                }
            }
            int clickCount;

            for (i = 0; i < arrayCase.length; i++) {
                System.out.println("Case #" + (i + 1) + ": " + arrayCase[i] +
                        " " + arrayCase[i] % 2);
            }

            for (i = 0; i < arrayCase.length; i++) {
                if (countNumberClicks(arrayCase[i], 1) > countNumberClicks(arrayCase[i], -1)) {
                    clickCount = countNumberClicks(arrayCase[i], -1);
                } else {
                    clickCount = countNumberClicks(arrayCase[i], 1);
                }
                System.out.println("Case #" + (i + 1) + ": " + clickCount);
            }
            separatorPrint();

        }
    }
}



