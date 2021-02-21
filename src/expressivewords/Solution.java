package src.expressivewords;

import java.util.Arrays;

public class Solution {

    public static int expressiveWords(String s, String[] words) {
        int stretchyCount = 0;

        // first find regex pattern that will be used to test each word in words
        // on whether its is stretchy or not.
        StringBuilder regexBuilder = new StringBuilder("");
        int start = 0;
        int end = 1;
        while(end<=s.length()){
            if(end<s.length() && s.charAt(start) == s.charAt(end)) {
                end++;
            }
            else if(end - start >= 3) {
                regexBuilder.append("[" + s.charAt(start) + "]{1,");
                regexBuilder.append((end - start) + "}+");
                start = end;
                end++;
            }
            else {
                regexBuilder.append(s.substring(start, end));
                start = end;
                end++;
            }
        }

        String stretchyRegex = regexBuilder.toString();
        // now iterate through each word in words[] and count number of stretchy words
        for (String string : words) {
            if(string.matches(stretchyRegex)) stretchyCount++;
        }

        return stretchyCount;
    }

    public static void main(String[] args){
 
        if(args.length==0){
            System.out.println("\n\nSample command line args: "
                + "java Solution.java helllooo helo hello");
            System.out.println("\n");
            System.exit(0);
        }

        String sTest = args[0];
        String[] wordsTest = Arrays.copyOfRange(args, 1, args.length);
        
        System.out.print("\nString is ");
        System.out.println(sTest+"\n\n");
        System.out.print("\nArray is ");
        System.out.println(Arrays.toString(wordsTest)+"\n");

        System.out.print("Number of Stretchy strings: ");
        System.out.println(expressiveWords(sTest, wordsTest));
        System.out.println("\n");
    }
}
