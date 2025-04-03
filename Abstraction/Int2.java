interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with a key!");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a kick!");
    }
}

public class Int2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        myCar.start();
        myBike.start();
    }
}
