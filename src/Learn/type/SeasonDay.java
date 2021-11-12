package Learn.type;

public class SeasonDay {
    public static final int WINTER = 0;
    public static final int SPRING = 1;
    public static final int SUMMER = 2;
    public static final int AUTUMN = 3;
    private int season;
    private int day;

    public SeasonDay(int season, int day) { // Конструктор
        this.season = season;
        this.day = day;
        System.out.println(season + " " + day);
    }
}
