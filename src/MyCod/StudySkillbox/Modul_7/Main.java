package MyCod.StudySkillbox.Modul_7;
public class Main {
public static Product milk; // строка 10 Будет выводить null
    public static int milkPrice; // заполняется 0
    public static void main(String[] args) {

        //Product milk; // ошибка
        //int bikePrice; // без задания значение обращение к
        // данному примитиву вызовет ошибку
        System.out.println(milk); // выведет null
        System.out.println(milkPrice); // выведет 0
        String newLine = System.lineSeparator();
        System.out.println("первая строка" + newLine + "\n\t" + "вторая строка");
        char tab = '\t';
        int tabCode = tab;
        System.out.println("Код символа табуляции " + tabCode);
        // Пример приведения типов
        char tab1 = (char) 9;
        System.out.println("первая строка" + tab1 + "вторая строка, после табуляции");
        // вывод всех символов типа char
        /*for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            System.out.println(i + " - " +c);
        }*/
        // классы обертки
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // применение классов оберток
        Integer vasaAge = 12;
        Integer petyaAge = 14;
        Integer summAge = vasaAge + petyaAge;
        vasaAge = 16; // так как классы обертки иммутабельны, summAge не измениться
        System.out.println("vasaAge " + vasaAge);
        System.out.println(summAge);
        // пример Boxing
        Double value = 6.0;
        double sum = 0;
        sum = sum + value;
        System.out.println(sum);
        // пример Unboxing
        Integer width = 76;
        Integer height = 76;
        System.out.println(calculateRectangleArea(width, height));
        //System.out.println(bikePrice); // выведет ошибку
       // System.out.println(milk.getName()); // выведет ошибку
    }
    public static int calculateRectangleArea(int width, int height) {
        return width * height;
    }
}
