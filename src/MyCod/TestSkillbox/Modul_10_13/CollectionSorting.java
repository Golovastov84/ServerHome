package MyCod.TestSkillbox.Modul_10_13;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Geeks for Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        //Collections.sort(al); // прямая сортировка
        Collections.sort(al, Collections.reverseOrder()); // обратная сортировка
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al);
    }
}
