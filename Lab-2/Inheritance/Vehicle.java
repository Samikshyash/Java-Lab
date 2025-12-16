package Inheritance;

public class Vehicle {
    public void start() {
        System.out.println("vehicle is starting ");

    }

    public void applyBrake() {
        System.out.println("Vehicle: Applying Brakes ");

    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void applyBrake() {
        System.out.println("Car:Applying brakes");
    }

}

class Motorcycle extends Vehicle {
    public void start() {
        System.out.println("Motorcycle is starting");

    }

    public void applyBrake() {
        System.out.println("Motorcycle: Applying brakes");

    }
}

class Main1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        v.start();
        v.applyBrake();
        c.start();
        c.applyBrake();
        m.start();
        m.applyBrake();
    }
}