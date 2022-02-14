package MyCod.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("zqwert");
        items.add("qwerty");
        items.add("wqwer");


        //Collections.sort(items); // сортирует коллекцию
        int rezultSearch = Collections.binarySearch(items, "qwerty");
        System.out.println(rezultSearch);
    }
}
