package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCConnectionDemo {

    public static void  CreateConnection()throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "ram12345";
        String query = "SELECT * FROM students ORDER BY id DESC;";
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
            result.close();
            stm.close();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public  void insertData()throws ClassNotFoundException{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = input.nextLine();
        System.out.println("Enter Your Job title : ");
        String job_title = input.nextLine();
        System.out.println("Enter Your Salary : ");
        double salary = input.nextDouble();
        System.out.println("Enter Your id : ");
        int id = input.nextInt();


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        String userInput = id + ","+name + "," + job_title + "," + salary;
        String query = "INSERT INTO students(name,job_title,salary) values (" + userInput + ");";
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "ram12345";
        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database connection successful");
            Statement stm = conn.createStatement();
            int result = stm.executeUpdate(query);
            if(result > 0){
                System.out.println("Data is added");
            }else{
                System.out.println("Insertion failed");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}