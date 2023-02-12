package MyCod.StudySkillbox.Modul_26.abstract_factory;

import java.awt.*;
import java.util.List;

public class SpeedProvider {

    private List<Point> points;
    private double speed;

    public SpeedProvider(List<Point> points, double speed) {
        this.points = points;
        this.speed = speed;
    }

    public static List<Point> getPoints() {
        return null;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public static double getSpeed(Point point1, Point point2) {
        return 0;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
