package entity.test;

class A {
    String version = "1.0 A";

    String testMetod() {
        return "A";
    }
}

class B extends A {
    String version = "2.0 B";
    String testMetod(){
        return "B";
    }
    }
public class Main2 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.version + a.testMetod());
    }
}
