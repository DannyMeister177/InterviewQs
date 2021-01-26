//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CoinTossProblem {
    private static boolean[] oddPowerOfTwo(int num){
        if (num%2 != 0) return new boolean[] {false, false};

        for (int i=0; i<num; i++){
            if (Math.pow(2,i)==num && i%2==0) return new boolean[] {true, false}; 
            if (Math.pow(2,i)==num && i%2!=0) return new boolean[] {true, true}; 
        }

        return new boolean[] {false, false};
    }


    public static void main(String[] args ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
         */

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        int n = Integer.parseInt(br.readLine());  
        CoinTossProblem tc = new CoinTossProblem();
        boolean[] result = tc.oddPowerOfTwo(n);

        System.out.println(1);
        System.out.println(2);


        
        // System.out.println(n);

    }
}