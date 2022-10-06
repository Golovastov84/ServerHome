package MyCod.IT_One;

import java.util.regex.Pattern;

public class Solution {

    public static int numberBites = 0;

    public static int getResult(String teeth){
//    int numberBites = 0;
        System.out.println("Start:" + teeth);
        while(teeth.contains("X")) {
            int checkSX = 0;
            int checkXS = 0;
            String localTextX = teeth;
            while(Pattern.compile("^[X]").matcher(localTextX).find()) {
                localTextX = localTextX.substring(1);
                checkSX++;
            }
            while(Pattern.compile("[X]$").matcher(localTextX).find()) {
                localTextX = localTextX.substring(0,localTextX.length() - 1);
                System.out.println(localTextX);
                checkXS++;
                System.out.println(checkXS);
            }
            if(teeth.matches("^[X]+[XI]+$")) {
                teeth = teeth.replaceAll("^[X]+", "");
                numberBites += (checkSX * 2);
                System.out.println(numberBites + " SX");
            } else if(teeth.matches("^[IX]+[X]$")) {
                teeth = teeth.replaceAll("[X]+$", "");
                numberBites += (checkXS * 2);
                System.out.println(numberBites + " XS");
            }
            else if(teeth.matches("^[I]+[XI]+[I]+$")){
                int checkSI = 0;
                int checkIS = 0;
                int checkX = 0;
                String localTextI = teeth;
//                    if(arrayListRegex.indexOf(str) == 2){
                while(Pattern.compile("^[I]").matcher(localTextI).find()) {
                    localTextI = localTextI.substring(1);
                    checkSI++;
                }
                while(Pattern.compile("[I]$").matcher(localTextI).find()) {
                    localTextI = localTextI.substring(0, localTextI.length() - 1);
                    checkIS++;
                }
                while (Pattern.compile("^[X]").matcher(localTextI).find()){
                    localTextI = localTextI.substring(1);
                    checkX++;
                }
                if(checkIS >= checkSI){
                    // обрабатываем слева
                    teeth = teeth.replaceAll("^[I]+[X]+", "");
                    if((checkSI * 2 + checkX * 2) >= (checkX * 4)){
                        // удаляем зубы из центра
                        teeth = utilsRepeat("I", checkSI).concat(teeth);
                        numberBites += (checkX * 4);
                        System.out.println(numberBites);
                    } else {
                        // удаляем сначала здоровые с левого краю, потом больные
                        numberBites += (checkSI * 2 + checkX * 2);
                        System.out.println(checkSI * 2 + checkX * 2);
                        System.out.println(numberBites);
                    }
                } else {
                    // обрабатываем справа
                    teeth = teeth.replaceAll("[X]+[I]+$", "");
                    if((checkIS * 2 + checkX * 2) >= (checkX * 4)){
                        // удаляем зубы из центра
                        teeth = teeth.concat(utilsRepeat("I", checkIS));
                        numberBites += (checkX * 4);
                        System.out.println(numberBites);
                    } else {
                        // удаляем сначала здоровые с правого краю, потом больные
                        numberBites += (checkIS * 2 + checkX * 2);
                        System.out.println(numberBites);
                    }
                }
            }

            System.out.println(teeth + " local");
//            teeth = dellCharX(teeth);
        }

//        return teeth;

        System.out.println("Finish: " + teeth);
        return numberBites;
//        return teeth.length();
    }

    public static String utilsRepeat(String str, int i){
        String localText = str;
        for (int j = 1; j < i; j++) {
            localText = localText.concat(str);
        }
        return localText;
    }

    public static void runCode(){

    }

}
