class MathUtils {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Mo1 {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(5, 10));      // Calls the first add method
        System.out.println(mu.add(5, 10, 15));  // Calls the overloaded add method
    }
}
