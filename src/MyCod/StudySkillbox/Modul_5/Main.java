package MyCod.StudySkillbox.Modul_5;

public class Main {
    public static void main(String[] args) {
       // GearBox type = GearBoxType.valueOf("ROBOT");
        GearBox gearBox = new GearBox(GearBoxType.MANUAL);

        System.out.println(gearBox.getType());
        // GearBox gearBox1 = new GearBox(75); ошибка
    }
}
