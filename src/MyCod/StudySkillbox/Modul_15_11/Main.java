package MyCod.StudySkillbox.Modul_15_11;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        String htmlFile = parseFile("data\\code.html");
        Document doc = Jsoup.parse(htmlFile);
        Elements elements = doc.select("img.card-feature__image");
        elements.forEach(element ->
            System.out.println(element.text())
        );
        /*Document doc = Jsoup.parse(htmlFile);
        Elements elements = doc.select("a.menu__link");
        elements.forEach(element -> {
            System.out.println(element.text());
        });*/
       // System.out.println(htmlFile);
    }
    public static String parseFile(String path){
        StringBuilder builder = new StringBuilder();
        try{
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(line -> builder.append(line + "\n"));
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return builder.toString();
    }
}
