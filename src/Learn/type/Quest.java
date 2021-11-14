package Learn.type;

public class Quest {
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE; //1
        if (n1 == n2) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
        System.out.println(Numbers.FIVE.ordinal()); //2
    }
}
