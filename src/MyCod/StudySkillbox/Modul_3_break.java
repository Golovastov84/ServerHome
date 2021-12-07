package MyCod.StudySkillbox;


public class Modul_3_break {
    public static void main(String[] args) {
        int soughtYear = 1785;
        int firstYear = 1922;
        int lastYear = 2022;
        boolean yearExists = false;
        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year == soughtYear) {
                yearExists = true;
                break;
            }
        }
        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExists ? found : notFound);
    }
}
