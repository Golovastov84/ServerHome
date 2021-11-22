package Learn.NullOptional;

import entity.Order;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderActionOptional {
    public Optional<Order> findById (List<Order> orders, long id) { // передается список Order, и в списке надо найти id
        List<Order> result = orders.stream().filter(o -> id == o.getOrderId()).collect(Collectors.toList());
        Optional<Order> optionalOrder = result.size() != 0 ? Optional.of(result.get(0)) : Optional.empty();
        // Оболочка над order, это значит что он может оказаться пустым
       // ? тернальный оператор (условие), после ? если верно, после : если не верно
        return optionalOrder;
    }
    // далее сокращенная версия выбора id (дублирование кода сверху)
    public Optional<Order> findByIdOptional (List<Order> orders, long id) { // передается список Order, и в списке надо найти id
        Optional<Order> optionalOrder = orders.stream().filter(o -> id == o.getOrderId()).findAny();
        // Оболочка над order, это значит что он может оказаться пустым
        return optionalOrder;
    }
}
