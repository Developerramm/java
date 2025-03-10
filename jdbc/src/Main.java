
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "ramkumar";
        String query = "SELECT * FROM students";

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database connection successful");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String city = rs.getString("city");

                System.out.println(id + " " + name + " " + age + " " + city);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}