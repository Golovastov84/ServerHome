import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ReturnChar {
    public static void main(String[] args) {
        /*System.out.println("А " + (int) "А".charAt(0));
        System.out.println("Я " + (int) "Я".charAt(0));
        System.out.println("Ё " + (int) "Ё".charAt(0));
        System.out.println("ё " + (int) "ё".charAt(0));
        System.out.println("A " + (int) "A".charAt(0));
        System.out.println("Z " + (int) "Z".charAt(0));
        System.out.println((char)65);
        for (int i = 0; i < 1200; i++) {
            System.out.println(i + " - " + (char)i);

        }*/
        // ( Math.random() * (b-a) ) + a
        // double a = Math.random()*3;

        /*int maxSurnameLength = 15;
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i < (int) ((Math.random() * (maxSurnameLength - 5)) + 5); i++) {
                if (i == 1) {
                    builder.append((char) (int) ((Math.random() * (1072 - 1040)) + 1040));
                } else {
                    int letterInt = (int) ((Math.random() * (1105 - 1072)) + 1072);
                    if (letterInt == 1104) {
                        letterInt = 1105;
                    }
                    builder.append((char) letterInt);
                }
            }
            System.out.println(builder);*/

        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate minBirthDay = LocalDate.parse("1910.01.01", formatter);
        int maxDays = (int) minBirthDay.until(LocalDate.now(), ChronoUnit.DAYS);
        for (int i = 0; i < 100; i++) {
            int plusDay = (int) ((Math.random() * (maxDays - 2)) + 2);
            LocalDate birthDay = minBirthDay.plusDays(plusDay);
            System.out.println(plusDay);
            System.out.println(formatter.format(birthDay));
        }*/

        String startDayBase = "1910.01.01";
        String startDaySec = startDayBase.concat( " 00:00:00");
        DateTimeFormatter formatterSec = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        LocalDateTime minBirthDaySec = LocalDateTime.parse(startDaySec, formatterSec);
        long maxSecond = minBirthDaySec.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        for (int i = 0; i < 100; i++) {
        long plusSecond = (long) ((Math.random() * (maxSecond - 2)) + 2);
        LocalDateTime visitingTime = minBirthDaySec.plusSeconds(plusSecond);
            System.out.println(maxSecond);
            System.out.println(formatterSec.format(visitingTime));
        }
    }
}
