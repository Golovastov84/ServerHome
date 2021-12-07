package MyCod.StudySkillbox;

import java.util.Scanner;

public class Modul_3_PinCod {
    public static void main(String[] args) {
       int secretPinCode = 7567;
       int startCode = -1;
       int pinCode = -1;
       while (pinCode != secretPinCode) {
           if (startCode == -1) {
               System.out.println("Введите PIN-код:");
           } else {
               System.out.println("PIN-код введен не верно. Введите верный PIN-код:");
           }
           startCode = startCode + 1;
           pinCode = new Scanner(System.in).nextInt();
       }
        System.out.println("PIN-код введен верно!");
    }
}
