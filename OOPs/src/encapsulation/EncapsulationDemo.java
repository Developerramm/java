package encapsulation;

public class EncapsulationDemo {
    public int id;
    private int age;
    public int numberOfSubject;
    public String name;
    private boolean gf;

    // constructor
    public EncapsulationDemo(){
        System.out.println("Default constructor ");
    }

    // parameterized constructor
    public EncapsulationDemo(int id,int age,int numberOfSubject,String name,boolean gf){
        this.id = id;
        this.age = age;
        this.numberOfSubject = numberOfSubject;
        this.name = name;
        this.gf = gf;
    }

    public boolean getGF(){
        return this.gf;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age < 100)
            this.age = age;
        return;
    }

    public void study(){
        System.out.println(name + " studying");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    private void gfChatting(){
        System.out.println(name + " Chatting with gf ");
    }

}
