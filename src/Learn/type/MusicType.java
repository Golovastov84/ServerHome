package Learn.type;

public enum MusicType {
    ROCK("Rock"), JAZZ("Jazz"), CLASSIC;
    private String realName; // Поле для перечисления
   private MusicType() { // Это конструктор перечисления, проходиться по всем элементам в перечислении.
        // Может быть privat
        //System.out.println(this.name() + " " + this.ordinal());
    }

    MusicType(String realName) { // конструктор, где находятся мамые "Rock" и т.д.
        this.realName = realName;
    }


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public void info() { // метод
        switch (this) {
            case JAZZ:
                System.out.println("This is " + realName);
                break;
            case ROCK:
                System.out.println("This is " + realName);
                break;
            case CLASSIC:
                System.out.println("This is classic");
                break;
            default:
                System.out.println("Style out");

        }
    }
}
