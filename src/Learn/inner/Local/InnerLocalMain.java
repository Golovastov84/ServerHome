package Learn.inner.Local;

import Learn.inner.Student;

public class InnerLocalMain {
    public static void main(String[] args) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(6);
        //AbstractTeacher teacher1 = (Rector)TeacherCreator.createTeacher(6); // снаружи к классу Rector
        // доступ получить нельзя
        System.out.println(teacher.getClass()); // посмотреть как компилируется класс
        boolean result = teacher.excludeStudent(new Student());
        System.out.println(result);
        teacher = TeacherCreator.createTeacher(777);
        result = teacher.excludeStudent(new Student());
        System.out.println(result);

    }
}
