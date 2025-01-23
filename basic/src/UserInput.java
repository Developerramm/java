import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("How to take user input in java");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Enter your age ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);
        System.out.println("Enter your village name ");
        String village = input.nextLine();
        System.out.println("Your village name is " + village);

        input.close();

    }
}
