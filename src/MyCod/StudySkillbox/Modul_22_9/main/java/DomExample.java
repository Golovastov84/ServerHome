import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;

public class DomExample {

    private static String getValue(NodeList fields, int index)
    {
        NodeList list = fields.item(index).getChildNodes();
        if (list.getLength() > 0) {
            return list.item(0).getNodeValue();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        final String FILE_post = "res/data_experiment.xml";
        DocumentBuilderFactory dbf = null;
        DocumentBuilder db  = null;
        Document doc = null;
        try {
            dbf = DocumentBuilderFactory.newInstance();
            db  = dbf.newDocumentBuilder();
            doc = null;

            FileInputStream fis = null;
            try {
                fis = new FileInputStream(FILE_post);
                doc = db.parse(fis);
            } catch (Exception e) {
                e.printStackTrace();
            }
            doc.getDocumentElement().normalize();

            NodeList fields   = null;
            NodeList nodeList = null;

            nodeList = doc.getElementsByTagName("voter");
            System.out.println(nodeList.getLength());
            System.out.println(nodeList.item(0).getAttributes().getNamedItem("name").getNodeValue());
            System.out.println(nodeList.item(0).getAttributes().getNamedItem("birthDay").getNodeValue());

            for (int s = 0; s < nodeList.getLength(); s++) {
                Node node = nodeList.item(s);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element el = (Element) node;
                    fields = el.getElementsByTagName("visit");
                    System.out.println(fields.item(0).getAttributes().getNamedItem("station").getNodeValue());
                    System.out.println(fields.item(0).getAttributes().getNamedItem("time").getNodeValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}