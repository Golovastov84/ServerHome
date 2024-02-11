package MyCod.Experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Regular_expressions {
    public static void main(String[] args) throws FileNotFoundException {
         File FILE_data = new File("D:\\java\\Иннотех\\Само_обучение\\data_experiment.txt");
         Scanner sc = new Scanner(FILE_data);

        try {
            PrintWriter writer = new PrintWriter("D:\\java\\Иннотех\\Само_обучение\\Для_регулярных_выражений.scv");
            writer.write("\"id\";\"name\";\"text\";\n");
            int i = 0;
            String st;
            while (sc.hasNext()){
                i++;
                writer.write(i + ";");
                st = sc.nextLine();
                System.out.println(st);
                System.out.println(st.indexOf("\s"));
//                writer.write( "\"" + (st.length() > 0 ? st.substring(1,st.indexOf("\\s")):"?") + ";");
//                writer.write("\"" + st + "\";\n");
            }
//                for(int i =0; i < 10; i++) {
//
//                    writer.write(i + "\n");
//                }
                writer.flush(); // сбрасывает буфер в файл
                writer.close(); // закрывает файл
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
    }
}
