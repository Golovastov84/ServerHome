package MyCod.StudySkillbox.Modul_11_2;

public class Shipment extends HeavyBox{
    public double cost;

    public Shipment(int width, int height, int depth, int weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
        System.out.println("В конструкторе Shipment.");
    }

    public Shipment(double cost) {
        this.cost = cost;
    }
}
