package MyCod.TestSkillbox.Modul_11_11;

public class Main {
    public static void main(String[] args) throws Exception {

        Company company1 = new Company();
        System.out.println("company1");
        company1.hiringSimilarSpecialists("Operator", 180);
        company1.hiringSimilarSpecialists("Manager", 80);
        company1.hiringSimilarSpecialists("TopManager", 10);
        company1.iteratorStaff(company1.getTopSalaryStaff(15));
        company1.iteratorStaff(company1.getLowestSalaryStaff(30));
        company1.companyDownsizing(50);
        company1.iteratorStaff(company1.getTopSalaryStaff(15));
        company1.iteratorStaff(company1.getLowestSalaryStaff(30));

        Company company2 = new Company();
        System.out.println("company2");
        company2.hiringSimilarSpecialists("Manager", 4);
        company2.hiringSimilarSpecialists("Operator", 1);
        company2.hiringSimilarSpecialists("TopManager", 1);

        company2.iteratorStaff(company2.getTopSalaryStaff(6));
        company2.iteratorStaff(company2.getLowestSalaryStaff(6));
        System.out.println("company1 Income");
        System.out.println(company1.getIncome());
        System.out.println("company2 Income");
        System.out.println(company2.getIncome());
        System.out.println("company1");
        company1.iteratorStaff(company1.getTopSalaryStaff(5));
        company1.hiringSimilarSpecialists("TopManager", 2);
        System.out.println("company1");
        company1.iteratorStaff(company1.getTopSalaryStaff(15));


    }
}
