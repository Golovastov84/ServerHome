package MyCod;

public class ByClock {
    public static void main(String[] args) {
        Clock clock = new Clock(); // создание объекта класса
        long data = clock.getTime(); // присваиваие значения полю data от метода get
        System.out.println(data); // вывод значения поля data
        clock.setTime(9); // изменение значения поля time через set
        long data1 = clock.getTime(); // присваиваие значения полю data1 от метода get
        System.out.println(data1); // вывод значения поля data1
    }
}
