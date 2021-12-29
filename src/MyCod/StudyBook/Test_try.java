package MyCod.StudyBook;

import java.io.IOException;
//import java.util.Scanner;

public class Test_try {
    public static void main(String[] args) {
        int x;
        try {
            System.out.print("Введите значение x:");
            //Scanner scanner = new Scanner(System.in);
            x = System.in.read();
            char c = (char) x;
            //double c = (double) (1 / x);
            //double c = (double) 1/x;
            //System.out.println("1/x = " + c);
            System.out.println("qwer " + c + "=" + x);
        } catch (IOException e) {
            System.err.println("i/o error vvv " + e);
        }
    }
}
