package MyCod.TestSkillbox;

public class Modul_2 {
    public static void main(String[] args) {
        int a = 3;
        int b =5;
        if (a < b && b * a > 15) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        System.out.println(true || false && false);
        System.out.println(!true && false || true);
        System.out.println(true && !(false || true));
    }
}
