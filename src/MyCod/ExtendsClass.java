package MyCod;

public class ExtendsClass extends SuperClass {
    private String brand = null;

    public ExtendsClass(String br, String no) {
        super(no); // Вызов конструктора superClass суперкласса. Обязательно.
        this.brand = br;
        System.out.println(brand);
    }
}
