package Abstraction;
//using interface to implement abstraction
public interface Shape1 {
    public void calculateArea();

    public void display();

}

class Circle1 implements Shape1 {
    float area;
    int radius;

    public Circle1(int radius) {
        this.radius = radius;
    }

    @Override

    public void calculateArea() {
        area = (float) (Math.PI * radius * radius);

    }

    @Override

    public void display() {
        System.out.println("the area of circle is :" + area);
    }
}

class Rectangle1 implements Shape1 {
    float area;
    float l, b;

    public Rectangle1(float l, float b) {
        this.l = l;
        this.b = b;
    }

    @Override

    public void calculateArea() {
        area = l * b;
    }

    @Override

    public void display() {
        System.out.println("Area of rectangle is :" + area);
    }
}

class Main1 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(5);
        c1.calculateArea();
        c1.display();

        Rectangle1 r1 = new Rectangle1(1, 12);
        r1.calculateArea();
        r1.display();

    }
}