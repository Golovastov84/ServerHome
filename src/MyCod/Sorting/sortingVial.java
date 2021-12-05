package MyCod.Sorting;

public class sortingVial {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i < 10; i++) //Создаём массив
        {
            arr[i] = (int) (Math.random()*10); // заполняем массив
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("==================//");
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
            /*Сравниваем элементы попарно,
                если они имеют неправильный порядок,
                        то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
