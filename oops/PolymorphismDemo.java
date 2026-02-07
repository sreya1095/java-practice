// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {

        // Parent reference, child object
        Animal a;

        a = new Dog();   // runtime decides Dog's sound()
        a.sound();

        a = new Cat();   // runtime decides Cat's sound()
        a.sound();
    }
}
