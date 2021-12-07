package MyCod.StudySkillbox;

import java.util.Scanner;

public class Modul_3_3 {
    public static void main(String[] args) {
       int sum = 0;
       int value = -1;
       while (value != 0) {
           System.out.println("Введите любое целое положительное число не равное 0");
           value = new Scanner(System.in).nextInt();
           sum = sum + value;
       }
        System.out.println("Сумма введенных чисел равна " + sum);
    }
}
