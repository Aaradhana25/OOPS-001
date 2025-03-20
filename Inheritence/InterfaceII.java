// Interface 1: Machine
interface Machine {
    void start();
    void stop();
}

// Interface 2: Electric
interface Electric {
    void charge();
}

// Child Class (Implements both Machine and Electric interfaces)
class ElectricCar implements Machine, Electric {
    public void start() {
        System.out.println("Electric Car is starting");
    }

    public void stop() {
        System.out.println("Electric Car is stopping");
    }

    public void charge() {
        System.out.println("Electric Car is charging");
    }
}

public class InterfaceII {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.start();  // Implemented from Machine interface
        car.stop();   // Implemented from Machine interface
        car.charge(); // Implemented from Electric interface
    }
}
