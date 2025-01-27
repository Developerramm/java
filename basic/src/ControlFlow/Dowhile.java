package ControlFlow;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("Do while loop in java ");
        System.out.println("printing counting using do while loop");
        int number = 1;
        do {
            System.out.print(number + " ");
            if(number == 40 || number == 80){
                System.out.println();
            }
            number = number + 1;
        }while(number <= 100);

        System.out.println();

        System.out.println("print table of 5 using do while loop");
        int i = 1;
        do{
            System.out.println(5 + " * " + i + " = " + 5 * i);
            i = i + 1;
        }while(i <= 10);
    }
}
