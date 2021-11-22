package Learn.NullOptional;

import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMainElse {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(); // Создание массива
        list.add(new Order(71L, 100D)); // Заполнение массива
        list.add(new Order(18L, 132D));
        list.add(new Order(24L, 210D));
        list.add(new Order(35L, 693D));
        list.add(new Order(16L, 741D));
        OrderActionOptional action = new OrderActionOptional(); // Создание объекта
        Optional<Order> optionalOrder = action.findById(list, 23); // вызов метода findById возвращает
        // объект Order завернутый в Optional
        System.out.println(optionalOrder.orElse(new Order())); // вывод объекта order
        System.out.println(optionalOrder.orElseGet(Order::new)); // :: оператор видимости
        //System.out.println(optionalOrder.orElseThrow(IllegalAccessError::new)); // Выбор типа кода ошибки при null
    }
}
