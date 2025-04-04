public class Exh1 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Can't divide by zero 🧮❌");
        }
    }
}
