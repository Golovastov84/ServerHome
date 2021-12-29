package MyCod.StudyBook;

import java.util.Random;
import java.util.Scanner;

public class OutputRandomNumbers {
    public static void main(String[] args) {
        System.out.print("Введите количество случайных чисел: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
          System.out.println(Math.random());
        }
        scanner.close();
    }
}
