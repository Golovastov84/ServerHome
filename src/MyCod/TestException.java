package MyCod;

public class TestException {
    public String concat (String name, String address) throws Exception {
        if(name == null) {
            throw new Exception ("Nou name");
        }
        if(address == null) {
            throw new Exception ("Nou address");
        }
        return name + " " + address;
    }
}
