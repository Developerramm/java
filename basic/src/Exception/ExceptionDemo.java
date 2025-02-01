package Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Exception handling here ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor ");
        int divisor = sc.nextInt();

        try{
            int result = dividend / divisor;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Divisor can't be zero ");
            System.out.println(e.getMessage());
            System.out.println("Number is not divisible by zero ");
            System.out.println("Please enter a valid number ");
        }
        System.out.println("print here ");

    }
}
