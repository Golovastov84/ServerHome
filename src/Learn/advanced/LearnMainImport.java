package Learn.advanced;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnMainImport {
    public static void main(String[] args) throws IOException {
        /*try {
            FileReader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\ServerHome\\data\\Sekond");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\ServerHome\\data\\Sekond"));
        String line = in.readLine();
        while (line != null)
        {
            System.out.println(line);
          line = in.readLine();
        }
        in.close();
        }
}
