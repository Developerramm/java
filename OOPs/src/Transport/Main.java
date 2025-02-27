package Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("maruti","800",4,5,"automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        Motorcycle m = new Motorcycle("splender","Xline",2,"Circular","u");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
