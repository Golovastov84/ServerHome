package MyCod.StudySkillbox.Modul_15_5;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "B:\\Головастов\\мои фото";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));

    }

    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }
}
