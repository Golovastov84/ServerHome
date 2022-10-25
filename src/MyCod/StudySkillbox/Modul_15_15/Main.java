package MyCod.StudySkillbox.Modul_15_15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
       
        // запись конфигурационного файла
        /*Properties properties = new Properties();
        properties.setProperty("timeout", "3600");
        properties.setProperty("cacheSize", "10000");

        try {
            properties.store(new FileOutputStream("src\\MyCod\\StudySkillbox\\Modul_15_15\\data\\config" +
                    ".properties"), "comment_Modul_15_15");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        // чтение конфигурационного файла
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\MyCod\\StudySkillbox\\Modul_15_15\\data\\config" +
                    ".properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("cacheSize"));

        /*
         * JDK 11 New Method in Collection interface
         * default <T> T[] toArray(IntFunction<T[]> generator) {
         * return toArray(generator.apply(0)); }
         */

        /*List<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("Android");

        String[] strArray = strList.toArray(size -> new String[size]);
        System.out.println(Arrays.toString(strArray));

        strArray = strList.toArray(size -> new String[size + 5]);
        System.out.println(Arrays.toString(strArray));

        strArray = strList.toArray(size -> new String[size * 3]);
        System.out.println(Arrays.toString(strArray));*/

        Path path = Path.of("C:\\Users\\User\\IdeaProjects\\ServerHome\\data\\file_2.txt");
        try {
            System.out.println(java.nio.file.Files.readAllLines(path));
            List<String> array = java.nio.file.Files.readAllLines(path);
            System.out.println(array);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
