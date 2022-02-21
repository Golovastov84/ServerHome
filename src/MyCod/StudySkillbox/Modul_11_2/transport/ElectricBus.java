package MyCod.StudySkillbox.Modul_11_2.transport;

public class ElectricBus extends Bus {
    private final double minimalTankFuullnessRate;
    private static final double degradationRate = 0.0001;
    private static final double minRateToDegrade = 0.1;
    private static int count;

    public ElectricBus(double consumptionRate, double minimalTankFuullnessRate) {
        super(consumptionRate);
        this.minimalTankFuullnessRate = minimalTankFuullnessRate;
        count++;
    }

    @Override
    public void refuel(double tankRate) {
        super.refuel(tankRate);
        if (tankRate > minimalTankFuullnessRate) {
    consumptionRate += degradationRate;
        }
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTankFuullnessRate;
        if (remainingRate <= 0) {
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }


    public static int getCount() {
        return count;
    }

}
