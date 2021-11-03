package entity;

public class Person {
    private int id;
    private String name = "";
    public Person(){
        super();//Конструктор
    }

    public Person(int id) {//Перегрузка конструктора
        this.id = id;
    }
    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
