package MyCod;

class Goblin {
    private int money = 2;
    double health = 3.8;
    protected int diamonds = 10;
    public String name = "Sasha";
    public Goblin() {};
    public Goblin(int intialMoney, double intialHealth) {
        money = intialMoney;
        health = intialHealth;
        System.out.println("jerhejj");
        System.out.println(money);
    }
    public Goblin (String goblinName) {
        name = goblinName;
        System.out.println(name);
    }
    private Goblin (int intialDiamonds) {
        diamonds = intialDiamonds;
    }
    public void test1() {
        System.out.println(money);
    }
}
