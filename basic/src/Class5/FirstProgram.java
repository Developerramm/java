package Class5;

public class FirstProgram {
    static String name = "Ram Kumar";
    int age = 30;
    int numberOfSubject = 5;

    public static void main(String[] args) {
        System.out.println("Java Class 5");
        System.out.println("Now We learn String");

        FirstProgram obj  = new FirstProgram();
        System.out.println(obj.name);
        obj.name = "Maniyari";
        System.out.println(obj.name);
        print();
        int val = 10;
        System.out.println(val);
    }

    public  static  void print(){
        int val  = 20;
        FirstProgram obj = new FirstProgram();
        System.out.println("name in print method " + obj.name);
        System.out.println("Your age ");
        System.out.println(obj.age);
        System.out.println("Number of subject ");
        System.out.println(obj.numberOfSubject);
        System.out.println(val);
    }
}
