package MyCod.Experiments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(sum + " = " + (sum - i) + " + " + i);

        }
        System.out.println(sum);*/

       /* Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        List list = new ArrayList(10);
        for (int i = 0; i < 12; i++) {
            list.add(i);
            System.out.println(list.get(i));
        }

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        System.out.println(i1 + i2);
        int k = 0;
        for (int i = 0; i < 10; i++) {
            k = k++;
        }
        System.out.println(k);*/

        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
        for (String number : numbers) {
            if ("third".equals(number)) {
                numbers.add("fourth");
            }
        }
        System.out.println(numbers.size());
    }
}

