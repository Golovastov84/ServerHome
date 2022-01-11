package MyCod.StudySkillbox.Modul_7;

public class SortAlphabet {
    public static char [] arrayAlphabet = new char[66];
    public static int q = 0;
    public static void main(String[] args) {
        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        int j = 0;
        char temp;
        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            switch (c) {
                case 'Ё', 'ё' -> printOut(i, c);

                case 'А' -> j++;

                case 'я' -> {
                    j = 0;
                    printOut(i, c);
                }
                default -> {
                }
            }

            if (j > 0) {
                printOut(i, c);
                j++;
            }
        }
        for (int i = 0; i < arrayAlphabet.length; i++) {
            for (j = 0; j < arrayAlphabet.length; j++) {
                if(arrayAlphabet[j] == 'Ё' && arrayAlphabet[i] < 'Ж') {
                    temp = arrayAlphabet[i];
                    arrayAlphabet[i] = arrayAlphabet[j];
                    arrayAlphabet[j] = temp;
                }
            }
        }
        for (int i = arrayAlphabet.length - 1; i > -1; i--) {
            for (j = arrayAlphabet.length - 1; j > -1; j--) {
                if(arrayAlphabet[j] == 'ё' && arrayAlphabet[i] > 'е') {
                    temp = arrayAlphabet[i];
                    arrayAlphabet[i] = arrayAlphabet[j];
                    arrayAlphabet[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrayAlphabet.length; i++) {
            System.out.println(arrayAlphabet[i] + " - " +(int) arrayAlphabet[i]);
        }
    }

    public static void printOut(int i, char c) {
        //System.out.println(i + " - " + c);
        arrayAlphabet[q] = c;
        q++;
    }
}
