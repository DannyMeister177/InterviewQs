package fizz_buzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            boolean multipleOf3 = i%3==0;
            boolean multipleOf5 = i%5==0;
            if(multipleOf3 && multipleOf5) ans.add("FizzBuzz");
            else if(multipleOf3) ans.add("Fizz");
            else if (multipleOf5) ans.add("Buzz");
            else ans.add(Integer.toString(i));
        }

        return ans;
    }

    public static void main(String[] args){
        for (String string : args) {
            System.out.println("\n\nn = "+string+"\n\n"
            + fizzBuzz(Integer.parseInt(string))+"\n\n");
        }
    }
}
