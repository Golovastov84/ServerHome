package MyCod;

class Goblin3 {
    int x3;
    {
        x3 = 100;
    }
    int x5 = x3 + 2;
    {
        x3 = -100;
    }
    int x4 = x3 + 1;
    Goblin3 () {
        x3 = 200;
    }

    public static void main(String[] args) {
        Goblin3 g3 = new Goblin3();
        System.out.println("x3 = " + g3.x3);
        System.out.println("x4 = " + g3.x4);
        System.out.println("x5 = " + g3.x5);
    }
}
