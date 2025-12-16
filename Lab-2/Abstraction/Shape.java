//Program to implement abstraction using 'abstract' class.
package Abstraction;

import java.util.Scanner;

abstract class Shape {
    Scanner sc = new Scanner(System.in);

    abstract void takeInput();

    abstract void calculateArea();

    abstract void display();

}

class Circle extends Shape {

    int radius;
    float area;

    @Override
    public void takeInput() {
        System.out.println("Enter the radius of circle:");
        radius = sc.nextInt();

    }

    @Override

    public void calculateArea() {
        area = (float) (Math.PI * radius * radius);

    }

    @Override

    public void display() {
        System.out.println("Area of circle= " + area);

    }
}

class Rectangle extends Shape {
    int length;
    int breadth;
    float area;
    @Override

    public void takeInput() {
        System.out.println("Enter the length and breadth of rectangle:");
        length = sc.nextInt();
        breadth = sc.nextInt();

    }
    @Override

    public void calculateArea() {
        area = length * breadth;
    }
    @Override

    public void display() {
        System.out.println("area of rectangle is :" + area);

    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.takeInput();
        c.calculateArea();
        c.display();
        Rectangle r = new Rectangle();
        r.takeInput();
        r.calculateArea();
        r.display();

    }
}