package MyCod.Sorting;

public class sortingChoice {
    public static void main(String[] args) {
        int [] arr = new int [10];
                for (int i = 0; i < 10; i++) //Создаём массив
        {
            arr[i] = (int) (Math.random()*10); // заполняем массив
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            /* Предполагаем, что первый элемент (в каждом
            подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
            /* В оставшейся части подмножества ищем элеменет
            который меньше предположенного минимума */
            for (int j = i + 1; j < arr.length; j++) {
                // Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
                /* Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами */
                if (i != min_i) {
                    int tmp = arr[i];
                    arr[i] = arr[min_i];
                    arr[min_i] = tmp;
                }
        }
        System.out.println("===================//");
        for (int i = 0; i < 10; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}