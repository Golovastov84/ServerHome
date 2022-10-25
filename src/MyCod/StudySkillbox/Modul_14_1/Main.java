package MyCod.StudySkillbox.Modul_14_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(-2, 4));

    }

    public static int area(int width, int height){
        if(width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative size: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}
