package roman_to_integer;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

class Solution {

    interface LambdaFunc{
        int run(String xx, int i);
    }

    public static int romanToInt(String s) {
        /* Init int array to hold resulting ints
         * Init hashmap String: int with roman numeral to int conversions  
        */
        int len = s.length();
        int[] intArr = new int[len];
        HashMap<String, Integer> map = new HashMap<>(13); 
        // fill hashmap with roman numeral to int mappings
        {
            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);
            map.put("IV", 4);
            map.put("IX", 9);
            map.put("XL", 40);
            map.put("XC", 90);
            map.put("CD", 400);
            map.put("CM", 900);
            // the next few mappings are to simplify the code below
            map.put("II", 2);
            map.put("XX", 20);
            map.put("CC", 200);
        }

        // len >=3 init a pattern and matcher
        Pattern p = Pattern.compile("[IXC]");

        // helper lambda function
        LambdaFunc xxToInt = (xx, i) -> {
            boolean rightMatches = p.matcher(s.substring(i+1, i+2)).matches();
            if(map.containsKey(xx)) {
                intArr[i] = map.get(xx);
                return i+2;
            }
            else if(!rightMatches){
                intArr[i] = map.get(xx.substring(0,1)) + map.get(xx.substring(1, 2));
                return i+2;
            }
            else {
                intArr[i] = map.get(xx.substring(0,1));
                return i+1;
            }
        };

        // cycle through string s looking at 3 letters at a time
        for(int i=0; i<len;){
            // check if we're at last remaining substring of length=1
            if(len-i == 1){
                intArr[i] = map.get(s.substring(i,i+1));
                break;
            }
            
            // else process this two digit substring xx
            i = xxToInt.run(s.substring(i, i+2), i);
        }

        return IntStream.of(intArr).sum();
    }

    public static void main(String[] args){
        
        for (String string : args) {
            System.out.println(string+" = "+romanToInt(string));
        }
    }
}
