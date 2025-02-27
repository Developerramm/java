package AbstractDesign;

abstract class Bird{
    abstract void fly();
    abstract void eat();
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating ");
    }
}

class Crow extends Bird{

    @Override
    void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    void eat() {
        System.out.println("Crow is eating ");
    }
}

public class Main {

    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
    }


    public static void main(String[] args) {
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();

//        b = new Crow();
//        b.fly();
//        b.eat();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
