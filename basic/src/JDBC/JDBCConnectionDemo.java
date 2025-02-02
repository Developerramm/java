package JDBC;

import java.sql.*;
public class JDBCConnectionDemo {
    public static void main(String[] args)throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "ram12345";

        String query = "SELECT * FROM students;";
        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database connection successful");
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
               int id = result.getInt("id");
               String name = result.getString("name");
               String jobTitle = result.getString("job_title");
               double salary = result.getDouble("salary");
                System.out.println(id + " " +  name + " " + jobTitle + " " + salary);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}