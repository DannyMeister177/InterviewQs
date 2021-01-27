import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoinTossProblem {

    private static boolean isInt(double a) {
        return (a==Math.floor(a) && !Double.isInfinite(a));
    }

    public static void main(String[] args ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // get log_2(N) and N%3
        // double power = Math.log(n) / Math.log(2); 
        int mod3 = n % 3;

        // 
        // if(isInt(power)){
        //     System.out.println(1);
        //     System.out.println(mod3);
        // }
        if(mod3==0){
            System.out.println(2);
        }
        else{
            System.out.println(1);
            System.out.println(mod3);
        }
    }
}