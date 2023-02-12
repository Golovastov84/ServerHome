package MyCod.StudySkillbox.Modul_24_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("some string");
        list.add(1, "some another string");
        list.remove(1);
        list.get(0);
        for(int i = 0; i < list.size(); i++){
            String string = list.get(i);
            System.out.println(string);
        }
    }
}
