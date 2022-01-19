package MyCod.Kickstart.Year1018.A;

import static java.lang.Math.*;

public class TestToInt {
    public static int countNumberClicks(int a, int b) {
        int w = 0;
        while (a % 2 != 0) {
            a = a - b;
            w++;
        }
        return w;
    }

    public static int getCountsOfDigits(int number) { // определение разрядности числа
        return (number == 0) ? 1 : (int) ceil(log10(abs(number) + 0.5));
    }

    public static void main(String[] args) {
        int q = 43441; // исходное число
        int i;
        int step = 1;
        int temporary;
        int result = q;
        int discharge = getCountsOfDigits(q);
        while (true) {
            temporary = result;
            i = 0;
            for (int j = 1; j <= discharge; j++) {
                i = i + temporary%2;
                temporary = temporary / 10;
            }
            if (i == 0) {
                break;
            } else {
                result = result - step;
            }
        }
        System.out.println(i);
        System.out.println(result);
        System.out.println(temporary);
        System.out.println(getCountsOfDigits(q));
        System.out.println(abs(abs(result) - abs(q)));
    }

}
