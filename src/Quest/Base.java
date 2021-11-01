package Quest;

public class Base {
    Base() {
        int i = 1;
        System.out.println(i);
    }
}
class Quest extends Base{
    static int i;
    public static void main(String[] args) {
Quest ob = new Quest();
        System.out.println(ob);
    }
}