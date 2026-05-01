import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int maxLength = 0;

        for(int num : set){

            // check if it's a starting point
            if(!set.contains(num - 1)){

                int current = num;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = longestConsecutive(arr);

        System.out.println("Longest consecutive sequence length: " + result);

        sc.close();
    }
}