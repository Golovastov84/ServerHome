import java.sql.*;

public class DBConnection
{
    private static Connection connection;

    private static String dbName = "learn";
    private static String dbUser = "root";
    private static String dbPass = "v67676?ar2";

    private static StringBuilder insertQuery = new StringBuilder();

    public static Connection getConnection()
    {
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
                        "PRIMARY KEY(id), KEY(name(50)))");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static int customSelect() throws SQLException{
        String sql = "SELECT id FROM voter_count WHERE name = 'Могильный Ким'";
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery(sql);
        if(!rs.next()){
            return -1;
        } else {
            return rs.getInt("id");
        }
    }

    public static void executeMultiInsert() throws SQLException{
            String sql = "INSERT INTO voter_count(name, birthDate, `count`) VALUES " + insertQuery;
            DBConnection.getConnection().createStatement().execute(sql);
    }

    public static void countVoter(String name, String birthDay) throws SQLException
    {
        birthDay = birthDay.replace('.', '-');
        boolean isStart = insertQuery.length() == 0;
        insertQuery.append(isStart ? "" : ",").append("('").append(name).append("', '").append(birthDay).append("', " +
                "1)");
        if(insertQuery.length() > (1024 * 1024 * 40)){
            DBConnection.insertInto();
        }
    }

    public static void insertInto() throws SQLException{
        if(insertQuery.length() != 0) {
            String sql = "INSERT INTO voter_count(name, birthDate, `count`) VALUES" + insertQuery;
            DBConnection.getConnection().createStatement().execute(sql);
            insertQuery = new StringBuilder();
        }
    }

    public static void selectMulti() throws SQLException{
        String selectCount = "SELECT id, name FROM voter_count WHERE id IN(1, 2, 5)";
        ResultSet result = DBConnection.getConnection().createStatement().executeQuery(selectCount);
        while (result.next()){
            System.out.println(result.getString("name"));
        }
    }

    public static void printVoterCounts() throws SQLException
    {
        String sql = "SELECT name, birthDate, `count` FROM voter_count WHERE `count` > 1";
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery(sql);
        while(rs.next())
        {
            System.out.println("\t" + rs.getString("name") + " (" +
                    rs.getString("birthDate") + ") - " + rs.getInt("count"));
        }
    }
}






