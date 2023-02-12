package MyCod.ContestYandex;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String threeWholeNumbers = null;
        String numberKilogramsSculpture = null;
        // количество скульптур
        int numberSculptures;
        // идеальное количество льда
        int perfectAmountIce;
        // минут до наступления праздника
        long minutesBeforeHoliday;

        int counter = 0;
        while (counter < 2)
        {
            Scanner lineScanner = new Scanner(sc.nextLine());
            while (lineScanner.hasNext() && counter < 2) {
                counter++;
                switch (counter){
                    case 1 -> threeWholeNumbers = lineScanner.nextLine();

                    case 2 -> {
                        numberKilogramsSculpture = lineScanner.nextLine();
                        break;
                    }
                }
            }
            lineScanner.close();
        }
        sc.close();
        String[] wholeNumbers = threeWholeNumbers.split("\\s+", 3);
        // количество скульптур
        numberSculptures = Integer.parseInt(wholeNumbers[0]);
        // идеальное количество льда
        perfectAmountIce = Integer.parseInt(wholeNumbers[1]);
        // минут до наступления праздника
        minutesBeforeHoliday = Long.parseLong(wholeNumbers[2]);
        String[] numberKilograms = numberKilogramsSculpture.split("\\s+", numberSculptures);
        List<Sculpture> sculptures = new ArrayList<Sculpture>();
        for (int i = 0; i < numberSculptures; i++) {
            sculptures.add(new Sculpture(i, Math.abs(Integer.valueOf(numberKilograms[i]) - perfectAmountIce),
                    (Integer.valueOf(numberKilograms[i]) - perfectAmountIce) < 0));
        }

        Collections.sort(sculptures, new Sortbyroll());


        List<Sculpture> sculpturesPerfect = new ArrayList<Sculpture>();
        int i = 0;
        while (minutesBeforeHoliday > 0){

            if(sculptures.get(i).weightDifference < minutesBeforeHoliday){
                sculpturesPerfect.add(sculptures.get(i));
                minutesBeforeHoliday -= sculptures.get(i).weightDifference;
                i++;
            } else {
                break;
            }
        }
        System.out.println(sculpturesPerfect.size());
        for (Sculpture sculp : sculpturesPerfect) {

            System.out.print((sculp.number + 1) + " ");
        }


    }
    static class Sculpture{
        int number;
        int weightDifference;

        boolean addIce;

        public Sculpture(int number, int weightDifference, boolean addIce) {
            this.number = number;
            this.weightDifference = weightDifference;
            this.addIce = addIce;
        }

        public String toString(){
            return this.number + " " + this.weightDifference + " " + this.addIce ;
        }
    }
    static class Sortbyroll implements Comparator<Sculpture> {
        public int compare(Sculpture a, Sculpture b){
            return  a.weightDifference - b.weightDifference;
        }
    }
}
