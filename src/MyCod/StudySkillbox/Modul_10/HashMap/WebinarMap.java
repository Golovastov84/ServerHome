package MyCod.StudySkillbox.Modul_10.HashMap;

import java.util.*;

public class WebinarMap {
    public static void main(String[] args) {
        Map<Client, String> map = new TreeMap<>(new ClientNameComparator()); // становиться важнее Comparable
        map.put(new Client(3, "Alex"), "Cat");
        map.put(new Client(1, "Sandra"), "Dog");
        map.put(new Client(4, "Anna"), "Cat");
        map.put(new Client(2, "CatLover"), "Cat");
        map.keySet().forEach(c -> System.out.println(c.getName()));
        TreeMap<Integer, Set<String>> mapSet = new TreeMap<>();
        //Set<String> s = Set.of("1", "2", "3");
        //mapSet.put(1, s);
        mapSet.put(1, new TreeSet<>());
        mapSet.get(1).add("1");
        mapSet.put(2, new TreeSet<>());
        mapSet.get(2).add("2");
        System.out.println(mapSet.get(1).size());


    }
}

class ClientNameComparator implements Comparator<Client>{ // для установки правил сортировки
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getName().compareTo(o2.getName());
    }
}



class Client /*implements Comparable<Client>*/{
    private final int id;
    private final String name;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    /*public int compareTo(Client o){ // в данный момент не действует
        return Integer.compare(id, o.id);
    }*/
}
