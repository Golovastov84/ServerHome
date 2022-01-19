package MyCod.TestSkillbox.Modul_8;

public class Main {
    public static void main(String[] args) {
        /*int a = 14;
        int b = 4;
        int c = a / b;
        System.out.println(c);*/
        /*int i = 5;
        int a = i++;
        System.out.println(i + " " + a);*/
        int a = 5, b = 5, c = 5, d = 5;
        int c1 = --a + a--; // 4 + 4 = 8
        int c2 = b-- + --b; // 5 + 3 = 8
        int c3 = ++c - c++; // 6 - 6 = 0
        int c4 = d++ - ++d; // 5 - 7 = -2
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
        /*double weight = 889.623;
        int approxVolue = 10 * weight;
        ошибка*/
    }
}
