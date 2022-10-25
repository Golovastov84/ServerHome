package MyCod.StudySkillbox.Modul_17_15;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        /*Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Math.random());
            }
        });*/
        ExecutorService service = Executors.newSingleThreadExecutor();
       Future<Double> future = service.submit(() -> {
            double sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += Math.random();
            }
            return sum;
        });
        try {
            System.out.println(future.get());
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
