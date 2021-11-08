package entity;

public class Student2 {
    private int id2;
    private String name = "";
    private int yearOfStudy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если объект равен сам себе, то возващается true
        if (o == null || getClass() != o.getClass()) return false; // Если передается null или объекты разных классов
        // принадлежат разным типам данных, то возвращаем  false

        Student2 student2 = (Student2) o; // Если все неверно, то ненулевой объект приравненный к типу Student2
        // Далее сравнение полей
        if (id2 != student2.id2) return false; // Если год обучение текущего студента не равен году обучения переданного, то
        // возвращает false
        if (yearOfStudy != student2.yearOfStudy) return false;
        return name != null ? name.equals(student2.name) : student2.name == null; // Сравнение объектных типов.
        //используется тернальный оператор. если name не равен null, то вызывается equals с переданным объектом
        //Если не равен null проверяется не null ли у переданного.
    }

    @Override
    public int hashCode() {
        int result = id2;
        result = 31 * result + (name != null ? name.hashCode() : 0); // для того что бы hashCode были разными у разных
        // объектов у id2 и у yearOfStudy. Каждое значение умножается на простое число, здесь на 31.
        result = 31 * result + yearOfStudy;
        return result;
        // если запись return result; заменить return 42; с удалением вышележащих
        // до public ошибки компиляции не возникнет, но так делать нельзя. Возникают проблемы с хранеием объектов.
    }
}
