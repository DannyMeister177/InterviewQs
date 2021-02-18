package src.singlenumber;

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
     * This method won't use extra memory by using bitwise operations.
     * <br/><br/>
     * If we take XOR of zero and some bit, it will return that bit
     * <br/><br/>
     * a⊕0 = a, a⊕0=a
     * <br/><br/>
     * If we take XOR of two same bits, it will return 0
     * <br/><br/>
     * a⊕a=0
     * <br/><br/>
     * a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     * <br/><br/>
     * So we can XOR all bits together to find the unique number.
     * @param nums array of ints where each int appears twice except one
     * @return single int appearing only once
     */
    public static int singleNumber(int[] nums) {
        int a = 0;
        
        for(int i: nums){
            a ^= i;
        }
        return a;
    }

    public static void main(String[] args){
        int[] arr = new int[args.length];

        if(arr.length==0){
            System.out.println("\n\nPlease add a list of ints "
                + "as command line arguments " 
                + "to run this program.\n\nSample command: "
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
        System.out.println(Solution.singleNumber(arr));
        System.out.println("\n");
    }
}
