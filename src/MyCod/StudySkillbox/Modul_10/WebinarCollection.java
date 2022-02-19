package MyCod.StudySkillbox.Modul_10;

import java.util.*;

public class WebinarCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // создание коллекции
        list.add("Horse"); // добавление в коллекцию
        list.add("Frog");
        list.add("Mouse");
        /*Collections.addAll(list, "Dog", "Dolphin"); // добавление списка элементов*/
        // можно туда добавить массив
        List<String> listEmpty = Collections.emptyList(); // добавление иммутабельного списка
        //istEmpty.add("Dog"); // выдаст ошибку
        String[] newAnimals = {"Dog", "Dolphin"};
        Collections.addAll(list, newAnimals); // добавление массива
        Collections.sort(list);
        int isFound = Collections.binarySearch(list, "Dog"); // находит элемент и выдаёт его место
        System.out.println(isFound);
        Collections.sort(list, Comparator.naturalOrder()); // сортировка списка
        Collections.sort(list, Comparator.reverseOrder()); // сортировка списка в обратном направлении
        System.out.println(list.size()); // вывод размера коллекции
        Iterator<String> iterator = list.iterator(); // создание итератора (обходчика)
        while (iterator.hasNext()){ // обход с выводом всей коллекции
            System.out.println(iterator.next());
            for(int i = 0; i < 50; i++) {
                System.out.println(generateQueue(12));
            }
        }
    }
//    public static int generateQueue(int a) {
//        int q = (int) Math.round(Math.random() * a);
//        return q;
//    }
    public static int generateQueue(int limitValue) {
        Random randomObject = new Random();
        return randomObject.nextInt(limitValue);
    }
}
