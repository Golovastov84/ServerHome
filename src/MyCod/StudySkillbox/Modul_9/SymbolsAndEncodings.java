package MyCod.StudySkillbox.Modul_9;

import MyCod.StudySkillbox.Modul_7.Calculator;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SymbolsAndEncodings {
    public static void main(String[] args) {
        /*String line = "764587687634";
        char symbol = line.charAt(0);
        System.out.println(Character.isDigit(symbol));*/


        /*String text = "Ведь знаешь Дядя ведь не даром Москва спалённая пожаром";
        int spaceCount = 0;
        for(int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if(symbol == 'я') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);*/
        /*String name = " \t\n Адриана \t \r\n    ";
        System.out.println(name);
        System.out.println(name.trim());*/

        /*String charset = Charset.defaultCharset().displayName();
        System.out.println(charset);*/

        /*String text = "Russia Ведь знаешь Дядя ведь не даром Москва спалённая пожаром";
        String encodedText = new String(text.getBytes(), StandardCharsets.US_ASCII);
        System.out.println(encodedText);*/

        String text = "Russia Ведь знаешь Дядя ведь не даром Москва спалённая пожаром";
        String encodedText = null;
        try {
            encodedText = new String(text.getBytes(), "Windows-1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(encodedText);


    }
}
