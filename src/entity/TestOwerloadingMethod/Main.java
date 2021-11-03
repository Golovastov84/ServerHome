package entity.TestOwerloadingMethod;

public class Main {
    public static void main(String[] args) {
       A a = new B();
        a.method(42);
    }
}
class A {
    public void method(Object obj) {
        System.out.println("A");
    }
}
class B extends A {
    public void method(Integer obj) {
        System.out.println("B");
    }
}
