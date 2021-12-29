package MyCod.StudyBook;

import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        String source = "Titanic1911";
        while (true) {
            System.out.print("Введите пароль: ");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            if (password.equals(source)) {
                System.out.println("Вход разрешен.");
                scanner.close();
                break;
            } else {
                System.out.println("Пароль не верный." + "\n");
            }
        }
    }
}
