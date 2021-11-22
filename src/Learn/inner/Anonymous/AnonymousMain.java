package Learn.inner.Anonymous;

public class AnonymousMain {
    public static void main(String[] args) {
        Service service = new Service() { // создан объект service переопределение методов команда @Override
           @Override
            public void service1() {
                System.out.println("anon serv 1");
            }

            @Override
            public void service2() {
                System.out.println("anon serv 2");
            }
        };
        service.service1(); // вызов анонимного метода через объект service
    }
}
