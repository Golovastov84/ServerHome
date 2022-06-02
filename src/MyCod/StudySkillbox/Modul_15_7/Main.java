package MyCod.StudySkillbox.Modul_15_7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceDirectory;
        String destinationDirectory;
        boolean sourceCheck;
        boolean destinationCheck;

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            do {
                System.out.println("Введите путь до копируемой директории:");
                sourceDirectory = scanner.nextLine();
                sourceCheck = Files.isDirectory(Path.of(sourceDirectory)) ||
                        Files.isRegularFile(Path.of(sourceDirectory));
                if (!sourceCheck) {
                    System.out.println("Данная директория отсутствует");
                }
            } while (!sourceCheck);

            do {
                System.out.println("Введите путь до создаваемой директории:");
                destinationDirectory = scanner.nextLine();
                destinationCheck = Files.isDirectory(Path.of(destinationDirectory)) ||
                        Files.isRegularFile(Path.of(destinationDirectory));
                if (destinationCheck) {
                    System.out.println("Данная директория уже создана");
                }
            } while (destinationCheck);

            FileUtils.copyFolder(sourceDirectory, destinationDirectory);
            System.out.println("Директория скопирована");

       /* File fileSource = new File(sourceDirectory);
        Node root = new Node(fileSource);
        FolderSizeCalculator calculator = new FolderSizeCalculator(root);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(calculator); // запуск множества разветвляющихся потоков
            System.out.println(root);

        int i = 1;
        for (Node file : root.getChildren()) {
                System.out.println(file);
            if (!file.getFolder().isDirectory() || !file.getFolder().isFile()) {
                FileUtils.copyFolder(file.getFolder().getPath(), "B:\\java\\Skillbox\\Modul_15_7\\" + i);
                i++;
            }
        }*/

    }
    }
}
