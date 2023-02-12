package MyCod.StudySkillbox.Modul_26.abstract_factory;

import java.awt.*;
import java.util.List;

public class LengthCalculator {

    private List<Point> points;
    private double length;

    public LengthCalculator(List<Point> points, double length) {
        this.points = points;
        this.length = length;
    }

    public static List<Point> getPoints() {
        return null;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public static double getLength(Point point1, Point point2) {
        return 0;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
