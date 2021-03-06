package Learn.NullOptional;

import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMainExt {
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
        /*Optional<Order> order = optionalOrder.or(()-> Optional.of(new Order(10, 5000)));
        // метод соплаер Optional.of(new Order(10, 5000))
        System.out.println(order.get()); // вывод объекта order*/
        Optional<Order> orderFilter = optionalOrder.filter(o -> o.getAmount() == 210);
        System.out.println(orderFilter.get()); // вывод объекта order
    }
}
