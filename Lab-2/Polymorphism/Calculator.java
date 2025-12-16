package Polymorphism;

import java.util.Scanner;

public interface Calculator {
    public void addition(float a, float b);

    public void subtraction(float a, float b);

    public void multiplication(float a, float b);

    public void division(float a, float b);
}

class BasicCalculator implements Calculator {
    public void addition(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));

    };

    public void subtraction(float a, float b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    };

    public void multiplication(float a, float b) {
        System.out.println(a + "x" + b + "=" + (a * b));
    };

    public void division(float a, float b) {
        System.out.println(a + "/" + b + "=" + (a / b));
    };
}

class ScientificCalculator implements Calculator {
    public void addition(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));

    };

    public void subtraction(float a, float b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    };

    public void multiplication(float a, float b) {
        System.out.println(a + "x" + b + "=" + (a * b));
    };

    public void division(float a, float b) {
        System.out.println(a + "/" + b + "=" + (a / b));
    };

    public void exponential(float a, float b) {
        System.out.println(a + "^" + b + "=" + (Math.pow(a, b)));
    }
}

class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for basic calculator & 2 for scientific calculator");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Calculator basic = new BasicCalculator();
                basic.addition(10, 20);
                break;
            case 2:
                Calculator scientific = new ScientificCalculator();
                scientific.addition(20, 30);
            default:
                System.out.println("invalid choice");
                break;
        }
        sc.close();

    }
}