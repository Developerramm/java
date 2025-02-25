public class Main {
    public static void main(String[] args) {
//        System.out.println("Ram Kuamr");
//        System.out.println("Ram kumar maniyari sitamarhi");

        Student A = new Student();
        System.out.println("Setting object value");
        A.name = "Ram Kumar";
        A.id = 1;
        A.age = 30;
        A.numberOfSubject = 5;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.numberOfSubject);

        A.bunking();
        A.study();
        A.sleeping();

        Student B = new Student(2,29,"Raman",3);
        System.out.println(B.name);

        Student C = new Student(B);
        System.out.println(C.age);
        System.out.println(C.numberOfSubject);
    }
}
