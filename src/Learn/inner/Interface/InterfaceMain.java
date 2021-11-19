package Learn.inner.Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        Action.StaticService.service(); // вызов статическорго метода service
        Action.newService(); // вызов статический метод из интерфейса
        new Action.StaticService().service2(); // созание объекта
        new Action(){}.newService2(); // вызов метода newService2 (создание объекта) со свойством default
        // {} предсавляет реализацию внутреннего класса
    }
}
