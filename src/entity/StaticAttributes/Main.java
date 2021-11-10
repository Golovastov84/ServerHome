package entity.StaticAttributes;
class Base {
    public static void print() {
        System.out.println("Base");
}
}

class SubClass extends Base {
    public static void print() {
        System.out.println("SubClass");
    }
}
public class Main {
    public static void main(String[] args) {
        Base object = new SubClass();
        object.print();
    }
}
