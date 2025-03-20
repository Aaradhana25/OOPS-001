
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car {
    public void charge() {
        System.out.println("Electric car is charging");
    }
}

public class MinheritII {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();  // Inherited from Vehicle
        electricCar.drive();  // Inherited from Car
        electricCar.charge(); // Defined in ElectricCar
        electricCar.stop();   // Inherited from Vehicle
    }
}
