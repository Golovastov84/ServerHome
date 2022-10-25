package MyCod.StudySkillbox.Modul_13_8;

public class Product {

    private final String type;
    private final long price;

    public Product(String phone, long price) {
        this.type = phone;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                '}';
    }
}
