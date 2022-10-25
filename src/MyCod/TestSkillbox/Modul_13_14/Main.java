package MyCod.TestSkillbox.Modul_13_14;

import MyCod.StudySkillbox.Modul_13_1.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(digits)
                .map(String::valueOf)
                .reduce((s1, s2) -> s1 + s2)
                .ifPresent(System.out::println);
        /*for (int i = 0; i < 11; i++) {
            System.out.print(i + ", ");
        }*/

    }
}
