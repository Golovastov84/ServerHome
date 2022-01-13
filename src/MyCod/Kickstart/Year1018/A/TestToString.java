package MyCod.Kickstart.Year1018.A;

public class TestToString {
    public static int countNumberClicks (int a, int b) {
        int w = 0;
        while (a%2 != 0) {
            a = a - b;
            w++;
        }
        return w;
    }
    public static void main(String[] args) {
        int q = 1234;
        char[] arrayChar = Integer.toString(q).toCharArray();
        int i;
        for(i = 0; i < arrayChar.length; i++) {
            System.out.println(arrayChar[i]);
        }
        System.out.println((arrayChar[0] - '0') + (arrayChar[1] - '0'));
        String r = Integer.toString(q);
        System.out.println(r);
        int y = Integer.valueOf(r);
        System.out.println(y - 1);
    }
}
