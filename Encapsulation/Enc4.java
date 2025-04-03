class Laptop {
    private final String brand;

    // Constructor to initialize brand
    public Laptop(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

public class Enc4 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Apple");
        System.out.println("Laptop Brand: " + myLaptop.getBrand());

        // myLaptop.brand = "Dell"; // ❌ Not allowed! Brand is final.
    }
}
