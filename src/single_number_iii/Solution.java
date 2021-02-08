package single_number_iii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
    /**
     * This method uses extra memory since it uses a hashmap
     * 
     * @param nums array of ints where each int appears thrice except one
     * @return single int appearing only once
     */
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>((nums.length / 2) + 1);

        // iterate through nums array and store each unique int as a key mapped to the
        // count
        // of how many times it is stored in the array nums
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() < 3) return entry.getKey();
        }

        return -1;
    }

    /**
     * This method won't use extra memory.  
     * @param nums array of ints where each int appears thrice except one
     * @return single int appearing only once
     */
    public static int singleNumberNoXtraMemory(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int value : nums) {
            ones = (ones ^ value) & ~twos;
            twos = (twos ^ value) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args){
        int[] arr = new int[args.length];

        if(arr.length==0){
            System.out.println("\n\nPlease add a list of ints "
                + "as command line arguments " 
                + "to run this program. \nAll values should appear exactly 3 times "
                + "except one value, which should appear exactly once."
                +"\n\nSample command: "
                + "java Solution.java 1 1 2 3 3 2 1 3 4 2");
            System.out.println("\n");
            System.exit(0);
        }

        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        
        System.out.print("\nArray is ");
        System.out.println(Arrays.toString(arr)+"\n");
        System.out.print("Single number from array: ");
        System.out.println(Solution.singleNumberNoXtraMemory(arr));
        System.out.println("\n");
    }
}
