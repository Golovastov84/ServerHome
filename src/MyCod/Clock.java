package MyCod;

public class Clock {
    private long time = 3;

    public long getTime() {
        return time; // Метод get извлекает поле time
    }

    public void setTime(long theTime) {
        this.time = theTime+2; // Метод set изменяет поле time
    }
}
