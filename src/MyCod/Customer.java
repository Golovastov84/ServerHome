package MyCod;

public class Customer {
    String field1;
    static String field2;
    public void writeText (String text1) {
        text1 = text1 + " Capital";
        System.out.println(text1);
        int localId = 1;
    }
    public int sum (int x, int y) { // Метод с возвратом значения
        return x + y;
    }
}
