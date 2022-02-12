package MyCod.StudySkillbox.Modul_10.HashMap;

import java.util.*;

public class ExperienseMap {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new HashMap<Integer, String>
                (){
            {
                put(4, "Значение второго");
                put(1, "Значение первого");
                put(7, "Значение четвертого");
                put(3, "Значение третьего");
            }};
        //System.out.println(treeMap.get(4));
        System.out.println(treeMap.entrySet());
        /*for (Map.Entry e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        for(Integer c : treeMap.keySet()){
            System.out.println(c + " " + treeMap.values());
        }*/
        /*Iterator<Map.Entry<Integer, String>> itr2 = treeMap.entrySet().iterator();
        while (itr2.hasNext()) {
            Map.Entry<Integer, String> entry = itr2.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
    }
}

/*public class MyCustomKey implements Comparable {

    private int value;

    public MyCustomKey(int value) {
        this.value = value;
    }

    public int compareTo(MyCustomKey key) {

        int comparison = 0;
        return (comparison);
    }

    public int hashCode() {
        return (this.value * 199);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}*/
