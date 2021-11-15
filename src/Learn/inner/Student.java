package Learn.inner;

public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Adress adress; // поле типа Adress
    class Adress {
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private String email;
        private String skype;
        private long phoneNumber;
    }
    // constructors & methods
    Student.Adress adressObject = new Student().new Adress(); // создание независимого объекта
}