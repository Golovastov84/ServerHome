package MyCod.BitCodOperations;

public class BitCod1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = a ^ b;
        System.out.println(c);
        System.out.println("Представление числа " + a + " в двоичной системе исчесления " + Integer.toBinaryString(a));
        System.out.println("Представление числа " + b + " в двоичной системе исчесления " + Integer.toBinaryString(b));
        System.out.println("Представление числа " + "a ^ b = " + c + " в двоичной системе исчесления " + Integer.toBinaryString(c));
    }
}
