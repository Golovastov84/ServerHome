package MyCod.StudySkillbox.Modul_22_12.main.java;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        long usage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        int[] values = new int[5000000];
        for(int i = 0; i < values.length; i++){
            values[i] = 378465432;
        }
        usage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() - usage;
        System.out.println(usage);

        usage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < values.length; i++){
            numbers.add(i);
        }
        usage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() - usage;
        System.out.println(usage);
    }
}
