package MyCod.StudySkillbox.Modul_22_9.main.java;

public class Voter {

    private String name;
    private String birthDay;
    private int count;

    public Voter(String name, String birthDay, int count) {
        this.name = name;
        this.birthDay = birthDay;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        Voter voter = (Voter) obj;
        return name.equals(voter.name) && birthDay.equals(voter.birthDay);
    }

    @Override
    public int hashCode() {
        long code = name.hashCode() + birthDay.hashCode();
        while (code > Integer.MAX_VALUE) {
            code = code / 10;
        }
        return (int) code;
    }

    public String toString() {
        return name + " (" + birthDay + ") - " + count;
    }
}
