package ControlFlow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Control flow statement in java ");
        System.out.println("Ram Kumar");
        String name = "Ram Kumar";
        boolean isProgrammer = true;
        if(isProgrammer){
            System.out.println(name + " is a serious programmer");
        }
        int number = 10;
        if(number > 5){
            System.out.println("Number is greater ");
        }else {
            System.out.println("Number is not greater ");
        }

        int mark  = 89;

        if(mark > 90 && mark <= 100){
            System.out.println("You got A++");
        } else if (mark >80 && mark <= 90) {
            System.out.println("Your grade is A ");
        } else if (mark > 70 && mark <= 80) {
            System.out.println("You got B++");
        } else if (mark >60 && mark <= 70) {
            System.out.println("Your grade is B");
        }else{
            System.out.println("You are general student");
        }
    }
}
