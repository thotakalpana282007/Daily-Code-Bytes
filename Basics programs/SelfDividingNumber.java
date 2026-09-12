import java.util.*;
public class SelfDividingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left=sc.nextInt();
        int right=sc.nextInt();
        List<Integer> result=selfDividingNumbers(left,right);
        System.out.println(result);
        sc.close();
    }
    public static boolean isSelfDividing(int n)
    {
        int org=n;
        while(n>0){
            int r=n%10;
            if(r==0 || org%r !=0)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDividing(i))
            list.add(i);
        }
        return list;
    }
}
