package Learn.type;

public class SeasonDayEnum {
   // private Season season; // первый вариант enum
    private int season;
    private int day;

    /*public SeasonDayEnum(Season season, int day) {
        this.season = season.ordinal();
        this.day = day;
        System.out.println(season.ordinal() + " " + day);
    } // первый вариант enum*/

    public SeasonDayEnum(int season, int day) { // при применении метода ordinal
        this.season = season;
        this.day = day;
        System.out.println(season + " " + day);
    }
}
