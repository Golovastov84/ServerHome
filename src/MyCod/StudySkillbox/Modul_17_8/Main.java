package MyCod.StudySkillbox.Modul_17_8;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(Main::someHeavyMethod));
        }
        threads.forEach(t->t.start());
    }

    private static /*synchronized*/ void someHeavyMethod() {
        for (int i = 0; i < 1000_000; i++) {
            double value = Math.random() / Math.random();
            synchronized (numbers) {
                numbers.add(value);
            }
        }
        System.out.println(numbers.size());
        numbers.clear();
    }
}
