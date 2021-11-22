package Learn.inner.InterfaceLambda;

public class AnonymousMain2 {
    public static void main(String[] args) {
        Action action = () ->  System.out.println("Interface"); // Лямбда выражение
        action.logic1(); // вызов метода

    }
}
