package single_number;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    /**
     * This method uses extra memory since it uses a hashmap
     * @param nums array of ints where each int appears twice except one
     * @return single int appearing only once
     */
    public static int singleNumberHashMap(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>((nums.length / 2) + 1);

        // iterate through nums array and check each element if it exists in hashmap
        // if it does - remove this integer from hashmap; if it does not - add it to
        // hashmap. At the end of loop, the only remaining integer should be returned
        for(int i=0; i<nums.length; i++){
            if(hm.putIfAbsent(nums[i], nums[i]) != null) {
                hm.remove(nums[i]); 
            }
        }

        if(!hm.keySet().isEmpty()) return (int) hm.keySet().toArray()[0];
        else return -1;
    }

    /**
     * This method hopefully won't use any extra memory
     * @param nums array of ints where each int appears twice except one
     * @return single int appearing only once
     */
    public static int singleNumber(int[] nums) {
        
        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[args.length];

        if(arr.length==0){
            System.out.println("\n\nPlease add a list of ints as command line arguments " 
                + "to run this program. Sample command:\n\n"
                + "java Solution.java 1 2 3 3 2 1 4");
            System.out.println("\n");
            System.exit(0);
        }

        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        
        System.out.print("\nArray is ");
        System.out.println(Arrays.toString(arr)+"\n");
        System.out.print("Single number from array: ");
        System.out.println(Solution.singleNumberHashMap(arr));
        System.out.println("\n");
    }
}
