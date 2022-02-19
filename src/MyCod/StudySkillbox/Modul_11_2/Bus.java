package MyCod.StudySkillbox.Modul_11_2;

public class Bus {
    private double tankFullnessRate; // 0-1
    private final double consumptionRate; // 0-1

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public void setTankFullnessRate(double tankFullnessRate, int distance) {
        this.tankFullnessRate  = tankFullnessRate - distance * consumptionRate;
    }

    public boolean run(int distance) {
        if (powerReserve() < distance) {
            return false;
        }
        tankFullnessRate -= distance * consumptionRate;
        return true;
    }

    public final void refuel(double tankRate) {
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }

    public int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate);
    }


}
