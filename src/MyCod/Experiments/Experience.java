package MyCod.Experiments;

import java.util.ArrayList;

public class Experience {
    public static void main(String[] args) {
        ArrayList<Integer> cardsFromAInt = new ArrayList<>();
        cardsFromAInt.add(1);
        cardsFromAInt.add(3);
        cardsFromAInt.add(1);
        cardsFromAInt.add(3);
        System.out.println(cardsFromAInt);
        int r = cardsFromAInt.indexOf(3);
        System.out.println(r);
        cardsFromAInt.remove(3);
        System.out.println(cardsFromAInt);
    }
}
