package MyCod.Kickstart.Year1018.A;

import static java.lang.Math.pow;

public class TestToInt {
    public static int countNumberClicks (int a, int b) {
        int w = 0;
        while (a%2 != 0) {
            a = a - b;
            w++;
        }
        return w;
    }

    public static int getCountsOfDigits(int number) {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    public static void main(String[] args) {
        int q = 12345;

        System.out.println(getCountsOfDigits(q));
    }
}
