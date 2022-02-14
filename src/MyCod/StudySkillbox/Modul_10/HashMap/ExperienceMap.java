package MyCod.StudySkillbox.Modul_10.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExperienceMap {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>
                (15, 0.75f, true){
            {
                put(1, "obj1");
                put(15, "obj15");
                put(4, "obj4");
                put(38, "obj38");
            }
        };
        for (Integer ct : linkedHashMap.keySet()){
            System.out.println(ct + " " /*+ linkedHashMap.get(ct)*/);
        }
        linkedHashMap.get(15);
        System.out.println(linkedHashMap.values());

    }
}
