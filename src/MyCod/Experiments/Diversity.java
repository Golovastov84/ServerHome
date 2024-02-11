package MyCod.Experiments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diversity {
    public static ArrayList<Integer> cardsFromAInt = new ArrayList<>();
    public static ArrayList<Integer> cardsFromBInt = new ArrayList<>();

    public static String varietyList = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        String[] primeInputData = sc.nextLine().split(" ");
        n = Integer.parseInt(primeInputData[0]);
        m = Integer.parseInt(primeInputData[1]);
        int q = Integer.parseInt(primeInputData[2]);

        ArrayList<String> cards = new ArrayList<>(List.of(sc.nextLine().split(" ")));
        for (String cardFromA : cards) {
            cardsFromAInt.add(Integer.parseInt(cardFromA));
        }
        cards.clear();
        cards.addAll(List.of(sc.nextLine().split(" ")));
        for (String cardFromB : cards) {
            cardsFromBInt.add(Integer.parseInt(cardFromB));
        }
        for (int i = 0; i < q; i++) {
            String[] changeCards = sc.nextLine().split(" ");
            if (changeCards[1].equals("A")) {
                if(changeCards[0].equals("1")){
                    cardsFromAInt.add(Integer.parseInt(changeCards[2]));
                } else{
                    cardsFromAInt.remove(cardsFromAInt.indexOf(Integer.parseInt(changeCards[2])));
                }
            } else {
                if(changeCards[0].equals("1")){
                    cardsFromBInt.add(Integer.parseInt(changeCards[2]));
                } else{
                    cardsFromBInt.remove(cardsFromBInt.indexOf(Integer.parseInt(changeCards[2])));
                }
            }
            varietyList = varietyList.concat(TargetAndRemove()).concat(" ");
        }
        varietyList = varietyList.trim();
        System.out.println(varietyList);
    }

    public static String TargetAndRemove(){
        ArrayList<Integer> cardsFromALocal = new ArrayList<>(cardsFromAInt);
        ArrayList<Integer> cardsFromBLocal = new ArrayList<>(cardsFromBInt);
        int j = cardsFromALocal.size();
        for (int i = 0; i < j - 1; i++) {
            if(cardsFromBLocal.contains(cardsFromALocal.get(i))) {
                cardsFromBLocal.remove(cardsFromALocal.get(i));
                cardsFromALocal.remove(cardsFromALocal.get(i));
            }
        }
        return Integer.toString(cardsFromBLocal.size() + cardsFromALocal.size());
    }
}