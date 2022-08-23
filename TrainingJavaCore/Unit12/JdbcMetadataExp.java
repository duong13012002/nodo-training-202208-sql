package Unit12;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcMetadataExp {
    public static void main(String[] args) throws Exception {

        Connection connection = null;
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            System.out.println("Driver Loading...");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            System.out.println("Connect Successful!");

            DatabaseMetaData metaData = connection.getMetaData();

            System.out.println("DB version "+metaData.getDatabaseMajorVersion());
            System.out.println("Driver name "+metaData.getDriverName());
        }finally {
            connection.close();
        }
    }
}
