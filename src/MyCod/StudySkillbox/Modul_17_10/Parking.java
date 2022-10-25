package MyCod.StudySkillbox.Modul_17_10;

public class Parking {
    private int parkingSize = 500;
    private int carCount = 0;

    public synchronized void in(){
        if (carCount == parkingSize){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        notifyAll();
        carCount++;
        System.out.println("Автомобиль завезён");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Свободных мест: " + (parkingSize - carCount));
        notify();
    }

    public synchronized void out(){
        if(carCount == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carCount--;
        System.out.println("Автомобиль вывезён");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Свободных мест: " + (parkingSize - carCount));
        notify();
    }


}
