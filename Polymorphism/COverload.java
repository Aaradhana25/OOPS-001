
class Rectangle {
    int length, width;

 
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

  
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class COverload {
    public static void main(String[] args) {
        // Creating object using the first constructor (no parameters)
        Rectangle rect1 = new Rectangle();
        rect1.area();  // Output: Area of Rectangle: 1

        // Creating object using the second constructor (with parameters)
        Rectangle rect2 = new Rectangle(5, 10);
        rect2.area();  // Output: Area of Rectangle: 50
    }
}
