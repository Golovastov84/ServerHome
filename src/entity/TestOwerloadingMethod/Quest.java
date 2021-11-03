package entity.TestOwerloadingMethod;

public class Quest {
    public void method(Number obj){
        System.out.println("1");
    }
    public void method(Character obj) {
        System.out.println("2");
    }
    private static void method(Integer obj){
        System.out.println("3");
    }
    public void method(int i){
        System.out.println("4");
    }
    public void method(double d){
        System.out.println("5");
    }

    public static void main(String[] args) {
        Quest quest = new Quest();
        Number n = 67;
        Integer i = 78;
        quest.method(n);
        quest.method(i);
    }
}
