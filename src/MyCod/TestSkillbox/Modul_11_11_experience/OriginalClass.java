package MyCod.TestSkillbox.Modul_11_11_experience;

public class OriginalClass {
    int count;

    public OriginalClass(int count) {
        this.count = count;
    }

    FirstClass firstClass = new FirstClass(12);

    public int getCount() {
        return firstClass.getWeigth();
    }

    public FirstClass getFirstClass() {
        return firstClass;
    }

    int calkulate() {
        return 0;
    }
}
