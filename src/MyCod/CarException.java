package MyCod;

public class CarException {
    public CarException (String brand) throws Exception {
        if (brand == null) {
            throw new Exception("brand не может быть null");
        }
    }
    public String carGou (String brand) {
        System.out.println(brand);
        //return brand;
        return brand;
    }
}
