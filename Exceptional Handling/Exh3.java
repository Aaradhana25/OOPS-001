public class Exh3 {
    public static void main(String[] args) {
        try {
            String str = "hello123";
            int num = Integer.parseInt(str); // invalid format
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("You can't convert alphabets to numbers");
        }
    }
}
