package MyCod.StudySkillbox.Modul_15_5;

import java.io.File;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String folderPath = "B:\\Головастов\\мои фото";
        File file = new File(folderPath);

        System.out.println(file.length());

//        System.out.println(System.getProperties().get("user.dir"));
//        Set keys = System.getProperties().keySet();
//        for(Object key : keys) {
//            System.out.println(key);
//        }
    }

    public static long getFolderSize(File folder) {
        if(folder.isFile()) {
            return folder.length();
        }
        File[] files = folder.listFiles();
        for(File file : files) {

        }
    }
}
