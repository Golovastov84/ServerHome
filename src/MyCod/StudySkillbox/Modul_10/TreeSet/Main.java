package MyCod.StudySkillbox.Modul_10.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
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

        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(treeSet.headSet("Ab"));
        System.out.println(treeSet.tailSet("Bb"));
        System.out.println(treeSet.toString());
        System.out.println(treeSet);

    }
}
