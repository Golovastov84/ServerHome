package Learn.NullOptional;

import java.util.OptionalInt;

public class OptionalIntMain {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(1); // создание объекта. Сюда нельзя передать null
        int value = optionalInt.getAsInt(); // извлечение значения из optionalInt
        System.out.println(value);
        OptionalInt optional1 = OptionalInt.empty(); // создание пустого значения
        int value1 = optional1.orElse(777); // замена значения
        System.out.println(value1);
    }
}
