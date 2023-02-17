package jdbc;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java14dec",
                            "root7","password");

            Statement statement  = connection.createStatement();

            String insert = "insert into employee(id,name,address) values(2,'Prakash','Pune')";
            String update = "update employee set name='Rakesh' where id = 1";
            String delete = "delete from employee where id = 2";
            int i =  statement.executeUpdate(delete);
            System.out.println(i+" row affected");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
