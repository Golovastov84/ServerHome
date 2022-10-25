package MyCod.StudySkillbox.Modul_17_14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        Callable callable = () -> {
            double sum = 0;
            for(int i = 0; i < 1000; i++){
                sum += Math.random();
            }
            if(sum/1000 < 0.6) {
                throw new IllegalArgumentException("Ошибка < 0.6");
            }
          return sum / 1000;
        };

        FutureTask<Double> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException r){
            System.out.println("Exception: " + r.getMessage());
        }
    }
}
