class Parent {
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is Child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}
