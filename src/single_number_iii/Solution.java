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
    public static int[] singleNumber(int[] nums) {
        
        return new int[2];
    }

    /**
     * This method won't use extra memory. It will solve this by sorting and thus is
     * N*Log(N) time complexity.
     * @param nums array of ints where each int appears thrice except one
     * @return single int appearing only once
     */
    public static int[] singleNumberNoXtraMemory(int[] nums) {
        int[] ans = new int[2];

        // first get XOR(nums)
        int numsXOR = 0;
        for(int i=0; i<nums.length; i++){
            numsXOR ^= nums[i];
        }

        int a = nums[0];
        int b = nums[1];
        for(int i=2; i<nums.length; i++){
            i =1;
        }

        return ans;
    }

    /**
     * This solution should use constant space and linear time complexity. Will probably
     * use some sort of bitwise manipulation.
     * @param nums
     * @return
     */
    public static int[] singleNumberConstSpaceLinearTime(int[] nums){
        // TODO: find this solution which probably involves bitwise ops.
        return 0;
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
