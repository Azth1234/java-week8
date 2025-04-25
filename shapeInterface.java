//20
// Interface
interface Shape {
    void getPerimeter();
}

// Rectangle class
class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getPerimeter() {
        System.out.println("--RECTANGLE--");
        double p = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle : " + p);
    }
}

// Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getPerimeter() {
        System.out.println("--CIRCLE--");
        double p = 2 * Math.PI * radius;
        System.out.println(" Perimeter of Circle(Circumference): " + p);
    }
}

// Triangle class
class Triangle implements Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getPerimeter() {
        System.out.println("--TRIANGLE--");
        double p = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle : " + p);
    }
}

// Main class
public class shapeInterface {
    public static void main(String[] args) {
        System.out.println("Name:Astha kiran");
		System.out.println("Roll:AV.SC.U4CSE24010");
		System.out.println("Class:CSE/A\n");
        
        Rectangle rect = new Rectangle(10, 5);
        Circle circ = new Circle(7);
        Triangle trian = new Triangle(3, 4, 5);

        rect.getPerimeter();
        circ.getPerimeter();
        trian.getPerimeter();
    }
}
