package javajdbc_conn;

import java.sql.*;
import java.util.Properties;

public class ListDatabasesProgram {
    public static void main(String[] args) throws SQLException {
        String databaseURL = "jdbc:mysql://localhost:3306/";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "mysql");
        properties.setProperty("useSSL", "false");
        Connection conn = DriverManager.getConnection(databaseURL, properties);
        System.out.println("Connection established......");

        System.out.println("....USING metadata.getCatalogs()....");
        //Retrieving the meta data object
        DatabaseMetaData metadata = conn.getMetaData();
        //Retrieving the list of database names
        ResultSet result = metadata.getCatalogs();
        System.out.println("List of databases: ");
        while (result.next()) {
                String aDBName = result.getString(1);
                System.out.println(aDBName);
            }

        System.out.println("....USING statement.executeQuery('show databases')....");
        Statement stmt = conn.createStatement();
        String sql = "show databases";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("List of databases: ");
        while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println();
        }


        conn.close();
        }
    }



