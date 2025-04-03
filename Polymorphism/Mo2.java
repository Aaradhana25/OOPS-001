class Display {
    // Method to display integer
    void show(int num) {
        System.out.println("Integer: " + num);
    }

    // Overloaded method to display string
    void show(String str) {
        System.out.println("String: " + str);
    }
}

public class Mo2 {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(100);        // Calls the integer version
        d.show("Hello!");   // Calls the string version
    }
}
