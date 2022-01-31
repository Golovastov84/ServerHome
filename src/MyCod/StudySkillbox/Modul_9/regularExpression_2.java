package MyCod.StudySkillbox.Modul_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression_2 {
    public static void main(String[] args) {
        String text = "Алексей, добрый день.\nПосмотрите сайт http://stroikabanya.ru/, а также думаю Вас " +
                "заинтересует его ссылка на сайт - https://mail.ru/\n Если возникнут вопросы пишите.";
        String regex = "https?:\\/\\/[^,\\s]+"; // регулярное выражение
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) { // возврящает true когда найдено соответствие
            int start = matcher.start(); // находит начало части текста удовлетворяющего условиям
            // регулярного выражения
            int end = matcher.end(); // находит конец части текста удовлетворяющего условиям
            // регулярного выражения
            System.out.println(text.substring(start, end)); // выводит часть текста заданного интревала
        }
    }
}
