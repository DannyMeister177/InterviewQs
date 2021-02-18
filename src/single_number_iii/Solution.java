package src.single_number_iii;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    /**
     * This method uses extra memory since it uses a hashmap
     * 
     * @param nums array of ints where each int appears twice except two
     * @return array of two ints appearing each only once
     */
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];

        for (int i : nums) {
            if(hm.containsKey(i)) hm.remove(i);
            else hm.put(i, 1);
        }

        int count = 0;
        for (Integer i : hm.keySet()) {
            ans[count++] = i;
        }
        return ans;
    }

    /**
     * This method  will solve this by sorting and thus is N*Log(N) time complexity.
     * @param nums array of ints where each int appears twice except two
     * @return array of two ints appearing each only once
     */
    public static int[] singleNumberNoXtraMemory(int[] nums) {
        int[] ans = new int[2];

        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);

        int n = nums.length;
        int ansIndex = 0;
        int curr=0;
        while(curr<n){
            if (curr == n - 1) ans[ansIndex] = numsSorted[curr++];
            else if(numsSorted[curr] != numsSorted[curr+1]) {
                ans[ansIndex++] = numsSorted[curr++];
            }
            else curr += 2;
        }

        return ans;
    }

    /**
     * This solution should use constant space and linear time complexity. It uses bit
     * masking and bitwise XOR ops to find the two ints appearing each once.
     * @param nums array of ints where each int appears twice except two
     * @return array of two ints appearing each only once
     */
    public static int[] singleNumberConstSpaceLinearTime(int[] nums){
        
        // first get XOR of nums
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }

        // now need to get mask where single bit is 1
        int mask = 1;
        while((mask&xor) == 0){
            mask <<= 1;
        }

        // Divide nums up into all integers that have a 1 bit in the position defined by 
        // mask and xor them all to get j which is first unique int to be returned. 
        // The second group would have 0 in this same position defined by mask and the xor 
        // of all these would yield k, the second unique number to return.
        int j = 0;
        int k = 0;
        for (int i : nums) {
            if((mask&i) == 0) j ^= i;
            else k ^= i;
        }

        return new int[]{j, k};
    }

    public static void main(String[] args){
        int[] arr = new int[args.length];

        if(arr.length==0){
            System.out.println("\n\nPlease add a list of ints "
                + "as command line arguments " 
                + "to run this program. \nAll values should appear exactly 2 times "
                + "except two values, which should appear exactly once each."
                +"\n\nSample command: "
                + "java Solution.java 1 1 2 3 3 5 4 2");
            System.out.println("\n");
            System.exit(0);
        }

        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        
        System.out.print("\nArray is ");
        System.out.println(Arrays.toString(arr)+"\n");
        System.out.print("Single numbers from array: ");
        System.out.println(Arrays.toString(singleNumberConstSpaceLinearTime(arr)));
        System.out.println("\n");
    }
}
