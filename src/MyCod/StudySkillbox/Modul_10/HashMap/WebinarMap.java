package MyCod.StudySkillbox.Modul_10.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebinarMap {
    public static void main(String[] args) {

        Map<Integer, Client> clientMap = new HashMap<>(16, 1.0f);

        for(int i = 0; i < 16; i++){
            if(i % 16 == 0) {
                continue;
            }

            clientMap.put(i, new Client(i, "Alex"));
        }


        System.out.println(clientMap.get(20).getName());
    }
}

/*class Id{
    @Override
    public int hashCode() {

        return 1;
    }
}*/

class Client{
    private final int id;
    private final String name;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        /*int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;*/
        return 1;
    }
}
