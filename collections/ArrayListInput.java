import java.util.*;

public class ArrayListInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 numbers: ");

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        System.out.println("Numbers entered: " + list);
    }
}
