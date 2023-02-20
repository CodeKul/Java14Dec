package jdbc;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableDemo {
    public static void main(String[] args) {


        try {
            CallableStatement callableStatement = Conn.getConn().prepareCall("call getEmployee()");
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+
                        rs.getString("name")+" "+rs.getString("address"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
