package entity.StaticAttributes;

import java.util.Locale;

public class Student1 {
    static {  // Статический блок
        faculty = "MMF"; // Передаёт статическому объекту faculty значение MMF
        //int a = 1/0; // Будет ошибка статической инициализации
    }
    static String faculty; // Статическое поле класса
    /*private long studentId;
    private String name = "";
    private int yearOfStudy;*/
    /*public Student1(long studentId){

        this.studentId = studentId;
    }*/

    public static void convertFaculty(String head) {
        System.out.println(head + " " + faculty/*.toLowerCase()*/); // Вывод значения метода convertFaculty
        // и вывод значения объекта faculty
    }
}
