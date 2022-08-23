package Unit12;

import java.sql.*;

public class ConnectionJDBC {
    public static void main(String[] args) throws Exception{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        System.out.println("Driver Loading...");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
        System.out.println("Connect Successful!");

        Statement statement = con.createStatement();

        String sql = "CREATE TABLE DUONG_STUDENT (\n" +
                "  ID number  NOT NULL PRIMARY KEY,\n" +
                "  NAME varchar2(50),\n" +
                "  AGE number \n" +
                ")";

        statement.execute(sql);

        con.close();
        System.out.println("Created!");
    }
}
