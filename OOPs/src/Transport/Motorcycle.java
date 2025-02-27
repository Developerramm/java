package Transport;

public class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    // constructor
    public Motorcycle(){
        System.out.println("default constructor for motorcycle");
    }

    public Motorcycle(String handleBarStyle, String suspensionType) {
        System.out.println("constructor only for motorcycle");
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public Motorcycle(String name, String model, int numberOfTyres, String handleBarStyle, String suspensionType) {
        super(name, model, numberOfTyres);
        System.out.println("constructor for motorcycle and vehicle");
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("Motorcycle is doing wheeling " +name);
    }
}
