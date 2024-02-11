package MyCod.StudySkillbox.Modul_23_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[101];
        for (int i = 0; i < 100; i++) {

            values[i] = generateRandomIntIntRange(1, 100);
        }
        int maxValue = getMaxValue(values);
        System.out.println(maxValue);
        System.out.println(calculateFactorial(4));
        System.out.println(recursFactorial(4));
    }

    public static long calculateFactorial(long n){
        long result = 1;
        for(long i = n; i > 1; i--){
            result = result * i;
        }
        return result;
    }

    public static long recursFactorial(long n){
        return (n <= 1) ? 1 :
                n * recursFactorial(n - 1);
    }

    public static int getMaxValue(int[] values){
        int maxValue = Integer.MIN_VALUE;
        for(int value : values){
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
