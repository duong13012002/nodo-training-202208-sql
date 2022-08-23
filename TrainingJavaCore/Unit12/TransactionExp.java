package Unit12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionExp {
    public static void main(String[] args) throws Exception{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        System.out.println("Driver Loading...");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
        System.out.println("Connect Successful!");
        Statement statement = con.createStatement();
        con.setAutoCommit(false);
        for (int i = 0; i < 10; i++) {
            String name = "Tran Van "+i;
            Integer age = 10+i;
            Integer id = 5+i;
            statement.executeUpdate("insert into DUONG_STUDENT(ID,NAME,AGE) values ('+id+','+('Tran Van '+i)+','+(i+5)+')");
        }
        con.rollback();

        con.setAutoCommit(true);
        ResultSet rs;
        rs = statement.executeQuery("SELECT COUNT(*) FROM DUONG_STUDENT");
        if (rs.next()) System.out.println("Total record = "+rs.getInt(1));
        con.close();



    }
}
