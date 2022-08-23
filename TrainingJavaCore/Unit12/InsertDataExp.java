package Unit12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataExp {
    public static void main(String[] args) throws Exception{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        System.out.println("Driver Loading...");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
        System.out.println("Connect Successful!");

        Statement statement = con.createStatement();
        statement.execute("INSERT INTO DUONG_STUDENT(ID,NAME,AGE) values (1,'Nguyen Quang Duong',21)");
        statement.execute("INSERT INTO DUONG_STUDENT(ID,NAME,AGE) values (2,'Nguyen Ba Khanh',20)");
        statement.execute("INSERT INTO DUONG_STUDENT(ID,NAME,AGE) values (3,'Nguyen Duy Tien',20)");
        System.out.println(statement.execute("SELECT * FROM DUONG_STUDENT"));
        System.out.println("Insert Successfully!");
        statement.close();
        con.close();

    }
}
