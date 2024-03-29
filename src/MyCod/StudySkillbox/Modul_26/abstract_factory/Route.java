package MyCod.StudySkillbox.Modul_26.abstract_factory;

import java.awt.*;
import java.util.List;

public abstract class Route {
    protected List<Point> points;
    public Route(List<Point> points){
        this.points = points;
    }
    public abstract double calculateDuration();
    public abstract double calculateLength();
}
