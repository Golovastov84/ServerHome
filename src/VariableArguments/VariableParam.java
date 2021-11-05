package VariableArguments;
import java.util.Arrays;
public class VariableParam {
    public void method(int... values) {// Метод с переменным числом элементов
        if (values.length != 0) {
            System.out.println(Arrays.toString(values));
        } else {
            System.out.println("withoit values");
        }
    }

    public void method(int a, int b) {// Перегрузка метода
        System.out.println(a + " " + b);
    }
}
