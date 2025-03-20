
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}


class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

public class SinheritII {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Method from parent class
        car.drive();  // Method from child class
    }
}
