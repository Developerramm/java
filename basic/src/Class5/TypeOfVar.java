package Class5;

public class TypeOfVar {
    static String name = "Ram Kumar";

    public static void main(String[] args) {
        TypeOfVar obj = new TypeOfVar();
        System.out.println(obj.name);
        TypeOfVar obj1 = new TypeOfVar();
        obj1.name = "Maniyari";
        System.out.println(obj.name);
        System.out.println(obj1.name);

        System.out.println(TypeOfVar.name);
        TypeOfVar.name = "Ram kumar Maniyari";
        System.out.println(TypeOfVar.name);
        //printName();
    }

    public void printName(){
        System.out.println("What is your name ");
        System.out.println(TypeOfVar.name);
    }
}
