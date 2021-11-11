package ClassStudy;

public class Point4 {
    private final int Max_Range = 1_000;
    final StringBuilder builder = new StringBuilder(); // Изменяемое поле StringBuilder, final указывает только
    // неизменность ссылки. переприсвоить builder не можем из-за final.
    private int x;
    private String name;

    public Point4(int x) {
        this.x = x;
        //Max_Range = 100; // Ошибка изменеия значения поля Max_Range
        builder.append("Hello"); // Возможно изменять внутренне состояние объекта
        //builder = new StringBuilder(); // Ошибка из-за final.
    }
    final int length() { // Запрет на переопределения метода из-за final
        return Math.abs(x);
    }
}
