package MyCod;

class Goblin1 {
    final String name1;
    public Goblin1 (String name1) {
        this.name1 = name1 + " Best";
    }
    public void someMethod1 (final String secondName1) {
        final String thirdName1 = "Third";
        //this.name1 = secondName1; // Нельза, ошибка компиляции
        //secondName1 = "3"; // Нельза, ошибка компиляции
        //thirdName1 = "4"; // Нельза, ошибка компиляции
    }
    public static final void myFinalMethod1(int id1) {
        System.out.println("id + 2 = " + (id1+2));
    }
}
