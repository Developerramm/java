package Transport;

public class Car extends Vehicle{
    public  int numberOfDoors;
    public String transmissionType;

    //constructor
    public Car(){
        System.out.println("Default constructor for car");
    }

    public Car(int numberOfDoors, String transmissionType) {
        System.out.println("Constructor for only car object");
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }

    public Car(String name, String model, int numberOfTyres, int numberOfDoors, String transmissionType) {
        super(name, model, numberOfTyres);
        System.out.println("Constructor for car and vehicle object");
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }

    public  void startAC(){
        System.out.println("AC started of " + name);
    }

}
