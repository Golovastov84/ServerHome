package ClassStudy;

public class ClassStudy {
    public static void printPoints(int[] x, int[] y, int[] color) {
        for (int i = 0; i < x.length; i++)
            System.out.println("Цвет точки х=" + x[i] + ", y=" + y[i] + " " + color[i]);
    }
    public static void main(String[] args) {
    int[] x = new int[10];
    for (int i = 0; i < x.length; i++) {
        x[i] = 1+i;
    }
    int[] y = new int[10];
    int[] color = new int[10];
    printPoints(x, y, color);
    }
}
