package ClassStudy;

public class ClassStudy3 {
    public static void printPoints(Point3[] points) {
        for (int i = 0; i < points.length; i++)
            points[i].print3();
    }
    public static void main(String[] args) {
    Point3[] data = new Point3[10];
    for (int i = 0; i < data.length; i++)
        data[i] = new Point3();
    printPoints(data);
    }
}
