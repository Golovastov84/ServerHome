package Learn.function;

public class MammalInt  implements Animal{

    public void eat() {
        System.out.println("Млекопитающие кушает");
    }

    public void travel() {
        System.out.println("Млекопитающие путешествует");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
