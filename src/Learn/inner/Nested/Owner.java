package Learn.inner.Nested;

import java.util.Comparator;

public class Owner {
    private int value = 1; // Не статическое поле
    static int statValue = 2; // Статическое поле
    public static class ValueComparator implements Comparator <Owner> {
        @Override
        public int compare(Owner o1, Owner o2) { // выполняет сортировку по возрастанию
            return o1.value - o2.value;
        }
    }
}
