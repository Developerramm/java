package encapsulation;

public class App {

    public static void main(String[] args) {
        EncapsulationDemo ec = new EncapsulationDemo(1,20,5,"Ram kumar",true);

        System.out.println(ec.name);
//        System.out.println(ec.age);
        System.out.println(ec.numberOfSubject);

        ec.study();
        ec.bunk();
//        ec.gfChatting();
       boolean hasGf =  ec.getGF();
        System.out.println(hasGf);
        System.out.println(ec.getAge());
        ec.setAge(30);
        System.out.println(ec.getAge());
    }
}
