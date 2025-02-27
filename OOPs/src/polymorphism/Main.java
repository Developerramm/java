package polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(10,20));
//        System.out.println(c.add(10,20,30));
//        System.out.println(c.add(10,20,30,40.40));

        Circle c = new Circle();
        c.draw();

        doDrawingStuff(new Shape());
        doDrawingStuff(new Circle());

//        Rect r = new Rect();
//        r.draw();
    }

    public static void doDrawingStuff(Shape a){
        a.draw();
    }
}
