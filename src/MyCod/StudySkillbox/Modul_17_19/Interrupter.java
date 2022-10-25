package MyCod.StudySkillbox.Modul_17_19;

public class Interrupter extends Thread{
    private Thread thread;

    public Interrupter(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
