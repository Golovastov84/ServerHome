package Learn.inner.Local;

import Learn.inner.Student;

public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }
    public boolean excludeStudent (Student student) {
        return false;
    }

}
