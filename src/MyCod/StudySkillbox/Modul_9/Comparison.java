package MyCod.StudySkillbox.Modul_9;

public class Comparison {
    public static void main(String[] args) {
        String managerName = "Василий";
        String customerName = "Василий";
        System.out.println(managerName == customerName);
        String managerName1 = "Василий";
        String customerName1 = "Васи".concat("лий");
        System.out.println(managerName1 == customerName1);
        System.out.println(managerName1.equals(customerName1));
    }
}
