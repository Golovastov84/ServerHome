import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

public class XMLHandler extends DefaultHandler {
    private Voter voter;
    private HashSet<Voter> voterCounts;

    private static String dbName = "learn";
    private static String dbUser = "root";
    private static String dbPass = "v67676?ar2";

    private static Connection connection;

    private static StringBuilder insertQuery;

    public XMLHandler(){
        voterCounts = new HashSet<>();
        insertQuery = new StringBuilder();
        if(connection == null)
        {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/" + dbName +
                                "?user=" + dbUser + "&password=" + dbPass);
                connection.createStatement().execute("DROP TABLE IF EXISTS voter_count");
                connection.createStatement().execute("CREATE TABLE voter_count(" +
                        "id INT NOT NULL AUTO_INCREMENT, " +
                        "name TINYTEXT NOT NULL, " +
                        "birthDate DATE NOT NULL, " +
                        "`count` INT NOT NULL, " +
                        "PRIMARY KEY(id), " +
                        "UNIQUE KEY name_date(name(50), birthDate))");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("voter")) {
            String birthDay = attributes.getValue("birthDay");
            String name = attributes.getValue("name");
            birthDay = birthDay.replace('.', '-');
            boolean isStart = insertQuery.length() == 0;
            insertQuery.append((isStart ? "" : ",") + "('" + name + "', '" + birthDay + "', 1)");
            if(insertQuery.length() > (1024 * 1024 * 30)){
                try {
                    InsertInto();
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
                InsertInto();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void InsertInto() throws SQLException{
        String sql = "INSERT INTO voter_count(name, birthDate, `count`)" +
                "VALUES" + insertQuery +
                "ON DUPLICATE KEY UPDATE `count`=`count` + 1";
        insertQuery = new StringBuilder();
            connection.createStatement().execute(sql);
    }
    public void printDuplicatedVoters() throws SQLException{
        String sql = "SELECT name, birthDate, `count` FROM voter_count WHERE `count` > 1";
        ResultSet rs = connection.createStatement().executeQuery(sql);
        while(rs.next())
        {
            System.out.println("\t" + rs.getString("name") + " (" +
                    rs.getString("birthDate") + ") - " + rs.getInt("count"));
        }
    }
}
