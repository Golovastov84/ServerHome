package MyCod;

public class Employee {
    protected String firstName = "Heat";
    protected String lastName = null;
    protected int birthYear = 0;

    public Employee(String firstName, String last, int year) {
        //firstName = this.firstName;
        this.firstName = firstName;
        this.lastName = last;
        this.birthYear = year;
    }
    public Employee(String firstName, String last) {
        this ("Sasha", "Ohotnikova", 23);
        this.firstName = firstName;
        this.lastName = last;
    }
}
