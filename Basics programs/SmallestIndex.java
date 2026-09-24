import java.util.*;
public class SmallestIndex{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++)
      {
        nums[i]=sc.nextInt();
      }
    System.out.println(findSmallestIndex(nums));
  }
  public static int findSmallestIndex(int[] nums)
  {
   for(int i=0;i<nums.length;i++)
        {
            int sod=sumOfDigits(nums[i]);
            if(i==sod)
                return i;
        }
        return -1;
  }
  public static int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
