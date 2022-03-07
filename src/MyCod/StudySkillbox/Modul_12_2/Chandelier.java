package MyCod.StudySkillbox.Modul_12_2;

public class Chandelier extends LightingDevice {


    private static final int LAMP_BRIGHTNESS_STEPS = 2;
    private static final double CONSUMPTION_COEFF = 1.095;

    private final int lampsCount;

    public Chandelier(int power, int lampCount) {
        super(power);
        this.lampsCount = lampCount;
    }

    @Override
    public void setBrightness(double level) {

        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int) Math.round(level / step);
        brightness = stepsCount * step;
        super.setBrightness(stepsCount * step);
    }


    @Override
    public double getEnergyConsumption() {

        return power * Math.pow(brightness, CONSUMPTION_COEFF);
    }
}


