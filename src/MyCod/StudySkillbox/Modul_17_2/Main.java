package MyCod.StudySkillbox.Modul_17_2;

import java.io.File;

public class Main {
    private static int newWidth = 300;

    public static void main(String[] args) {
        String srcFolder = "C:\\Users\\User\\IdeaProjects\\java_basics\\FilesAndNetwork\\homework_4\\images";
        String dstFolder = "C:\\Users\\User\\IdeaProjects\\java_basics\\FilesAndNetwork\\homework_4\\dst";
        File srcDir = new File(srcFolder);
        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();
        int middle = files.length / 2;

        File[] files1 = new File[middle];

        File[] files2 = new File[files.length - middle];
        System.arraycopy(files, 0, files1, 0, files1.length);
        ImageResizer resizer1 = new ImageResizer(files1, newWidth, dstFolder, start);
        new Thread(resizer1).start();
//        resizer1.start(); это при наследовании от Thread

        System.arraycopy(files, middle, files2, 0, files2.length);
        ImageResizer resizer2 = new ImageResizer(files2, newWidth, dstFolder, start);
        new Thread(resizer2).start();
//        resizer2.start(); это при наследовании от Thread

new Thread(() -> {
    for(int i = 0; i < 100_000; i++) {
        System.out.println(i);
    }
}).start();

    }
}
