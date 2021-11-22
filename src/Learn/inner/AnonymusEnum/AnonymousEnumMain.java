package Learn.inner.AnonymusEnum;

import java.util.Arrays;

public class AnonymousEnumMain {
    public static void main(String[] args) {
        Arrays.stream(Shape.values()).forEach(e -> System.out.println(e.computeSquare()));
        // создаём массив команда Arrays
        // stream получение последовательного потока из массива
        // Shape метод
        // перечисление forEach(e -> или называется Consumer
        // System.out.println вывод на консоль
        // e.computeSquare() вызов метода computeSquare() на перечислении e
    }
}
