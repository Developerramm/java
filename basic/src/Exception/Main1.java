package Exception;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Nexted try catch exception handling");

        int arr[] = new int[5];
        try{
            System.out.println("I am in first try block");
            arr[4] = 10;
            try{
                System.out.println("nested try block here ");
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
