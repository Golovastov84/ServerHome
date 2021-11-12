package Learn.type;

public class LearnMainEnum {
    public static void main (String[] args) {
        SeasonDay seasonDay = new SeasonDay(SeasonDay.SPRING, 21); // Вызов конструктора, переменная season
        // принимает значения области final SPRING
        // SeasonDayEnum seasonDayEnum = new SeasonDayEnum(Season.SPRING, 22); // первый вариант enum
         SeasonDayEnum seasonDayEnum = new SeasonDayEnum(Season.SUMMER.ordinal(), 22); // возвращает порядковую позицию
        // ordinal

    }
}
