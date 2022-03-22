import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;


@Data
@ToString(exclude = "workStart")
@AllArgsConstructor
public class Employee {
    private String name;
    private Integer salary;
    private Date workStart;

//    public Employee(String name, Integer salary, Date workStart) {
//        this.name = name;
//        this.salary = salary;
//        this.workStart = workStart;
//    }
//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    /*public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }*/

//    @Override
//    public String toString() {
//        return name + " - " + salary +
//                " - " + (new SimpleDateFormat("dd.MM.yyyy")).format(workStart);
//    }

   /* @Override
    public String toString() {
        return "{ \n \"name\": \"" + name  + "\",\n\"salary\": " + salary +
                ",\n\"workStart\": \""
                + (new SimpleDateFormat("dd.MM.yyyy")).format(workStart)
                + "\"\n},";
    }*/
}
