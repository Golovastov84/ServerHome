package Learn.inner;

import Learn.inner.Student;

public class Main {
    public static void main(String[] args) {
        Student.Address address = new Student().new Address(); // ссылка на класс Address
        Student student = new Student(); // создание объекта student для работы getAddress
        Student.Address address1 = student.getAddress(); // вызов класс Address через get
    }
}
