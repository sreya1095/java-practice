import java.util.*;

public class LongestEqualZeroOneSubarray {

    public static int findMaxLength(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        // important initialization
        map.put(0, -1);

        for(int i = 0; i < arr.length; i++){

            // convert 0 → -1
            if(arr[i] == 0){
                sum -= 1;
            } else {
                sum += 1;
            }

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (0/1):");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = findMaxLength(arr);

        System.out.println("Longest Length: " + result);

        sc.close();
    }
}