package ClassStudy;
class A {
    public final void print () {
        System.out.println("A");
    }
}
/*class B extends A {
    public void print () {
        System.out.println("B");
    }
}*/
public class Main {
    public static void main(String[] args) {
        //A object = new B();
        A object = new A();
        object.print();
    }
}
