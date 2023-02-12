package MyCod.StudySkillbox.Modul_26.abstract_factory;

public class RouteFactory {
    public static Route getRoute(RouteAbstractFactory factory){
        return factory.createRoute();
    }

}
