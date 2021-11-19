package Learn.inner.Interface;

public interface Action {
    static void newService() {} // Статический метод прямо в интерфейсе с 8 версия java
    default void newService2() {}
    public static class StaticService { // public static можно не писать, он становиться автоматически
        static void service() {} // статический метод
        void service2() {} // метод
    }
}
class A {
    interface B{} // interface в классе можно объявлять
    void method1() {
        // interface C {} // interface в методе класса нельзя объявлять
    }
}
