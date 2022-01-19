package MyCod.StudySkillbox.Modul_9;

public class Substrings {
    public static void main(String[] args) {
        String header1 = "Content-Type: text/html; charset=UTF-8;";
        String header2 = "Content-Type: text/html; charset=Windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";
        String header4 = "Content-Type: text/html; ";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";
        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));
    }
    public static String getEncoding(String header) {
        String charsetStr = "charset="; // после каких символов идет избранная подстрока
        int start = header.indexOf(charsetStr); // где начинается подстрока
        int end = header.indexOf(';', start); // где заканчивается подстрока
        if (start < 0 || end < 0) {
            return "";
        }
        String encoding = header.substring(start  + charsetStr.length(), end); // копирование избранной подстроки
        // символ с номером end в подстроку не войдет
        return encoding; // вывод избранной подстроки
    }
}
