package entity.StaticAttributes;

public class Student2 {
    static String faculty2; // Статическое поле класса
    private long studentId2;
    private String name2 = "";
    private int yearOfStudy2;
    public Student2(long studentId2){

        this.studentId2 = studentId2;
    }

    public static void convertFaculty2(String head2) {
        //this // Не может обращаться
        //int a = studentId2; // в статическом методе не может быть ссылки на нестатическое поле класса
        System.out.println(head2 + " " + faculty2/*.toLowerCase()*/); // Вывод значения метода convertFaculty
        // и вывод значения объекта faculty2
    }
}
