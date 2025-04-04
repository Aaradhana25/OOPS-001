import java.util.Random;

public class Pkg4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100); // random number from 0 to 99
        System.out.println("Your lucky number is: " + randomNumber);
    }
}
