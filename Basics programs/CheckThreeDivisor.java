import java.util.*;
class CheckThreeDivisor {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(isThree(n));
      sc.close();
    }
    public static boolean isThree(int n) {
        int count=0;
        int sqrt_n=(int)Math.sqrt(n);
        for(int i=1;i<=sqrt_n;i++)
        {
            if(n%i==0)
            {
                count++;
                if(i!=n/i)
                {
                    count++;
                }
            }
        }
        return count==3;
    }
}
