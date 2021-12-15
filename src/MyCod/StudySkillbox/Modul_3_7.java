package MyCod.StudySkillbox;


import java.util.Scanner;

public class Modul_3_7 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите сообщение:");
            String input = new Scanner(System.in).nextLine();
            /*if (input.equals("Привет!")) {
                System.out.println("Привет!");
            } else if (input.equals("Как дела?")) {
                System.out.println("Отлично! У тебя как?");
            } else {
                System.out.println("Не понимаю сообщения.");
            }*/
            switch (input) {
                case "Привет!" -> System.out.println("Привет!");
                case "Как дела?" -> {
                    System.out.println("Отлично!");
                    System.out.println(" У тебя как?");
                }
                default -> System.out.println("Не понимаю сообщения.");
            }
        }
    }
}
