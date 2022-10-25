package MyCod.TestSkillbox.Modul_11_11;

public class TopManager implements Employee {

    String name = Company.nameGeneration();
    String position = TopManager.class.getName();
    int salary;
    int fixedPartSalaryTopManager = 100_000;
    int limitCompanyIncome = 10_000_000;

    public TopManager() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int companyIncome) {
        this.salary = companyIncome > limitCompanyIncome ?
                (int) (fixedPartSalaryTopManager * 2.5) :
                fixedPartSalaryTopManager;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return position;
    }
}
