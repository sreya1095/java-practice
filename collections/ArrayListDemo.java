import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List: " + list);

        list.remove("Banana");

        System.out.println("After removing Banana: " + list);

        System.out.println("Contains Apple? " + list.contains("Apple"));
    }
}
