package MyCod.Kickstart.Year1018.A;

import java.util.*;
import java.io.*;


//import static java.lang.Math.*;

public class Solution {

   /* public static void separatorPrint() {
        System.out.println();
        System.out.println("==================");
        System.out.println();
    }*/

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

    public static int getCountsOfDigits(int number) { // определение разрядности числа
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    public static int countNumberClicks (int a, int b) {
        int i;
        int temporary;
        int result = a;
        int discharge = getCountsOfDigits(a);
        while (true) {
            temporary = result;
            i = 0;
            for (int j = 1; j <= discharge; j++) {
                i = i + temporary%2;
                temporary = temporary / 10;
            }
            if (i == 0) {
                break;
            } else {
                result = result - b;
            }
        }
        return Math.abs(Math.abs(result) - Math.abs(a));
    }
    public static int i;
    public static int t;
    public static int minN = 1;
    public static int maxN = (int) 1.0e5;

    public static void main(String[] args) {

        //while (true) {
            int minT = 1;
            int maxT = 100;

            int n;
            while (true) {
                Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
               // issueRequestT();
                while (!scanner.hasNextInt()) {
                    //wrongAnswer();
                   // issueRequestT();
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
            //System.out.println(t);
            int[] arrayCase = new int[t];
            for (i = 1; i <= t; i++) {
                Scanner scanner = new Scanner(System.in);
                //issueRequestN();
                while (true) {
                    while (!scanner.hasNextInt()) {
                        //wrongAnswer();
                        //issueRequestN();
                        scanner.next();
                    }
                    n = scanner.nextInt();
                    if (minN <= n && n <= maxN) {
                        //System.out.println(n);
                        arrayCase[i - 1] = n;
                        break;
                    } else if (n > maxN) {
                        System.out.println("TOO_BIG");
                        //issueRequestN();
                    } else if (n < minN) {
                        System.out.println("TOO_SMALL");
                        //issueRequestN();
                    }
                }
            }
            int clickCount;

            for (i = 0; i < arrayCase.length; i++) {
                if (countNumberClicks(arrayCase[i], 1) > countNumberClicks(arrayCase[i], -1)) {
                    clickCount = countNumberClicks(arrayCase[i], -1);
                } else {
                    clickCount = countNumberClicks(arrayCase[i], 1);
                }
                System.out.println("Case #" + (i + 1) + ": " + clickCount);
            }
           // separatorPrint();

        //}
    }
}



