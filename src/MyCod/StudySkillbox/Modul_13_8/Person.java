package MyCod.StudySkillbox.Modul_13_8;

public class Person {

    private final String phone;

    public Person(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
