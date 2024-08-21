package javajdbc_conn;
import java.sql.*;
import java.util.Properties;
public class ListTables_FromDatabase {
    public static void main(String args[]) throws Exception {
        String databaseURL = "jdbc:mysql://localhost:3306/mysql";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "mysql");
        properties.setProperty("useSSL", "false");
        Connection conn = DriverManager.getConnection(databaseURL, properties);
        System.out.println("Connection established......");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Show tables");
        System.out.println("Tables in the current database: ");
        while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println();
        }


        DatabaseMetaData metaData = conn.getMetaData();
        String[] types = {"TABLE"};
        //Retrieving the columns in the database
        ResultSet tables = metaData.getTables(null, null, "%", types);
        while (tables.next()) {
            System.out.println(tables.getString("TABLE_NAME"));
        }




    }
}
