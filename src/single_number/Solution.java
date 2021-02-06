package single_number;

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

        for (Integer i : hm.keySet()) {
            return i;
        }

        return -1;
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
        System.out.println("hello world");
        System.out.println("Getting single number from array:");
        System.out.println(Solution.singleNumberHashMap(new int[] {5, 10, 2, 10, 5, 4, 2, 4}));
    }
}
