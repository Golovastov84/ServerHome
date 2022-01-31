package MyCod.StudySkillbox.Modul_10;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        /*ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Первое наше дело");
        todoList.add(1, "Второе наше дело");
        todoList.add(0, "Дело занявшее место первого");
        //todoList.add(4, "*******"); // получим ошибку
        //todoList.add(-1, "*******"); // получим ошибку
        for(int i = 0; i < todoList.size(); i++) { // 1 способ вывода
            System.out.println(todoList.get(i));
        }
        System.out.println("++++++++++");
        for(String items : todoList) { // 2 способ вывода
            System.out.println(items);
        }*/
        ArrayList<String> todoList = new ArrayList<>(){{
           add("Первое дело");
           add("Второе дело");
        }};
        todoList.add("Третье наше дело");
        todoList.remove(0); // удаление 0 элемента
        for(String items : todoList) { // 2 способ вывода
            System.out.println(items);
        }
    }
}
