package MyCod.StudySkillbox.Modul_10.TreeSet;


import javax.crypto.spec.PSource;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Aa");
        treeSet.add("Ab");
        treeSet.add("Iz");
        treeSet.add("Bb");
        treeSet.add("Iu");
        treeSet.add("Ba");

        System.out.println(treeSet.subSet("Aa", "Bb"));
    }
}
