package MyCod.StudySkillbox.Modul_10;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>(); // задание коллекции
        words.add("Первое"); // заполнение коллекции
        words.add("Второе");
        words.add("Третье");
        words.add("Второе");
            for(String word : words) {
                System.out.println(word); // вывод коллекции
            }
        System.out.println(words.contains("Второе")); // true, если содержиться
    }
}
