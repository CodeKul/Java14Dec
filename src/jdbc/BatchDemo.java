package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {
    public static void main(String[] args) {

        try {
            String insert = "insert into employee(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement = Conn.getConn().prepareStatement(insert);

            for (int i = 1; i <= 15; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "name=> " + i);
                preparedStatement.setString(3, "address=> " + i);
                preparedStatement.addBatch();
            }

            int[] i = preparedStatement.executeBatch();
            System.out.println("row affected " + i.length);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
