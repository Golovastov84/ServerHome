package MyCod.StudySkillbox.Modul_10.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> good2count = new TreeMap<>(); // создаётся коллекция
        good2count.remove("Молоко");
        Scanner scanner = new Scanner(System.in); // создание сканера
        for (; ; ) { // бесконечный цикл
            String goodName = scanner.nextLine();
            if (goodName.equals("LIST")) {
                printMap(good2count); // вызов метода печати
                continue;
            }
            int count = 1;
            if (good2count.containsKey(goodName)) { // проверяет есть ли такой ключ
                count = good2count.get(goodName) + 1; // если уже есть такой элемент (ключ),
                // то ему передаётся значение 1++
            }
                good2count.put(goodName, count); // добавление элемента
        }
    }

    private static void printMap(Map<String, Integer> map) { // метод печати всй коллекции
        // Map - это интерфейс, от него наследуется HashMap
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
