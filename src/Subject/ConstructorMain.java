package Subject;

import Bugatti.Car;

public class ConstructorMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Subject subject1 = new Subject(777, "John");
        System.out.println(subject1.subjectId);
        Car bugatti2 = new Car("Toyota");
        System.out.println(bugatti2.model);
    }
}
