package polymorphism;

public class Calculator {

    public Calculator(){
        System.out.println("Default constructor ");
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    double add(int a, int b, int c, double d){
        return a + b + c + d;
    }

}
