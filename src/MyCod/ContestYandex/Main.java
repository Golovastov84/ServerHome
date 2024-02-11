package MyCod.ContestYandex;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // количество клавиш на клавиатуре
        int numberKeysKeyboard = 0;
        // индинтификаторы символов
        String characterIdentifiersKeys = null;
        // номер ряда
        String setsRowNumber = null;
        // количество символов в реферате
        int numberCharactersAbstract = 0;
        // идентификаторы символов реферата
        String characterIdentifiersSetOrder = null;
        // разноразрядность
        int heterogeneity = 0;
        int counter = 0;
        while (counter < 5)
        {
            Scanner lineScanner = new Scanner(sc.nextLine());
            while (lineScanner.hasNext() && counter < 5) {
                counter++;
                switch (counter){
                    case 1 -> {
                        System.out.println("количество клавиш на клавиатуре int");
                        numberKeysKeyboard = Integer.parseInt(lineScanner.nextLine());
                    }
                    case 2 -> {
                        System.out.println("индинтификаторы символов string");
                        characterIdentifiersKeys = lineScanner.nextLine();
                    }
                    case 3 -> {
                        System.out.println("номер ряда string");
                        setsRowNumber = lineScanner.nextLine();
                    }
                    case 4 -> {
                        System.out.println("количество символов в реферате int");
                        numberCharactersAbstract = Integer.parseInt(lineScanner.nextLine());
                    }
                    case 5 -> {
                        System.out.println("идентификаторы символов реферата string");
                        characterIdentifiersSetOrder = lineScanner.nextLine();
                        break;
                    }
                }
            }
            lineScanner.close();
        }
        sc.close();
        String[] keys = characterIdentifiersKeys.split("\\s+", numberKeysKeyboard);
        String[] rows = setsRowNumber.split("\\s+", numberKeysKeyboard);
        String[] orders = characterIdentifiersSetOrder.split("\\s+", numberCharactersAbstract);
        Map<String, String> keysMap = new HashMap<>();
        for (int i = 0; i < numberKeysKeyboard; i++) {
            keysMap.put(keys[i], rows[i]);
        }
        for (int i = 1; i < numberCharactersAbstract; i++) {
            if(!Objects.equals(keysMap.get(orders[i - 1]), keysMap.get(orders[i]))){
                heterogeneity++;
            }
        }
        System.out.println(heterogeneity);
    }
}

