class StudentDetails {
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();

        s.setName("Sreya");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
