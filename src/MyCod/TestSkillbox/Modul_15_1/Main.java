package MyCod.TestSkillbox.Modul_15_1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        File file = new File("C:\\Users\\User\\IdeaProjects\\ServerHome\\data\\file_2.txt");
        // разные способы обращения к файлу
       /* File file = new File("data/file_2.txt");
        System.out.println(file.length()); // размер файла
        System.out.println(file.lastModified()); // дата последней модификации
        File folder_2 = new File("C:\\Users\\User\\IdeaProjects\\ServerHome\\data");
        System.out.println(folder_2.isDirectory()); // Выводит, есть ли данная папка
        File[] files = folder_2.listFiles(); // создаёт массив с путями файлов в данной папке
        for (File fi : files) {
            System.out.println(fi.getAbsolutePath()); // выводим массив путей файлов
        }
        // далее 2 строки создание папки folder
        File folder_3 = new File("C:\\Users\\User\\IdeaProjects\\ServerHome\\data\\folder");
        folder_3.mkdir();
        // удаление папки folder
        folder_3.delete();*/

        // чтение из файла FileInputStream
        // 1-ый метод
        /*StringBuilder builder = new StringBuilder();
        try {
            FileInputStream is = new FileInputStream("data/file_2.txt");
            for (; ; ) {
                int code = is.read();
                if(code < 0) {
                    break;
                }
                char ch = (char) code;
                builder.append(ch);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder);*/
// 2-ый метод
//        StringBuilder builder = new StringBuilder();
//        try {
//           BufferedReader br = new BufferedReader(new FileReader("data/file_2.txt"));
//           for(;;)
//           {
//              String line = br.readLine();
//              if(line == null) {
//                  break;
//              }
//              builder.append(line + "\n");
//           }
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(builder);

// 3-ый метод через Files
        StringBuilder builder = new StringBuilder();
        try {
           List<String> lines =  Files.readAllLines(Paths.get("data/file_2.txt"));
            lines.forEach(line -> builder.append(line + "\n"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder);

    }
}
