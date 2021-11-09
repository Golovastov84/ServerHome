package entity;

import javax.print.attribute.standard.OrientationRequested;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XmlSerializeMain {
    public static void main(String[] args) {
        /*try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("data/serial.xml")))){
            Order order = new Order(11, 77);
            xmlEncoder.writeObject(order);
            xmlEncoder.flush();
                    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } // Создание файла serial.xml*/
        try (XMLDecoder xmlDecoder = new XMLDecoder( new BufferedInputStream(new FileInputStream("data/serial.xml")))){
            Order order = (Order) xmlDecoder.readObject();
            System.out.println(order);
        }
              catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }
}
