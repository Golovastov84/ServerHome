package ClassStudy;

import java.awt.*;

public class ClassStudy2 {
    public static void printPoints(Point[] points) {
        for (int i = 0; i < points.length; i++)
            System.out.println("Цвет точки х=" + points[i].x + ", y=" + points[i].y + " " + points[i].color);
    }
    public static void main(String[] args) {
    Point[] data = new Point[10];
    for (int i = 0; i < data.length; i++)
        data[i] = new Point();
    printPoints(data);
    }
}
