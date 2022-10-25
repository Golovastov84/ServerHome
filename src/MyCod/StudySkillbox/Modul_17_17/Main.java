package MyCod.StudySkillbox.Modul_17_17;

import java.util.ArrayList;
import java.util.concurrent.*;


public class Main {
    private static StringBuffer builder = new StringBuffer();
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
//        executor.setCorePoolSize(); // количество потоков которое задали
//        executor.setMaximumPoolSize(10); // до какого количества может увеличиваться число потоков
//        executor.setKeepAliveTime(10, TimeUnit.SECONDS); // сколько времени дополнительные потоки могут
        // находиться в состоянии бездействия
//        executor.getQueue().size(); // размер очереди потоков которые ждут своего выполнения
//executor.getActiveCount(); // получение количество активных потоков
        executor.getCompletedTaskCount(); // количество завершенных задач

    }
}
