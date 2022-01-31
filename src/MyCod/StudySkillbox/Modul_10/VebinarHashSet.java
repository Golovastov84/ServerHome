package MyCod.StudySkillbox.Modul_10;

import java.util.*;

public class VebinarHashSet {

    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        //Set<Client> clients = new TreeSet<>();

        clients.add(new Client("Sandra", 1));
        clients.add(new Client("Alex", 3));
        clients.add(new Client("John", 2));

        clients.forEach(c -> System.out.println(c.getName()));

        Set<Client> clientsAlphabetOrder = new TreeSet<>(new ClientComparator().reversed());
        clientsAlphabetOrder.addAll(clients); // добавить всю коллекцию clients

        clientsAlphabetOrder.forEach(c -> System.out.println(c.getName()));

        Collections.sort(clients, new ClientComparator());
        clients.forEach(c -> System.out.println(c.getName()));

    }
}

class Client implements Comparable<Client> {
    static int hashcodeCount;
    static int equalsCount;
    private final String name;
    private final int id;

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }


    @Override
    public boolean equals(Object o) {
        equalsCount++;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        return name != null ? name.equals(client.name) : client.name == null;
    }


    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Client o) {
        return Integer.compare(id, o.id);
    }
}
