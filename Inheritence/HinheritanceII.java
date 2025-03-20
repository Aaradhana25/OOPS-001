
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape {
    public void drawCircle() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    public void drawSquare() {
        System.out.println("Drawing a Square");
    }
}

public class HinheritanceII {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();      // Inherited from Shape
        circle.drawCircle(); // Defined in Circle

        Square square = new Square();
        square.draw();      // Inherited from Shape
        square.drawSquare(); // Defined in Square
    }
}
