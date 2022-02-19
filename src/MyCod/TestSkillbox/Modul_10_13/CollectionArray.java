package MyCod.TestSkillbox.Modul_10_13;

import java.util.*;

public class CollectionArray {
    public static void main(String[] args) {
//        String domains[] = {"Practice", "Geeks", "Code", "Quiz"};
//        List colList = new ArrayList(Arrays.asList(domains));
//        Collections.sort(colList);
//        System.out.println("List after the use of" +
//                 " Collection.sort() :\n" + colList);
//        HashSet<String> words = new HashSet<>(); // задание коллекции
//        words.add("Первое"); // заполнение коллекции
//        words.add("Второе");
//        words.add("Третье");
//        words.add("Второе");
//
//            System.out.println(words); // вывод коллекции
//
//        System.out.println(words.size());

        List<String> list = new ArrayList<>(); // создание коллекции
        list.add("Horse"); // добавление в коллекцию
        list.add("Frog");
        list.add("Mouse");
        Collections.addAll(list, "Dog", "Dolphin"); // добавление списка элементов
// можно туда добавить массив
        String[] newAnimals = {"Dog", "Dolphin"};
        Collections.addAll(list, newAnimals); // добавление массива
        Collections.sort(list);
        int isFound = Collections.binarySearch(list, "Dog");
        System.out.println((Collections.binarySearch(list, "Dog") >= 0) ? isFound : "Не нашли");
        System.out.println(list);
//        System.out.println(list.size()); // вывод размера коллекции
//        Iterator<String> iterator = list.iterator(); // создание итератора (обходчика)
//        while (iterator.hasNext()) { // обход с выводом всей коллекции
//            System.out.println(iterator.next());

 //       }
    }
}
