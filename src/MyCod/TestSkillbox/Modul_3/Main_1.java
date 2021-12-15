package MyCod.TestSkillbox.Modul_3;

public class Main_1 {
    public static void main(String[] args) {
        for (int i = 9; i > 3; i = i - 1) {
            System.out.print(i);
        }
        System.out.println();
        for (int j = 56; j > 0; j = j + 10) {
            System.out.println("YES");
            if (j > 60) {
                break;
            }
        }
        int a = 0;
        while (a > 0) {
            a = a + 1;
            System.out.println("YES_1");
        }
        /*int s = 0;
        while (s < 20) {
            if (s > 6 && s < 10) {
                continue;
            }
            System.out.println("YES_2");
            System.out.println(s + 1);
            s = s + 1;
        }*/
        int t = 0;
        for (int d = 0; d < 10;) {
            if (d < 5) {
                d = d + 1;
            }
            d = d + 1;
            t = t + 1;
            System.out.println("YES_3");
            System.out.println(t);
        }
        boolean q = 0 < 10;
        System.out.println(q);
    }
}
