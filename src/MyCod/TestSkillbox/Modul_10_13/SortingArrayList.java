package MyCod.TestSkillbox.Modul_10_13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args){
        //ArrayList<String> listOfCountries = new ArrayList<>();
        List listOfCountries = new ArrayList<>();
        listOfCountries.add("India");
        listOfCountries.add("US");
        listOfCountries.add("China");
        listOfCountries.add("Denmark");

        /*System.out.println("До:");
        for(String counter : listOfCountries){
            System.out.println(counter);
        }*/

//        Collections.sort(listOfCountries, Collections.reverseOrder());
//
//        System.out.println("После:");
//        for(String counter : listOfCountries){
//            System.out.println(counter);
//        }
        Collections.sort(listOfCountries);
        System.out.println("Бинарный поиск Indiar " + Collections.binarySearch(listOfCountries, "Indiar"));
//        Collections.reverse(listOfCountries);
//        System.out.println(listOfCountries);
//        Collections.shuffle(listOfCountries);
//        System.out.println(listOfCountries);
//        Collections.fill(listOfCountries, "Russia");
        System.out.println(listOfCountries);
        System.out.println("Максимальный элемент " + Collections.max(listOfCountries));
        System.out.println("Минимальный элемент " + Collections.min(listOfCountries));
        ArrayList<String> listDouble = new ArrayList<>();
        listDouble.add("Japan");
        Collections.copy(listOfCountries, listDouble);
        System.out.println(listOfCountries);
//        Collections.copy(listDouble, listOfCountries);
//        System.out.println(listDouble);
        Collections.rotate(listOfCountries, 2);
        System.out.println(listOfCountries);
        Collection checkList = Collections.checkedCollection(listOfCountries, String.class);
        System.out.println(checkList);
        listOfCountries.add(10);
        listOfCountries.add("Japan");
        //checkList.add(10); // выдаст ошибку
        System.out.println(listOfCountries);
        System.out.println(checkList);
        System.out.println(Collections.frequency(listOfCountries, "Japan"));

    }
}
