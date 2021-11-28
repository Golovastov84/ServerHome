package MyCod;

public class ByCarExcepyion {
    public static void main(String[] args) {
        CarException carException = null;
        try {
            carException = new CarException("Mersedes");
            carException.carGou("null");
        } catch (Exception e) {
           //System.out.println(carException);
        }
    }
}
