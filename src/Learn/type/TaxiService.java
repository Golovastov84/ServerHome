package Learn.type;

public enum TaxiService {
    ALMAZ(7788), STOLITCA(135), VIP(107), CHRISTAL(7778), TAXI_CARGO(163);
    private int phone; // поле
    TaxiService(int phone) {
        this.phone = phone;
    } // конструктор
    public void info() { // метод
        System.out.println(this + " " + phone);
    }

}
