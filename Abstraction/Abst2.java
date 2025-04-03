abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    public void start() {
        System.out.println(brand + " Car is starting with a key! 🚗");
    }
}

public class Abst2.java {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.showBrand();
        myCar.start();
    }
}
