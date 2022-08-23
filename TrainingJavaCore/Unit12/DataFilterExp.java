package Unit12;

import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Driver;
import java.sql.SQLException;

public class DataFilterExp {
    public static void main(String[] args) throws SQLException {
        FilteredRowSet frs = RowSetProvider.newFactory().createFilteredRowSet();
        frs.setUrl("jdbc:oracle:thin:SCOTT/SCOTT@27.118.22.14:1521:orcl");
        frs.setCommand("select * from DUONG_STUDENT");
        frs.setFilter(new DataFilter());
        frs.execute();

        System.out.println("ID\tName\t\tAge");
        while (frs.next()){
            System.out.println(frs.getInt("ID") +"\t" + frs.getString("NAME") +"\t" + frs.getInt("AGE"));
        }
    }
}
