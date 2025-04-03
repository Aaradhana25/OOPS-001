abstract class Shape {
    abstract double getArea();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Abst3 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        myCircle.display();
        System.out.println("Area: " + myCircle.getArea());
    }
}
