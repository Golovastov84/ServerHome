import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class XMLHandler extends DefaultHandler {
    private Voter voter;
    private static SimpleDateFormat birthDayFormat = new SimpleDateFormat("yyyy.MM.dd");
    // далее если не хватает оперативной памяти с использовнием счетчика HashMap<Voter, Integer>, тогда применяем базу
    // данных
    private HashMap<Voter, Integer> voterCounts;

    public XMLHandler(){
        voterCounts = new HashMap<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
       try {
           if (qName.equals("voter") && voter == null) {
               Date birthDay = birthDayFormat.parse(attributes.getValue("birthDay"));
               voter = new Voter(attributes.getValue("name"), birthDay);
           }
           else if(qName.equals("visit") && voter != null) {
               // возврат значения сопоставленного с ключом, если нет совпадения, возвращ знач по умолчанию
               int count = voterCounts.getOrDefault(voter, 0);
               voterCounts.put(voter, count + 1);
           }
       } catch (ParseException e){
           e.printStackTrace();
       }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("voter")){
            voter = null;
        }
    }
    public void printDuplicatedVoters(){
        for(Voter voter : voterCounts.keySet()){
            int count = voterCounts.get(voter);
            if(count > 1){
                System.out.println(voter.toString() + " - " + count);
            }
        }
    }
}
