interface Shape {
    void draw();
    double getArea();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public void draw() {
        System.out.println("Drawing a Circle!");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Int3 {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5);
        myCircle.draw();
        System.out.println("Area: " + myCircle.getArea());
    }
}
