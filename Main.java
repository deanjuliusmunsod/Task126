
// Base class: Vehicle
class Vehicle {
    // Attributes for the Vehicle class
    private String make;
    private String model;
    private int year;

    // Constructor for the Vehicle class
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods for the Vehicle attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Derived class: Car that extends Vehicle
class Car extends Vehicle {
    // Additional attribute for the Car class
    private int numberOfDoors;

    // Constructor for the Car class
    public Car(String make, String model, int year, int numberOfDoors) {
        // Call the constructor of the Vehicle class
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display the car's details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class to test the Car class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Call the displayDetails method to print car details
        myCar.displayDetails();
    }
}
