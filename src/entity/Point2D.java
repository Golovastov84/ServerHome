package entity;

import java.lang.reflect.Member;

public class Point2D extends Point1D{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double length() {
        return Math.hypot(y, getX());
    }
}
