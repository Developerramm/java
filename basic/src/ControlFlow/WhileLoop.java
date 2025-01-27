package ControlFlow;

public class WhileLoop {
    public static void main(String[] args) {

        int num = 5;

        int count = 1;
        while(count <= num){
            int col = 1;
            while(col<= count){
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            count = count + 1;
        }
    }
}
