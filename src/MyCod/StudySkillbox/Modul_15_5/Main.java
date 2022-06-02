package MyCod.StudySkillbox.Modul_15_5;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ForkJoinPool;

public class Main {


    public static void main(String[] args) {
        /*for(String arg : args) {
            System.out.println(arg + "\n");
        }*/
//        String[] argums = {"-d", "B:\\Головастов\\мои фото", "-l", "50Kb"};
//        ParametersBag bag = new ParametersBag(argums);

        ParametersBag bag = new ParametersBag(args); // забирает аргуметы из настройки старта
        // Configuration
        String folderPath = bag.getPath(); // забирает из командной строки адрес директории
        long sizeLimit = bag.getLimit(); // забирает из командной строки минимальный размер
        // выводимого файла или директории

       /* for(int i = 0; i < args.length; i++) {
            System.out.println(i + " => " + args[i]);
        }
        System.exit(0); // остановка программы

        String folderPath = "B:\\java";
        long sizeLimit = 5 * 1024 * 1024;*/

        File file = new File(folderPath);
        Node root = new Node(file, sizeLimit);

        long start = System.currentTimeMillis();

        FolderSizeCalculator calculator = new FolderSizeCalculator(root);
        ForkJoinPool pool = new ForkJoinPool();
        long size =  pool.invoke(calculator); // запуск множества разветвляющихся потоков
        System.out.println(root);
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration + " ms");


    }


}
