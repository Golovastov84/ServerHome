package entity.TestClassConstructors;

public class Program {
    public static void main(String[] args) {
        Cat sam = new SiameseCat(); //1
        sam.zzz(); //2
    }
}
public abstract class Cat {
    abstract void eat();
    void zzz() {
        System.out.println("Sleeps whole day");
    }
}
class SiameseCat extends Cat {} //3