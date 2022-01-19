package MyCod.StudySkillbox.Modul_9;

import java.util.StringJoiner;

public class concatenationWithDelimiter {
    public static void main(String[] args) {
       /* String name1 = "Василий";
        String name2 = "Артём";
        String name3 = "Паша";
        String name4 = "Сергей";

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        joiner.add(name4);
        System.out.println(joiner);*/

        /*String name1 = "Василий";
        String name2 = "Артём";
        String name3 = "Паша";
        String name4 = "Сергей";

        String joiner = String.join(", ", name1, name2, name3, name4);
        System.out.println(joiner);*/

        String name = "Максим";
        int birthYear = 1986;
        // {"name" : "Максим", "birthYear" : "1986"} // как надо вывести
        String tempLate = "{\"name\" : \"%s\", \"birthYear\" : \"%d\"}"; // задаём шаблон
        // %s - что надо вставить значение строки
        // %d - что надо вставить численное значение переменной
        //String result = String.format(tempLate, name, birthYear); // формируем строку по шаблону
        //System.out.println(result);
        System.out.printf(tempLate, name, birthYear); // сразу выводим строку по шаблону
    }
}
