package Learn.inner.Local;

import Learn.inner.Student;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) { // метод возвращает AbstractTeacher в зависимости от id
        // которое передано
        // inner local class
        class Rector extends AbstractTeacher { // класс Rector внутри метода наследующий класс AbstractTeacher
            Rector(int id) {
                super(id);
            }
            @Override
            public boolean excludeStudent(Student student) {
                if (student != null) {
                    // more code
                    return true;
                }
                else {
                    return false;
                }
            }
        } // end of inner local clacc
        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }
    private static boolean isRectorId(int id) {
        // id checking
        return (id == 6); // stub
    }
}
