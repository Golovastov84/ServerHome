package Learn.type;

public class Runner {
    public static void main (String[] args) {
        MusicType type = MusicType.CLASSIC; // Создание перечисления 1 вариант
        /*String value = "Rock "; // Создание перечисления 2 вариант
        MusicType type1 = MusicType.valueOf(value.toUpperCase().trim()); // Создание перечисления 2 вариант*/
        type.info();
        MusicType type1 = MusicType.valueOf("ROCK"); // Создание 2-го перечисления
        System.out.println(type.compareTo(type1)); // выдаст расстояние между CLASSIC и ROCK

    }
}
