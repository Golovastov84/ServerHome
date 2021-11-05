package entity;

public class Student extends Person {
    private int yearOfStudy;

    public Student(int yearOfStudy) { // Обращение к конструктору
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, String name, int yearOfStudy) { // Обращение к конструктору
        super(id, name);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, int yearOfStudy) {
        this(yearOfStudy); // Может быть только один в классе
    }
}
