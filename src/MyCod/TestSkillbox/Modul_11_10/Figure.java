package MyCod.TestSkillbox.Modul_11_10;

abstract class Figure {
    protected String name = " ";
    protected double pi = 3.1415;

    abstract void ShowName();
    abstract double Area();

    String GetName(){
        return name;
    }
}

class Triangle extends Figure{
    double a, b, c;

    public Triangle(double a, double b, double c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void ShowName(){
        System.out.println("Triangle");
    }

    double Area(){
        if(((a + b) < c) || ((b + c) < a) || ((a + c) < b))
            return 0.0;
        double p = (a + b + c) / 2;
        double s;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}

class Circle extends Figure{
    double r;

    public Circle(double r) {
        name = "Circle";
        this.r = r;
    }

    double Area() {
        return pi * r * r;
    }

    void ShowName() {
        System.out.println("Circle");
    }
}
