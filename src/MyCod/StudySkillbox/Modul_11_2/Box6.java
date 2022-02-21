package MyCod.StudySkillbox.Modul_11_2;

public class Box6 {
    double width;
    double height;
    double depth;

    public Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box6() {
    }

    double getVolume(){
        return width * height * depth;
    }
}
