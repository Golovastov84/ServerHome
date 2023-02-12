package MyCod.StudySkillbox.Modul_26.Decorator;

public class WashingMachine {
    public static void main(String[] args) {
        BasicWashingProgram program = new BasicWashingProgram();
        DoubleSpinningProgram spinningProgram = new DoubleSpinningProgram(program);
        BoilingWashingProgram boilingProgram = new BoilingWashingProgram(spinningProgram);
        boilingProgram.executeProgram();
    }
}
