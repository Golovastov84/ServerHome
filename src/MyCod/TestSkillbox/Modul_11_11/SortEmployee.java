package MyCod.TestSkillbox.Modul_11_11;

import java.util.Comparator;

class SortEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
