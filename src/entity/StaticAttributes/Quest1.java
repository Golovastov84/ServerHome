package entity.StaticAttributes;

public class Quest1 {
    {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }
    Quest1() {
        System.out.println("3");
    }
    public static void main(String[] args) {

        System.out.println("4");
        //Quest1 r = new Quest1(); // Для запуска класса Quest1
        //System.out.println(r);
    }
}
