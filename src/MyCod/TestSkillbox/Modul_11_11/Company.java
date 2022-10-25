package MyCod.TestSkillbox.Modul_11_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Company {
    List<Employee> employee;
    final int companyIncome;

    protected Company() {
        this.employee = new ArrayList<>();
        companyIncome = (int) ((Math.random() * (11_000_000 - 9_000_000)) + 9_000_000);
    }

    protected int getIncome() {
        return companyIncome;
    }

    protected void hire(String worker) {
        // Найм одного сотрудника
        switch (worker) {
            case "Manager":
                employee.add(new Manager());
                break;
            case "TopManager":
                TopManager topManager = new TopManager();
                employee.add(topManager);
                topManager.setSalary(companyIncome);
                break;
            case "Operator":
                employee.add(new Operator());
                break;
            default:
                System.out.println("Нет такой должности");
        }
    }

    protected void hiringSimilarSpecialists(String worker, int number) throws Exception {
        // Найм сотрудников на однотипную должность
        if (number < 0) {
            throw new Exception("Введено отрицательное значение");
        }

        for (int i = 0; i < number; i++) {
            hire(worker);
        }
    }

    protected void hireAll(List<Employee> workers) {
        // Найм списка сотрудников
        employee.addAll(workers);
    }

    protected void fire(String name) {
        // Увольнение сотрудника
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getName().equals(name)) {
                employee.remove(i);
                i = i == 0 ? -1 : --i;
            }
        }
    }

    protected void companyDownsizing(int percent) {
        // увольнение части персонала в процентах
        int numberDismissed = employee.size() * percent / 100;
        for (int j = 0; j < numberDismissed; j++) {
            int number = (int) (Math.random() * employee.size());
            fire(employee.get(number).getName());
        }
    }

    String nameCompany(int count) {
        return "Список из " + count + " зарплат по ";
    }

    protected List<Employee> getLowestSalaryStaff(int count) throws Exception {
        // список сотрудников по возрастанию зар платы
        System.out.println(nameCompany(count) + "возрастанию:");
        Collections.sort(employee, new SortEmployee());
        return getEmployeesSort(count);
    }

    protected List<Employee> getTopSalaryStaff(int count) throws Exception {
        // список сотрудников по убыванию зар платы
        System.out.println(nameCompany(count) + "убыванию:");
        Collections.sort(employee, new SortEmployee().reversed());
        return getEmployeesSort(count);
    }

    private List<Employee> getEmployeesSort(int count) throws Exception {
        if (count > employee.size()) {
            throw new Exception("Введённое значение больше количества сотрудников.");
        }
        if (count < 0) {
            throw new Exception("Введено отрицательное значение");
        }

        List<Employee> employeesSort = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employeesSort.add(employee.get(i));
        }
        return employeesSort;
    }

    protected void iteratorStaff(List<Employee> employeesSort) {
        Iterator<Employee> iteratorLowers = employeesSort.iterator();
        // вывод count количества сотрудников с зарплатой по возрастанию
        while (iteratorLowers.hasNext()) {
            System.out.println(Character.toString(176) + " " + iteratorLowers.next().getSalary() +
                    " руб.");
        }
        System.out.println("__________");
    }

    protected static String nameGeneration() {
        int length = (int) ((Math.random() * (10 - 3)) + 3);
        int firstCharacter = (int) ((Math.random() * (91 - 65)) + 65);
        String name = Character.toString(firstCharacter);
        for (int i = 0; i < length; i++) {
            name = name.concat(Character.toString((int) ((Math.random() * (123 - 97)) + 97)));
        }
        return name;
    }
}



