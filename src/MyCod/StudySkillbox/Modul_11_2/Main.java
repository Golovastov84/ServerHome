package MyCod.StudySkillbox.Modul_11_2;

import MyCod.StudySkillbox.Modul_11_2.transport.Bus;
import MyCod.StudySkillbox.Modul_11_2.transport.ElectricBus;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(0.001);
        Bus bus2 = new Bus(0.001);
        System.out.println(bus1.equals(bus2));
        Bus bus3 = bus2;
        System.out.println(bus2.equals(bus3));

        ElectricBus EBus1 = new ElectricBus(0.001, 0.1);
        ElectricBus EBus2 = new ElectricBus(0.001, 0.1);

        System.out.println("Количество автобусов = " + Bus.getCount());
        System.out.println("Количество электробусов = " + ElectricBus.getCount());

        bus1.refuel(1);
        System.out.println("Резерв: " + bus1.powerReserve());
        System.out.println("Едем 50 км: " + bus1.run(50));
        System.out.println("Резерв: " + bus1.powerReserve());
        System.out.println("Едем 900 км: " + bus1.run(900));
        System.out.println("Резерв: " + bus1.powerReserve());
        System.out.println("Едем 430 км: " + bus1.run(430));

        Class objectClass = bus3.getClass();
        System.out.println(objectClass.getName());
        System.out.println(bus1);
        System.out.println(Integer.toHexString(bus1.hashCode()));
        System.out.println(bus1.toString());

    }
}
