package MyCod.StudySkillbox.Modul_15_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < 1000; i += 2) {
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("data/file.txt"), strings);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /*try {
        PrintWriter writer = new PrintWriter("data/file.txt");
        for(int i =0; i < 1000; i++) {
            writer.write(i + "\n");
        }
        writer.flush(); // сбрасывает буфер в файл
        writer.close(); // закрывает файл
    } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }*/
    }
}
