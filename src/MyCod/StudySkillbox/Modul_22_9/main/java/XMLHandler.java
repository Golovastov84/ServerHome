import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.SQLException;

public class XMLHandler extends DefaultHandler {

    int limit = 5_000_000;
    int number = 0;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
if(qName.equals("voter")) {
    if (number < limit) {
        String name = attributes.getValue("name");
        String birthDay = attributes.getValue("birthDay");
        try {
            DBConnection.countVoter(name, birthDay);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        number++;
    } else {
        try {
            DBConnection.insertInto();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("voters")){
            try {
                DBConnection.insertInto();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}