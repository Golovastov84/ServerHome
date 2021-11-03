package entity;

public class LearnMainOverload {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.method();
        point.method(42);
        point.method(101.1);
        Point2D.method("java");//Вызов статического метода
    }
}
