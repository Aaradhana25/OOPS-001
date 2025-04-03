class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    // Overriding the drive method
    @Override
    void drive() {
        System.out.println("Car is driving safely");
    }
}

public class Mor2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle c = new Car();  // Polymorphism: Vehicle reference to Car object

        v.drive();  // Calls Vehicle's drive method
        c.drive();  // Calls Car's overridden drive method
    }
}
