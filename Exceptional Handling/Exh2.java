public class Exh2 {
    public static void main(String[] args) {
        try {
            int[] nums = {10, 20, 30};
            System.out.println(nums[5]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That index doesn’t exist");
        }
    }
}
