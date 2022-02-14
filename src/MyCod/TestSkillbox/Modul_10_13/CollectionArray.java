package MyCod.TestSkillbox.Modul_10_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArray {
    public static void main(String[] args) {
        String domains[] = {"Practice", "Geeks", "Code", "Quiz"};
        List colList = new ArrayList(Arrays.asList(domains));
        Collections.sort(colList);
        System.out.println("List after the use of" +
                 " Collection.sort() :\n" + colList);
    }
}
