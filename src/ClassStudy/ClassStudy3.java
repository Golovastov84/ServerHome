package ClassStudy;

import java.util.Arrays;

public class ClassStudy3 {
    public static void printPoints(Point3[] points) { // 4 ссылка на массив Point3[] с переменной points
        for (int i = 0; i < points.length; i++)
            points[i].print3(); // выполняется метод print3
        }
    public static void main(String[] args) {
    Point3[] data = new Point3[10]; // 1 формируется массив data длиной 10 элементов с ссылкой на класс Point3
    for (int i = 0; i < data.length; i++){
        data[i] = new Point3();}// 2 Заполняется массив data элементами описанными в классе Point3
        //data[1].append["sdsd"];
        //int[i] data = 1;}  // 2 Заполняется массив data элементами описанными в классе Point3
    printPoints(data); // 3 Вызывается метод printPoints
    }
}
