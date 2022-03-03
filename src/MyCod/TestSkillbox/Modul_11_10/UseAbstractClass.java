package MyCod.TestSkillbox.Modul_11_10;

public class UseAbstractClass {
    static String GetName(Figure f){
        return f.GetName();
    }
    static double GetArea(Figure f){
        return f.Area();
    }
    public static void main(String[] args){
        Figure f1 = new Triangle(3.5, 1.8, 2.2);
        Figure f2 = new Circle(3.0);
        double area;

        f1.ShowName();
        f2.ShowName();

        String name;
        name = GetName(f1);
        System.out.println(name);

        name = GetName(f2);
        System.out.println(name);

        area = GetArea(f1);
        System.out.println("area= " + area);

        area = GetArea(f2);
        System.out.println("area= " + area);


    }
}
