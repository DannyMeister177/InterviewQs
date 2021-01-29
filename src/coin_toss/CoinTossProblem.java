package coin_toss;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoinTossProblem {
    public static void main(String[] args ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mod3 = Integer.parseInt(br.readLine()) % 3;

        if(mod3==0){
            System.out.println(2);
        }
        else{
            System.out.println(1);
            System.out.println(mod3);
        }
    }
}