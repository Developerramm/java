package JDBC;
import java.sql.*;
import java.util.Scanner;

public class DBConnection {
    public void dbConnection() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "ram12345";
        String query = "SELECT * FROM users;";

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("DB Connection Create Successfully");
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String job_title = result.getString("job_title");
                double salary = result.getDouble("salary");
                System.out.println(id + " " + name + " " + job_title + " " + salary);
            }
            result.close();
            stm.close();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public  void updateData() throws ClassNotFoundException{
        Scanner input = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "ram12345";
        String query = "insert into users(name,job_title,salary) values (?,?,?);";

        System.out.println("Enter Your name : ");
        String name = input.nextLine();
        System.out.println("Enter your job title : ");
        String job_title = input.nextLine();
        System.out.println("Enter Your salary : ");
        double salary = input.nextDouble();

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1,name);
            pstmt.setString(2,job_title);
            pstmt.setDouble(3,salary);

            int result = pstmt.executeUpdate();
            if(result > 0){
                System.out.println("Data inserted ");
                dbConnection();
            }else {
                System.out.println("Data does not inserted");
            }
            pstmt.close();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    
}
