package MyCod.StudySkillbox.Modul_17_5;

public class Main_17_5 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            new Thread(() ->{
                for(int j = 0; j < 100; j++){
                    ValueStorage.incrementValue();
                }
                System.out.println(ValueStorage.getValue());
            }).start();
        }
    }
}
