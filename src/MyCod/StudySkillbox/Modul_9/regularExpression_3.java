package MyCod.StudySkillbox.Modul_9;

public class regularExpression_3 {
    public static void main(String[] args) {
        String text = "Там на  неведомых    дорожках   следы неведомых зверей";
        String[] words = text.split("\\s+"); // создаётся массив из отдельных слов разделённых регулярным
        // выражением \s+
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}

