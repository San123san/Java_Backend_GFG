import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) throws SQLException {

//        Eastablish connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical_gfg ", "root", "Password12345");

//        create statement
        Statement statement = connection.createStatement();

//        Execute statement
        statement.execute("CREATE TABLE example(id INT Primary Key, name VARCHAR(20))");

        System.out.println("Table Create Successfully");
    }
}
