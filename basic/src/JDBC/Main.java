package JDBC;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionDemo obj = new JDBCConnectionDemo();
        try{
            obj.CreateConnection();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
