package MyCod.StudySkillbox.Modul_5;

public class GearBox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6 -
     */
    public int maxGear = 6;
    public int minGear = -1;
    public int gear = 0;

    public void shiftUp() {
        gear = gear < maxGear ? gear + 1 : gear;
    }
    public void shiftDown() {
        gear = gear > minGear ? gear - 1 : gear;
    }
}
