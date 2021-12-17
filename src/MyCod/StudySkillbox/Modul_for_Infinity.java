package MyCod.StudySkillbox;

import java.util.Random;
import java.util.Scanner;

public class Modul_for_Infinity {
    public static void main(String[] args) {
        int i = 1;
       for (;;) {
           i++;
           System.out.println("Выводим случайное число от 0 до 10");

           int result = new Random().nextInt(10);
           System.out.println("Случайное число от 0 до 10: " + result + " итерация " + i);
        }
    }
}
