package ClassStudy;

public class Quest1 {
    public static int method () {
        final int loc;
        //System.out.println(loc); //1
        loc = 4; //2
        return loc + 1; //3
    }

    public static void main(String[] args) {
        method();
        method();
        method();
        System.out.println(method());
    }
}
