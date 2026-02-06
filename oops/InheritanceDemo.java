class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;
    String branch;

    Student(String name, int age, int rollNo, String branch) {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student("Sreya", 20, 101, "CSE");
        s.display();
    }
}
