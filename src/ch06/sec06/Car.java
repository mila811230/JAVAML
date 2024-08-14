package ch06.sec06;

public class Car {
    static int maxSpeed;
    String company;
    String model;
    String color;
    boolean start;
    int speed;

    public static void setMaxSpeed(int value) {
        maxSpeed = value;
    }

    public void setMaxSpeed2(int value) {
        maxSpeed = value;
        speed = value - 10;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this("기아자동차", 33);
    }

    public Car(String company) {
        this(company, 33);
    }

    public Car(int speed) {
        this("기아자동차", speed);
    }

    public Car(String company, int speed) {
        this.speed = speed;
        this.company = company;
    }
}