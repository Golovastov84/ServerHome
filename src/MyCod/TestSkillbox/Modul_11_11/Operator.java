package MyCod.TestSkillbox.Modul_11_11;

class Operator implements Employee {

    String position = Operator.class.getName();
    String name = Company.nameGeneration();
    int salary;

    public Operator() {
        this.salary = getSalary();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return 40_000;
    }

    public void setSalary(int companyIncome) {
    }
}
