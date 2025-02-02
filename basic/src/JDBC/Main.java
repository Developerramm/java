package JDBC;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DBConnection obj = new DBConnection();
        /*try{
            obj.dbConnection();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }*/


        // insert data in database using jdbc
        try{
            obj.updateData();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
