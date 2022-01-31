package MyCod.StudySkillbox.Modul_9;

public class regularExpression_1 {
    public static void main(String[] args) {
        String number = "А677МР197"; // проверяемая строка
        String letterList = "[АВЕКМНОРСТУХ]"; // часть регулярного выражения,
        // которая повторяется
        String regex = "[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{2,3}";
        // строка с регулярным выражением
        System.out.println(number.matches(regex));
        // проверка соблюдается ли регулярное выражение
    }
}
// ответ true