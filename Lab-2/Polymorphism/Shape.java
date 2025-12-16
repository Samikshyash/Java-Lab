/*Qn:​Modify​​the​​shape​​hierarchy​​from​​question​​1​​to​​demonstrate​
​polymorphism.​​Create​​an​​array​​of​​Shape​​objects​​and​​call​​their​​calculateArea()​​and​
​display()​​methods.​*/
package Polymorphism;

import java.util.Scanner;

public abstract class Shape {
    Scanner sc = new Scanner(System.in);

    abstract public void calculateArea();

    abstract public void display();

    abstract public void takeInput();
}

class Circle extends Shape {
    float radius;
    float area;


    public void takeInput() {
        System.out.println("Enter the radius of circle:");
        this.radius = this.sc.nextInt();
    }

    public void calculateArea() {
        this.area = (float) (Math.PI * this.radius * this.radius);
    }

    public void display() {
        System.out.println("Area of circle= " + this.area);
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;
    float area;

   

    public void takeInput() {
        System.out.println("Enter the length and breadth of rectangle:");
        this.length = this.sc.nextInt();
        this.breadth = this.sc.nextInt();
    }

    public void calculateArea() {
        this.area = (float) (this.length * this.breadth);
    }

    public void display() {
        System.out.println("area of rectangle is :" + this.area);
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (int i = 0; i < 2; i++) {
            shapes[i].takeInput();
            shapes[i].calculateArea();
            shapes[i].display();
        }

    }
}