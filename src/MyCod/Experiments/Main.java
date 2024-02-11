package MyCod.Experiments;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] keys1 = sc.nextLine().split(" ");
        String[] keys2 = sc.nextLine().split(" ");
        sc.close();
        /*int yearTo =  Integer.parseInt(keys1[0]) - Integer.parseInt(keys1[0]);
        int monthTo =  Integer.parseInt(keys1[1]) - Integer.parseInt(keys1[1]);*/

        LocalDateTime today1 = LocalDateTime.of(Integer.parseInt(keys1[0]), Integer.parseInt(keys1[1]),
                Integer.parseInt(keys1[2]), Integer.parseInt(keys1[3]),
                Integer.parseInt(keys1[4]), Integer.parseInt(keys1[5]));
        LocalDateTime today2 = LocalDateTime.of(Integer.parseInt(keys2[0]), Integer.parseInt(keys2[1]),
                Integer.parseInt(keys2[2]), Integer.parseInt(keys2[3]),
                Integer.parseInt(keys2[4]), Integer.parseInt(keys2[5]));
        int dayTo = (int) today1.until(today2, ChronoUnit.DAYS);
        int yearsTo = (int) today1.until(today2, ChronoUnit.YEARS);
        int secondTo = (int) today1.until(today2, ChronoUnit.SECONDS);
        int secondNotFullDay = secondTo - dayTo * 24 * 60 * 60;
        System.out.println(dayTo + " " + secondNotFullDay);
        System.out.println(today1);
        System.out.println(today2);
    }
}

