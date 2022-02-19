package MyCod.TestSkillbox.Modul_10_14;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
//        int[] array1 = int of 10;
int a = array.length;
Set<Integer> set = new HashSet<Integer>(){{
    add(156);
    add(21);
    add(156);
    add(21);
    add(389);
}};
        System.out.println(set.size());
    }
}
