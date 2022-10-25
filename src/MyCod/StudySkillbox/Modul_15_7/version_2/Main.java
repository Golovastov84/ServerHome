package MyCod.StudySkillbox.Modul_15_7.version_2;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class Main {


    public static void main(String[] args) {


        ParametersBag bag = new ParametersBag(args); // забирает аргуметы из настройки старта
        // Configuration
        String folderPath = bag.getPath(); // забирает из командной строки адрес директории
//        long sizeLimit = bag.getLimit(); // забирает из командной строки минимальный размер
        // выводимого файла или директории


        File file = new File(folderPath);
        Node root = new Node(file);
        FolderSizeCalculator folderSizeCalculator = new FolderSizeCalculator(root);
//        System.out.println(folderSizeCalculator.compute());
        folderSizeCalculator.compute();

//
//        File folder = root.getFolder();
//        File[] files = root.getFolder().listFiles();
//        for (File fil : files) {
//            Node child = new Node(fil);
//            root.addChild(child);
//        }
//        System.out.println(root);

//        long start = System.currentTimeMillis();
//
//        FolderSizeCalculator calculator = new FolderSizeCalculator(root);
//        ForkJoinPool pool = new ForkJoinPool();
//        long size =  pool.invoke(calculator); // запуск множества разветвляющихся потоков
//        System.out.println(root);
//        long duration = System.currentTimeMillis() - start;
//        System.out.println(duration + " ms");


    }


}
