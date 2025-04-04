import java.io.FileWriter;
import java.io.IOException;

public class Pkg2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Java is awesome");
            writer.close();
            System.out.println("Successfully wrote to the file!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
