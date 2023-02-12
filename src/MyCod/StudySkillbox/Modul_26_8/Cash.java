package MyCod.StudySkillbox.Modul_26_8;

public class Cash implements PaymentMethod {
    public Cash(){

    }

    @Override
    public boolean pay(int amount){
        System.out.println("Will be payed later by cash");
        return false;
    }
}
