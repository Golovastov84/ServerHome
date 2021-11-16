package Learn.inner;

public class FreeAddress extends Student.Address {
    /*public FreeAddress() { // создание конструктора для ликвидации ошибки обращения
        // к классу через уровень
        new Student().super(); // Обращение к конструктору супер класса
    } */ // первый вариант
    public FreeAddress(Student student) { // создание конструктора для ликвидации ошибки обращения
        // к классу через уровень, с параметром от основного класса
        student.super();
    }
}
