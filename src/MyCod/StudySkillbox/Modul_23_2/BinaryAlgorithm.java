package MyCod.StudySkillbox.Modul_23_2;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryAlgorithm {
    private static ArrayList<String> list;

    public static void main(String[] args) {
        int[] array = {4, 7, 2, 6, 1, 5};
        for(int ar : array){
            System.out.print(ar);
        }
        System.out.println("++++++");

        int low = 0;
        int high = array.length - 1;
//        quickSort(array, low, high);
//        mergeSort(array);
//        int[] resultArray = sortArray(array);

        int[] resultArray = mergesort(array);

//        bubbleSort(array);
        for(int ar : resultArray){
            System.out.print(ar);
        }
    }

    private static int search(String query, int from, int to){
        int middle = (from + to) / 2;
        int comparison = query.compareTo(list.get(middle));
        if(comparison == 0){
            return middle;
        }
        if(comparison > 0){
            return search(query, middle, to);
        } else {
//        if(comparison < 0){
//            Collections.binarySearch()
            return search(query, from, middle);
        }
    }

    private static void bubbleSort(int[] array){
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if(array[j - 1] > array[j]){
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

//    не работает
    public static void mergeSort(int[] array){
        // проверяем не нулевой ли он?
//        if (array != null || array.length < 2) {
            int n = array.length;
            int middle = n / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[n - middle];
            for (int i = 0; i < middle; i++) {
                leftArray[i] = array[i];
            }
            for (int i = middle; i < n; i++) {
                rightArray[i - middle] = array[i];
            }
            for (int i = 0; i < leftArray.length; i++) {
                System.out.print(leftArray[i]);
            }
            System.out.println("---1---");
            for (int i = 0; i < rightArray.length; i++) {
                System.out.print(rightArray[i]);
            }
            System.out.println("---2---");
            if  (array != null && array.length < 2) {
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(array, leftArray, rightArray);
        }

    }

//    не работает
    public static void merge(int[] array,int[] leftArray,int[] rightArray){
//        array = new int[]{leftArray.length + rightArray.length};
        int count = 0;
        for(int i = 0; i < leftArray.length; i++) {
            array[i] = leftArray[i];
            count++;
        }

        for(int j = 0;j < rightArray.length;j++) {
            array[count++] = rightArray[j];
        }
    }

//    не работает
    public static int [] sortArray(int[] arrayA){ // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

//    не работате
    public static int [] mergeArray(int [] arrayА, int [] arrayB) {

        int[] arrayC = new int[arrayА.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayА.length) {
                arrayC[i] = arrayB[i - positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayА[i - positionA];
                positionA++;
            } else if (arrayА[i - positionA] < arrayB[i - positionB]) {
                arrayC[i] = arrayА[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    private static void qSort(int[] array, int from, int to){
        if(from < to){
            int pivot = partition(array, from, to);
            qSort(array, from, pivot - 1);
            qSort(array, pivot + 1, to);
        }
    }


    private static int partition(int[] array, int from,int to){

        return 0;
    }
}
