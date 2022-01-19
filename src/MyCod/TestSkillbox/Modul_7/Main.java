package MyCod.TestSkillbox.Modul_7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("ААА", 1988);
        Person personCopy = person;
        person.birthYear =  1989;
        System.out.println(personCopy.birthYear);
        Integer q = 34;
        Integer q1 = q;
        q = q - 2;
        System.out.println(q1);
        char w = 65535;

    }
}
