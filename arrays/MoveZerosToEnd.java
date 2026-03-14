import java.util.*;

public class MoveZerosToEnd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for(int i=0;i<n;i++){

            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }

        }

        while(index < n){
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
