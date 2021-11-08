package entity.TestEqualsHashcode;
class Item {
    public int item;
    Item (int item) {
        this.item = item;
    }
}
/*public class Quest {
    public static void main(String[] args) {
         int ar1[] = {10, 2, 3}; // Создаётся массив
         //ar2 [] = ar1; // Клонируется массив
        //ar1 [0] = 4; // Заменяется первый элемент массива на 4
        System.out.println(ar1 [0] + " " + ar1 [1] + " " + ar1 [2]); // Выводится массив
    }
}*/
public class Quest {
    public static void main(String[] args) {
        Item ar1 [] = {new Item(10), new Item(2), new Item(3)}; // Создаётся массив в объекте
        Item ar2 [] = ar1.clone(); // Клонируется массив
        ar2 [0].item = 4; // Заменяется первый элемент массива на 4
        System.out.println(ar1 [0].item + " " + ar1 [1].item + " " + ar1 [2].item); // Выводится массив
    }
}
