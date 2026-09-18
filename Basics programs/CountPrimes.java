import java.util.Arrays;
import java.util.Scanner;

public class CountPrimes {

public static int countPrimes(int n) {
    if(n<=1)return 0;
    boolean[] primes=new boolean[n];
    Arrays.fill(primes,true);
    primes[0]=false;
    primes[1]=false;
    int sqrt_n=(int)Math.sqrt(n);
    for(int i=2;i<=sqrt_n;i++)
    {
        if(primes[i])
        {
            for(int j=i*i;j<n;j+=i)
                {
                    primes[j]=false;
                }
        }
    }
    int count=0;
    for(int i=2;i<n;i++)
    {
        if(primes[i])
        {
            count+=1;
        }
    }
    return count;
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter n: ");
    int n=sc.nextInt();

    int result=countPrimes(n);

    System.out.println("Number of primes less than "+n+" = "+result);

    sc.close();
}
}
