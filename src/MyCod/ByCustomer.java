package MyCod;

public class ByCustomer {
    public static void main(String[] args) { // Разница между вызовом статического и не статического полей
        Customer.field2 = "Static";
        System.out.println(Customer.field2);
        Customer customer = new Customer();
        customer.field1 = "Non_Static";
        System.out.println(customer.field1);
        customer.writeText("London");
        System.out.println(customer.sum(3,5)); // Вызов метода с возвратом значения
    }
}
