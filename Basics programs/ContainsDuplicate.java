import java.util.*;
class ContainsDuplicate {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(containsDuplicate(arr));
      sc.close();
    }
    public static boolean containsDuplicate(int[] nums) {
          Set<Integer> set=new HashSet<>();
          for(int i:nums)
          {
              if(!set.add(i))
              {
                  return true;
              }
          }
          return false;
    }
}
