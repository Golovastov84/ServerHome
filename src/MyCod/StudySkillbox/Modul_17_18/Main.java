package MyCod.StudySkillbox.Modul_17_18;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long sekond = System.currentTimeMillis();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
//service.schedule(() -> System.out.println("YES"), 5, TimeUnit.SECONDS);
/*service.scheduleAtFixedRate(() -> System.out.println(System.currentTimeMillis() - sekond), 3, 4,
             TimeUnit.SECONDS);*/
        // задание потока, времени до старта, время с начала старта и до повторения, единица измерения времени

        service.scheduleWithFixedDelay(() -> System.out.println(System.currentTimeMillis() - sekond), 3, 4,
                TimeUnit.SECONDS);
        // задание потока, времени до старта, время с конца выполнения потока и до повторения, единица
        // измерения времени

    }
}
