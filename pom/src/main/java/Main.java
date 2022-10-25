import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) throws ParseException {
        Employee employee = new Employee("Vasya", 75_000, new Date());
        System.out.println(employee);
        employee.getName();
        employee.setName("Timmy");
        System.out.println(employee);
//        ArrayList<Employee> staff = LoadStaffFromFile();
        try {
            String data = getDataFromFile("data/staff.json");
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray) parser.parse(data);
            for(Object item : array) {
                JSONObject jsonObject = (JSONObject) item;
                System.out.println(jsonObject.get("name"));
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


//        System.out.println(LoadStaffFromFile());
       /* LRUCache<Employee> cache = new LRUCache(6);
        for(Employee employee : staff){
            cache.addElement(employee);
        }
        cache.getAllElements().forEach(System.out::println);*/
    }

    private static ArrayList<Employee> LoadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\\s");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }

    private static String getDataFromFile(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                builder.append(line);
                            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }
}
