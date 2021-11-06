package entity.TestClassConstructors;
abstract class Figure {
    int side1;
    int side2;
    public Figure (int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    abstract void countArea();
}
class Triangle extends Figure {
    public Triangle (int side1, int side2) {
        super(side1,side2);
    }

    @Override
    void countArea() {
        System.out.println(0.5*side1*side2 + ", ");
        System.out.println(0.5*this.side1*this.side2 + ", "); //1
    }
}
class Rectangle extends Figure {
    private int side1 = 1;
    private int side2 = 1;
    public Rectangle(int side1, int side2) {
       super(side1, side2);
    }
    @Override
    void countArea() {
        System.out.println(side1*side2 + ", ");
        System.out.println(super.side1*super.side2);

    }
}
public class Program2 {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 4);
        triangle.countArea();
        Figure rctangle = new Rectangle(1, 2);
        rctangle.countArea();
    }
}
