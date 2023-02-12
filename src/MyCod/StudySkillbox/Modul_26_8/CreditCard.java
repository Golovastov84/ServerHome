package MyCod.StudySkillbox.Modul_26_8;

public class CreditCard implements PaymentMethod{
    String numberCard;
    String ownerName;
    String cVV;
//    new CreditCard("347862862376", "Dmitry Petrov", "345"


    public CreditCard(String numberCard, String ownerName, String cVV) {
        this.numberCard = numberCard;
        this.ownerName = ownerName;
        this.cVV = cVV;
    }

    @Override
    public boolean pay(int amount){
        if(BankConnection.transferMoney(this, amount)){
            System.out.println("Payed with credit card");
            return true;
        }
        System.out.println("Some error occured :(");
        return true;
    }
}
