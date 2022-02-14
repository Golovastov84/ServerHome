package MyCod.TestSkillbox.Modul_10_13;

import com.sun.source.util.SourcePositions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>{ // программа для сортировки по номеру
    public int compare(Student a, Student b){
        return  a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student>{ // программа для сортировки по имени
    public int compare(Student a, Student b){
        return  a.name.compareTo(b.name);
    }
}

public class CollectionsAndComparator {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111,"bbbb", "london"));
        ar.add(new Student(131,"aaaa", "nyc"));
        ar.add(new Student(121,"cccc", "jaipur"));

        System.out.println("Unsorted");
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar, new Sortbyroll()); // сортировка по номеру
        System.out.println("\nSorted by rolno");
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar, new Sortbyname()); // сортировка по имени
        System.out.println("\nSorted by rolno");
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }
    }

}
