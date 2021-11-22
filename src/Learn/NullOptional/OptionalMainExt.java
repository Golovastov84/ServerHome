package Learn.NullOptional;

import entity.Order;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class OptionalMainExt {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>(); // Создание массива
        list.add(new Order(71L, 100D)); // Заполнение массива
        list.add(new Order(18L, 132D));
        list.add(new Order(24L, 210D));
        list.add(new Order(35L, 693D));
        list.add(new Order(16L, 741D));
        OrderActionOptional action = new OrderActionOptional(); // Создание объекта
        Optional<Order> optionalOrder = action.findById(list, 24); // вызов метода findById поиск по id
    }
}
