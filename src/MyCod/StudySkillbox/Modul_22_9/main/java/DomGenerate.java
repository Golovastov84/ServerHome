import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DomGenerate {

    public static void main(String[] args) {

        while (file.length()/1024 < (1024)){
            listVoters();
        }

    }

    private static final  String  FILE_data = "res/data_experiment.xml";
    static List<Post> posts = new ArrayList<Post>();
    static File file = new File(FILE_data);

    private static void listVoters(){
        DocumentBuilderFactory dbf = null;
        DocumentBuilder db = null;
        Document doc = null;
        try {
            dbf = DocumentBuilderFactory.newInstance();
            db = dbf.newDocumentBuilder();
            doc = db.parse(file);

            Element e_listVotersVisits = doc.getDocumentElement();
            for (int i = 0; i < 100; i++) {
                Element e_voter = doc.createElement("voter");
                e_voter.setAttribute("name", nameGenerate());
                String birthDay = birthDayGenerate();
                e_voter.setAttribute("birthDay", birthDay);
                Element e_visit = doc.createElement("visit");
                e_visit.setAttribute("station", Integer.toString((int) ((Math.random() * (15 - 1)) + 1)));
                e_visit.setAttribute("time", visitingTimeGenerate(birthDay));
                e_listVotersVisits.appendChild(e_voter);
                e_voter.appendChild(e_visit);
            }
//            doc.appendChild(e_listVotersVisits);

        } catch(ParserConfigurationException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } finally {
            // Сохраняем Document в XML-файл
            Transformer transformer = null;
            if (doc != null) {
                try {
                    transformer = TransformerFactory.newInstance().newTransformer();
                } catch (TransformerConfigurationException e) {
                    throw new RuntimeException(e);
                }
            }
            //DOMSource source = new DOMSource(doc);
            Source source = new DOMSource(doc);
            //StreamResult result = new StreamResult();
            Result result = new StreamResult(file);
            try {
                transformer.transform(source, result);
            } catch (TransformerException e) {
                throw new RuntimeException(e);
            }
//                writeDocument(doc, FILE_data);
        }
    }



    private static void writeDocument(Document document, String path)
    {
        Transformer trf = null;
        DOMSource src = null;
        FileOutputStream fos = null;
        try {
            trf = TransformerFactory.newInstance()
                    .newTransformer();
            src = new DOMSource(document);
            fos = new FileOutputStream(path);

            StreamResult result = new StreamResult(fos);
            trf.transform(src, result);
        } catch (TransformerException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static String nameGenerate(){
        int maxSurnameLength = 15;
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < 3; j++) {
            if (j == 1) {
                builder.append(" ");
            } else {
                for (int i = 1; i < (int) ((Math.random() * (maxSurnameLength - 5)) + 5); i++) {
                    if (i == 1) {
                        builder.append((char) (int) ((Math.random() * (1072 - 1040)) + 1040));
                    } else {
                        int letterInt = (int) ((Math.random() * (1105 - 1072)) + 1072);
                        if (letterInt == 1104) {
                            letterInt = 1105;
                        }
                        builder.append((char) letterInt);
                    }

                }
            }
        }
        return builder.toString();
    }

    private static String birthDayGenerate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate minBirthDay = LocalDate.parse("1910.01.01", formatter);
        int maxDays = (int) minBirthDay.until(LocalDate.now(), ChronoUnit.DAYS);
        int plusDay = (int) ((Math.random() * (maxDays - 2)) + 2);
        LocalDate birthDay = minBirthDay.plusDays(plusDay);
        return formatter.format(birthDay);
    }

    private static String visitingTimeGenerate(String startDayBase){
        String startDaySec = startDayBase.concat( " 00:00:00");
        DateTimeFormatter formatterSec = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        LocalDateTime minBirthDaySec = LocalDateTime.parse(startDaySec, formatterSec);
        long maxSecond = minBirthDaySec.until(LocalDateTime.now(), ChronoUnit.SECONDS);
//        for (int i = 0; i < 100; i++) {
            long plusSecond = (long) ((Math.random() * (maxSecond - 2)) + 2);
            LocalDateTime visitingTime = minBirthDaySec.plusSeconds(plusSecond);
//            System.out.println(maxSecond);
//            System.out.println(formatterSec.format(visitingTime));
//        }
        return formatterSec.format(visitingTime);
    }


}
