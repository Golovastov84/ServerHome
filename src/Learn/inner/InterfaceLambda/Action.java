package Learn.inner.InterfaceLambda;
@FunctionalInterface // если в наличии один метод
public interface Action {
    void logic1(); // Абстрактный метод
    // void logic2(); // Абстрактный метод. если его добавить,
    // лямбда выражение станет невозможным
}
