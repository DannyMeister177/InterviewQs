package src.expressivewords;

import java.util.Arrays;

public class Solution {

    public static int expressiveWords(String S, String[] words) {
        return 0;
    }
     


    public static void main(String[] args){

        if(args.length==0){
            System.out.println("\n\nPlease add a list of ints "
                + "as command line arguments " 
                + "to run this program.\n\nSample command: "
                + "java Solution.java 1 2 3 3 2 1 4");
            System.out.println("\n");
            System.exit(0);
        }

        String s = args[0];
        String[] arr = Arrays.copyOfRange(args, 1, args.length-1);
        
        System.out.print("\nArray is ");
        System.out.println(Arrays.toString(arr)+"\n");
        System.out.print("# of Expressive Words from array: ");
        System.out.println(Solution.expressiveWords(s, arr));
        System.out.println("\n");
    }
}
