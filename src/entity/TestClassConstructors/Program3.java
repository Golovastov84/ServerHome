package entity.TestClassConstructors;
 interface A5 {
    void a5();
    void b5();
    void c5();
    void d5();
    void e5();
}
 abstract class B5 implements A5 { //1
    public void a5() {
        System.out.print("a");
    }
    public void d5() {
        System.out.print("d");
    }
}
 abstract class C5 extends B5 { //1
    public void b5() {
        System.out.print("b");
    }
    public void c5() {
        System.out.print("c");
    }
    public void d5() {
        System.out.print("D");
    }
}
 class Program5 {
    public static void main(String[] args) {
        A5 c5 = new C5() { //2
            public void b5() {
                System.out.print("B");
            }
            public void e5() {
                System.out.print("e");
            }
        };
        c5.a5();
        c5.b5();
        c5.c5();
        c5.d5();
        c5.e5();
    }
}
