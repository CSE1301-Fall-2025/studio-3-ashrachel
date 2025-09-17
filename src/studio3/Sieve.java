import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        int val = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers you want to test?");
        int n = in.nextInt();
        int[] num = new int[n];
          boolean Prime[] = new boolean[n+1];
        for(int a = 0; a <= n; a++){
            Prime[a] = true;
        }
        for(int i = 0; i <= n; i++){
            num [i] = val;
            val++;
            for(int multiple = i * i; multiple <=n; multiple += i){
                Prime[multiple] = false;
            }
            }
            
        }
    }


