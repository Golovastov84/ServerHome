package MyCod.StudySkillbox.Modul_17_11;

import java.util.ArrayList;

public class Main {
    /*private static Vector<Double> numbers = new Vector<>();

    public static void main(String[] args) {
    ArrayList<Thread> threads = new ArrayList<>();
    for(int i = 0; i < 100; i++) {
        threads.add(new Thread(() -> {
            for(int j =0; j < 100_000; j++){
                numbers.add(Math.random());
            }
            System.out.println(numbers.size());
        }));
    }
    threads.forEach(Thread :: start);
    }*/
    private static StringBuffer builder = new StringBuffer();
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100_000; j++) {
                    builder.append("d");
                }
                System.out.println(builder.length());
            }));
        }
        threads.forEach(Thread::start);
    }
}


