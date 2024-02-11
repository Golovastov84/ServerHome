package MyCod.StudySkillbox.Modul_22_9.main.java;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandlerFile extends DefaultHandler {
// не реализован
        private String textFile;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("voters")) {

            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if(qName.equals("voter")){
//                voter = null;
            }
        }

        /*public void printDuplicatedVoters(){
            for(Voter voter : voterCounts){
                if(voter.getCount() > 1){
                    System.out.println(voter);
                }
            }
        }*/


}
