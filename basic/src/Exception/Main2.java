package Exception;

import java.util.Scanner;

public class Main2 {
    public static   void divisiondemo(int dividend,int divisor) throws  ArithmeticException{
        System.out.println("The result is " + dividend / divisor);
    }
    public static void main(String[] args) {

        divisiondemo(10,0);

        System.out.println("Exception handling here ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("Sorry You are not eligible ");
            throw new RuntimeException("Sorry Can't vote!!!");
        }else {
            System.out.println("You are eligible ");
        }
    }
}
