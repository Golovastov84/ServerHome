package MyCod.StudySkillbox.Modul_12_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(100);
        lamp.setType(Lamp.Type.FILAMENT);

        ArrayList<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(100));
        lamps.add(new Lamp(20));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));

        Collections.sort(lamps);

        for (Lamp lam : lamps) {
            System.out.println(lam);
        }
    }
}
