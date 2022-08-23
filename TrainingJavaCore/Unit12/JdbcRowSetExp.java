package Unit12;


import javax.sql.rowset.*;



public class JdbcRowSetExp {
    public static void main(String[] args) throws Exception{
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl("jdbc:oracle:thin:SCOTT/SCOTT@27.118.22.14:1521:orcl");
        jdbcRowSet.setCommand("select * from DUONG_STUDENT");
        jdbcRowSet.execute();
//        while (jdbcRowSet.next()){
//            System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString("NAME"));
//
//        }
//        jdbcRowSet.close();

        jdbcRowSet.first();
        jdbcRowSet.updateString("name","Hoang Van X");
        jdbcRowSet.commit();

        jdbcRowSet.first();
        System.out.println(jdbcRowSet.getInt("ID")+ "\t" +jdbcRowSet.getInt(2));

        jdbcRowSet.absolute(8);
        System.out.println(jdbcRowSet.getInt("NAME") + ":" + jdbcRowSet.getInt("AGE"));

        jdbcRowSet.close();

    }
}
