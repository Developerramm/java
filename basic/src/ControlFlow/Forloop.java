package ControlFlow;

public class Forloop {
    public static void main(String[] args) {

        System.out.println("For loop in java");
        int arr[] = new int[5];
        int a = 20;
        for(int i = 0; i<= 4; i++){
            arr[i] = 20;
        }

        System.out.println(arr[0]);

        System.out.println("Printing element in java ");

        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println();

        for(int i = 1; i<= 100; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing table of 5");

        for(int i = 1; i<= 10; i++){
            System.out.println(5 + " * " + i + " = " + 5 * i);
        }
    }
}
