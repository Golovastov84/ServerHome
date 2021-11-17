package Learn.inner.Local;

public class Owner {
    private int value = 1;
    void action() { // метод
        int a = 2;
        class InnerAction { // класс внутри метода для внешнего мира не видны
        int inner = value;
        int innerA = a;
        }
        new InnerAction(); // обращение к классу
    }
    static void staticAction() { // Метод
        int b = 3;
        class StaticInnerAction { // класс внутри метода для внешнего мира не видны
            int c = b; // доступ возможен
        //int innerA = a; // доступ не возможен
       // int inner = value; //  в классе статического метода доступа к value не будет

        }
    }
}
