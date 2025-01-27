package ControlFlow;

public class ControlFlow1 {
    public static void main(String[] args) {
        System.out.println("Control flow statement part 2");

        int arr[] = {10,20,30,40,50};
        System.out.println(arr.length);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
