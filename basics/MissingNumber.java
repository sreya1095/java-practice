import java.util.*;

public class MissingNumber {

    public static int missingNumber(int[] nums){

        int n = nums.length;

        int xor = 0;

        // XOR all indices
        for(int i = 0; i <= n; i++){
            xor ^= i;
        }

        // XOR array elements
        for(int i = 0; i < n; i++){
            xor ^= nums[i];
        }

        return xor;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);

        System.out.println("Missing number: " + result);
    }
}