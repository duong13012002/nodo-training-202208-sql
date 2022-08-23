package Unit12;

import java.sql.*;

public class UpdateDataExp {
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        System.out.println("Driver Loading...");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
        System.out.println("Connect Successful!");

        PreparedStatement statement = con.prepareStatement("UPDATE DUONG_STUDENT set AGE = 21 WHERE ID = 2");
        statement.execute();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM DUONG_STUDENT");
        while (rs.next()){
            Integer id = rs.getInt("ID");
            String name = rs.getString("NAME");
            Integer age = rs.getInt("AGE");

            System.out.println(id +"\t" + name +"\t" +age);
        }
        rs.close();
        statement.close();
    }
}
