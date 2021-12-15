package MyCod;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
     Goblin goblin1 = new Goblin(4, 2.3);
     Goblin goblin2 = new Goblin("Vasya");
     goblin2.test1();
     Goblin1 goblin3 = new Goblin1("ВАЗ");
     System.out.println(goblin3.name1);
        goblin3.myFinalMethod1(24);
        Date date = new Date();
   // Car car1 = new Car("Blue", date);
    //car1.setColor("Yellow");
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Сегодняшняя дата:", date);
        System.out.println();
        System.out.println(6 % 1);
            }
}
