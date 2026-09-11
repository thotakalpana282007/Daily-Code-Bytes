import java.util.Scanner;
public class PerfectNumber{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(checkPerfectNumber(n));
    sc.close();
  }
  public static boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            s+=i;
        }
        return s==num;
    }
}
