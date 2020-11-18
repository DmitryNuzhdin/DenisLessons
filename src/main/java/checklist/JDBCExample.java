package checklist;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDBCExample {

    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:file:C:\\ path ");
            Statement statement = connection.createStatement();
            //statement.executeUpdate("create table table1 (id int)");
//            statement.executeUpdate("insert into table1 (id) values (11)");
//            statement.executeUpdate("insert into table1 (id) values (22)");
//            statement.executeUpdate("insert into table1 (id) values (33)");

            List<Integer> ints = Arrays.asList(6, 7, 8, 9);

            PreparedStatement pst = connection.prepareStatement("insert into table1 (id) values (?)");

            for (int i : ints) {
                pst.setInt(1, i);
                pst.execute();
            }

            ResultSet rs = statement.executeQuery("select * from table1");

            while (rs.next()) {
                System.out.println(rs.getInt(rs.findColumn("id")));
            }

            statement.close();
            connection.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
}
