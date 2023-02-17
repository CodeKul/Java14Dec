package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java14dec",
                            "root7","password");

            Scanner scanner = new Scanner(System.in);
            int id;
            String name;
            String address;
            System.out.println("Enter id,name");
            id = scanner.nextInt();
            name = scanner.next();
//            address = scanner.next();

            String insert = "insert into employee(id,name,address) values(?,?,?)";
            String update = "update employee set name = ? where id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
//            preparedStatement.setString(3,address);

            int i =  preparedStatement.executeUpdate();
            System.out.println(i+" row affected");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
