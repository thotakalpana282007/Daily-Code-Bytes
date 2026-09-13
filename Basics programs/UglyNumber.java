import java.util.Scanner;
public class UglyNumber{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(isUglyNumber(n));
    sc.close();
  }
  public static boolean isUglyNumber(int n)
  { 
    if(n<=0)
      return false;
    while(n>1)
    {
      if(n%2==0)
      n/=2;
    else if(n%3==0)
      n/=3;
    else if(n%5==0)
      n/=5;
    else
      return false;
    }
   return true;
  }
