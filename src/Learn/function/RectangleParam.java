package Learn.function;

import java.util.function.BiFunction; // стандартный интерфейс BiFunction
import java.util.function.Supplier;

public enum RectangleParam implements Supplier<BiFunction> { // Supplier для создания объектов
    PERIMETER((o1, o2) -> 2 * (o1 + o2)),
    SQUARE((o1, o2) -> o1 * o2);
    private BiFunction<Double, Double, Double> biFunction; // Поле с именем biFunction
    RectangleParam(BiFunction<Double, Double, Double> biFunction) {
        this.biFunction = biFunction;
    }

    @Override
    public BiFunction<Double, Double, Double> get() { // метод для Supplier
        return biFunction; // возвращение biFunction
    }
}
