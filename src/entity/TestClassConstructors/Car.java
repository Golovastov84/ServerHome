package entity.TestClassConstructors;

public class Car {
    protected int wheelCount;
    private String model;
    public Car (String model) {
        this.model = model;
        this.wheelCount = 4;
    }
    public String getInfo() {
        return "Model: " + model + " wheels: " + wheelCount;
    }
}
class SuperCar extends Car {
       public SuperCar (String model) {
       super(model);
       this.wheelCount = 3; // Line 1
    }
}
