package MyCod.TestSkillbox.Modul_11_11;

public class Manager implements Employee {

    String name = Company.nameGeneration();
    String position = Manager.class.getName();
    int salary;

    public Manager() {
        this.salary = getMonthSalary();
    }

    public static int getMonthSalary() {
        int fixedPartSalaryManager = 60_000;
        return (int) (generationEarnedMoney() * 0.05) + fixedPartSalaryManager;
    }

    public static int generationEarnedMoney() {
        return (int) ((Math.random() * (140_000 - 115_000)) + 115_000);
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int companyIncome) {}
}
