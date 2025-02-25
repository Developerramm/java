public class Student {
    // attribute
    public  int id;
    public  int age;
    public String name;
    public int numberOfSubject;

    // constructor default
    public  Student(){
        System.out.println("This is student default constructor ");
    }

    // parameterizised constructor
    public Student(int id,int age,String name,int numberOfSubject){
        System.out.println("Parameterzied constructor here ");
        this.id = id;
        this.age = age;
        this.name = name;
        this.numberOfSubject = numberOfSubject;
    }

    public Student(Student sc){
        this.id = sc.id;
        this.age = sc.age;
        this.name = sc.name;
        this.numberOfSubject = sc.numberOfSubject;
    }

    // method or behaviour

    public  void  study(){
        System.out.println(name + " Studying");
    }

    public  void  sleeping(){
        System.out.println(name + " sleeping");
    }

    public  void  bunking(){
        System.out.println(name + " bunking");
    }

}
