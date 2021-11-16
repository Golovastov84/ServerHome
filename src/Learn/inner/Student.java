package Learn.inner;

/*import java.io.Serializable;*/

public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address address; // поле типа Adress

    public class Address {
    /*public class Address extends There implements Serializable {*/
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private String email;
        private String skype;
        private long phoneNumber;
        // private static long phoneType; // Не может объявлять статические поля во
        //вложенном классе
            // class Wrong {} // Вкладывать класс вложения 2 уровня не очень хорошо,
        // не корректно
        /*static {

        }*/ //     Внутренний класс не может объявлять статический логический блок
    // Student.Address addressObject = new Student().new Address(); // создание независимого объекта
    public Address() { // Конструктор
    }

    public void action() { // Метод
        group = 101;
    }
    /*public static void action() { // Метод
        group = 101;
    }*/ // Внутренний класс не может объявлять статические методы
}
    public Student() {} // Конструктор
    public void operation() { // Метод
        address.city = "Izhevsk";
    }
}