import java.util.*;

public class PairwiseXORProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while(t-- > 0){

            System.out.println("Enter size of array:");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            long result = computeXORProduct(arr);

            System.out.println("Result: " + result);
        }

        sc.close();
    }

    // Function to compute product of XOR of all pairs
    public static long computeXORProduct(int[] arr){

        long mod = (long)1e9 + 7;
        long ans = 1;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                ans = (ans * (arr[i] ^ arr[j])) % mod;

                if(ans == 0){
                    return 0; // early break optimization
                }
            }
        }

        return ans;
    }
}