package MyCod.StudySkillbox.Modul_26;

public class Connection {
    private static volatile Connection instanse;
    private Connection(){}
    public static Connection getInstance(){
        if(instanse == null){
            synchronized (Connection.class){
                if(instanse == null){
                    instanse = new Connection();
                }
            }
        }
        return instanse;
    }
}
