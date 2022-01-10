package MyCod.StudySkillbox.Modul_7;
public class Main {
public static Product milk; // строка 10 Будет выводить null
    public static int milkPrice; // заполняется 0
    public static void main(String[] args) {

        //Product milk; // ошибка
        //int bikePrice; // без задания значение обращение к
        // данному примитиву вызовет ошибку
        System.out.println(milk); // выведет null
        System.out.println(milkPrice); // выведет 0
        //System.out.println(bikePrice); // выведет ошибку
       // System.out.println(milk.getName()); // выведет ошибку
    }
}
