package MyCod.StudySkillbox.Modul_9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        /*String empty = "";
        System.out.println(empty.isEmpty());
        String blank = " \t \n 3";
        System.out.println(blank.isBlank());*/
        /*String name = "Дмитрий";
        String surname = "Петров";
        LocalDate birthday = LocalDate.of(1986, 4, 15);
        String personInfo = name + ' ' + surname + " - " + birthday;
        System.out.println(personInfo);*/
        /*Product soap = new Product("мыло", 100);
        String productInfo = "Информация о продукте: " + soap.toString();
        // Медленный метод*/
        Product mask = new Product("маска", 50);
        String goods = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            goods += mask + "\n";
        }
        System.out.println((System.currentTimeMillis() - start) + " milisec");
        System.out.println(goods.length() + " символов");

        Product mask1 = new Product("маска", 50);
        String goods1 = "";
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            goods1 = goods1.concat(mask1.toString());
            //System.out.println(goods1);
        }
        System.out.println((System.currentTimeMillis() - start1) + " milisec");
        System.out.println(goods1.length() + " символов");

        Product mask2 = new Product("маска", 50);
        long time1 = System.currentTimeMillis();
        StringBuilder goods2 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            goods2 = goods2.append(mask2).append("\n");
        }
         //System.out.println(goods2);
        System.out.println(System.currentTimeMillis() - time1);
        System.out.println(goods2.length() + " символов");
        /*for (int i = 64; i < 135; i++) {
            // вывод символов по коду
            char regexChar = (char) i;
            String regex = Character.toString(regexChar);
            System.out.println(i + " - " + regex);
//            if(regex.equals("я")) {
//                System.out.println(i + " - " + regex);
//            }
        }*/
        // Чтение из файла
        String text = "data/file.txt";
        List<String> lines = Files.readAllLines(Paths.get(text));
        System.out.println(lines.get(0));
        lines.forEach(c -> System.out.println(c));
        lines.add("By");
    }
}
