package MyCod.StudySkillbox.Modul_8.DateAddTime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
       /* Date now = new Date();
        System.out.println(now);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        LocalDate birthday = LocalDate.of(1984, 4, 29);
        System.out.println(birthday.plusYears(18));
        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);*/
        /*String date = "23/01/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);*/
        /*DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).
                localizedBy(new Locale("ru"));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));*/
        /*LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
        //if(time2.compareTo(time1)) {
            System.out.println(time2.compareTo(time1));
        //}*/
        /*LocalDateTime time1 = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            int a = i * 4;
        }
        LocalDateTime time2 = time1.minusDays(2);
        System.out.println(time1.until(time2, ChronoUnit.DAYS));*/
        /*LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis()/1000,
                0, ZoneOffset.ofHours(3));
        System.out.println(now);*/
        String date = "23/01/2021 12:34:13";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);

        LocalDateTime now1 = localDateTime;
        System.out.println(now1.toEpochSecond(ZoneOffset.ofHours(3)));

        System.out.println(now1);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        System.out.println(now2.toEpochSecond(ZoneOffset.ofHours(3)));
        System.out.println((now2.toEpochSecond(ZoneOffset.ofHours(3)) - now1.toEpochSecond(ZoneOffset.ofHours(3)))
                /60/60/24
        );


    }
}
