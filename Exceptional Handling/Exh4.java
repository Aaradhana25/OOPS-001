public class Exh4 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(10 / 0);  // ArithmeticException
            System.out.println(arr[4]);  // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught an Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an Array Index issue");
        }
    }
}
