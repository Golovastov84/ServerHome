package MyCod.StudyBook;

import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        System.out.print("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Вы ввели: " + str);
        char[] result = str.toCharArray();
        System.out.println("В обратном порядке: ");
        for (int i = result.length - 1; i >= 0; i--) {
          System.out.print(result[i]);
        }
        scanner.close();
    }
}
