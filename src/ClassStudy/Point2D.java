package ClassStudy;

import java.util.Random;

public class Point2D {
    //final int Max_Range = 1_000; // Если убрать Max_Range из конструкторов
    final int Max_Range;
    private int x;
    private int y;
    /*{
        Max_Range = new Random().nextInt(10_000);
    }*/ // Логический блок
    public Point2D () { // Конструктор 1
        Max_Range = 1_000; // убрать для работы 6 строки
    }
    public Point2D (int x, int y) { // Конструктор 2
        Max_Range = new Random().nextInt(10_000); // убрать для работы 6 строки
        this.x = x;
        this.y = y;
    }
}
