interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v;

        v = new Bike();
        v.start();

        v = new Car();
        v.start();
    }
}
