package VariableArguments;

public class LearMainVariableParam {
    public static void main(String[] args) {
        VariableParam param = new VariableParam();
        param.method(42, 3, 5);
        param.method();
        int [] arr = {4, 5};//создание массива
        param.method(arr);
        param.method(1, 42);
    }
}
