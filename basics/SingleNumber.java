import java.util.*;

public class SingleNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for(int i = 0; i < n; i++){
            result ^= arr[i];
        }

        System.out.println("Single number: " + result);
    }
}