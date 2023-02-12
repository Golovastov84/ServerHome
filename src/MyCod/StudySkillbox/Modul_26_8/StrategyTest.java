package MyCod.StudySkillbox.Modul_26_8;

public class StrategyTest {
    public static void main(String[] args) {
        // создаём корзину
        ShoppingCart cart = new ShoppingCart();
        // добавляем товар
        cart.addItem(new Item("Торт медовик", 456), 1);
        // разные методы оплаты
        // кредитной картой
        cart.pay(new CreditCard("347862862376", "Dmitry Petrov", "345"));
        // наличными
        cart.pay(new Cash());
    }
}
