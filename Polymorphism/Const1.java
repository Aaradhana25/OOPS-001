class Car {
    // Attributes (or properties) of the Car class
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String model, int year) {
        this.model = model;  // 'this' refers to the current object
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class Const {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota Corolla", 2020);
        Car car2 = new Car("Honda Civic", 2022);

        // Displaying details of each car
        car1.displayDetails();
        System.out.println("--------------------");
        car2.displayDetails();
    }
}
