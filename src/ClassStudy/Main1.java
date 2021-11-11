package ClassStudy;
final class Man {
    public void sayHello() {
    System.out.println("I am a man");
    }
}
/*class SuperMan extends Man { // Ошибка из-за final
    public void sayHello() {
        System.out.println("I am a superman");
    }
}*/
public class Main1 {
    public static void main(String[] args) {
        //Man man = new SuperMan(); // Ошибка из-за final
        Man man = new Man();
        man.sayHello();
    }
}
