package entity.StaticAttributes;

public class LearnMainStatic {
    public static void main(String[] args) {
        Student student1 = new Student(42);
        Student student2 = new Student(77);
        Student.faculty = "MMF"; // Доступ к полю faculty класса
        //student1 = null;
        //student1.faculty = "GEO"; // Не корректно,
        // кампилятор сам подставляет вместо student1 класс Student
        //System.out.println(student1.faculty);
        System.out.println(Student.faculty);
    }
}
