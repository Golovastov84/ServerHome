package MyCod.StudySkillbox.Modul_11_2;

public class Main {
    public static void main(String[] args) {
        Bus bus = new ElectricBus(0.001, 0.5);
        bus.refuel(1);
        System.out.println("Резерв: " + bus.powerReserve());
        System.out.println("Едем 50 км: " + bus.run(50));
        System.out.println("Резерв: " + bus.powerReserve());
        System.out.println("Едем 460 км: " + bus.run(460));
        System.out.println("Резерв: " + bus.powerReserve());
        System.out.println("Едем 430 км: " + bus.run(430));

    }
}
