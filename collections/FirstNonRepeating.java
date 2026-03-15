import java.util.*;

class FirstNonRepeating {

    public static void main(String[] args) {

        int[] nums = {4,5,1,2,0,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequency
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        // find first non-repeating
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == 1){
                System.out.println("First non-repeating element: " + nums[i]);
                return;
            }
        }

        System.out.println("No non-repeating element");
    }
}