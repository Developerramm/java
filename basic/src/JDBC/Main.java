package JDBC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionDemo obj = new JDBCConnectionDemo();
      /*  try{
            obj.CreateConnection();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }*/

        try{
            obj.insertData();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
