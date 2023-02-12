package MyCod.StudySkillbox.Modul_26.abstract_factory;

import java.awt.*;
import java.util.List;

public class CarRouteFactory  implements RouteAbstractFactory{
    private List<Point> points;
    public  CarRouteFactory(List<Point> points){
        this.points = points;
    }

    @Override
    public Route createRoute(){
        return new CarRoute(points);
    }
}
