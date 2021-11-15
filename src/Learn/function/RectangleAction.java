package Learn.function;

public class RectangleAction {
    public Double action (RectangleParam param, Double a, Double b) {
        return param.get().apply(a, b); // из param методом get вызываем метод apply
    }
}
