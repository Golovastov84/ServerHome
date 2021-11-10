package entity.StaticAttributes;

public class Student {
    static String faculty; // Статическое поле класса
    private long studentId;
    private String name = "";
    private int yearOfStudy;
    public Student (long studentId){
        this.studentId = studentId;
    }
}
