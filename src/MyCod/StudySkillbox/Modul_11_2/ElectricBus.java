package MyCod.StudySkillbox.Modul_11_2;

public class ElectricBus extends Bus{
    private final double minimalTankFuullnessRate;

    public ElectricBus(double consumptionRate, double minimalTankFuullnessRate) {
        super(consumptionRate);
        this.minimalTankFuullnessRate = minimalTankFuullnessRate;
        }

    public boolean run(int distance) {
        if (((getTankFullnessRate() - (distance * getConsumptionRate())) < minimalTankFuullnessRate)) {
            return false;
        }
        setTankFullnessRate( getTankFullnessRate(), distance) ;
        return true;
    }
}
