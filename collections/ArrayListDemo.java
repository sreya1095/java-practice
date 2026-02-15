import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Shreya");
        names.add("Asha");
        names.add("Ravi");

        System.out.println("Names: " + names);

        names.remove("Asha");

        System.out.println("After removal: " + names);

        System.out.println("First name: " + names.get(0));
    }
}
