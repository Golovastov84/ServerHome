package entity.TestClassConstructors;
class A3 {
    A3(){
        System.out.println("A: no arguments");
    }
    A3(String args) {
                System.out.println("A: one argument");
    }

    public void a3() {
    }
}
class B3 extends A3 {
    B3() {
        this("");
        //super();
        System.out.println("B: no arguments");
    }
    B3(String args) {
        //this();
        super("");
        System.out.println("B: one argument");
    }
}
public class Main3 {
    public static void main(String[] args) {
        B3 b = new B3();
    }
}
