package Transport;

public class Vehicle {
    public String name;
    public String model;
    public  int numberOfTyres;

    // constructor
    public Vehicle(){
        System.out.println("Default constructor ");
    }
    public Vehicle(String name, String model, int numberOfTyres) {
        System.out.println("parameterized constructor");
        this.name = name;
        this.model = model;
        this.numberOfTyres = numberOfTyres;
    }

    void startEngine(){
        System.out.println("Engine is starting "+ this.name + " " + this.model);
    }

    void stopEngine(){
        System.out.println("Engine is stopping " + this.name + " " + this.model);
    }
}
