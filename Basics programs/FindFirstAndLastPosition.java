import java.util.*;
class FindFirstAndLastPosition {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] nums=new int[n];
      for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
      int target=sc.nextInt();
        int first=findFirstIndex(nums,0,nums.length-1,target);
        int last=findLastIndex(nums,0,nums.length-1,target);
       System.out.println(first+" "+last);
    }
    public static int findFirstIndex(int[] nums,int l,int r,int target)
    {   
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                r=mid-1;
            }
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return ans;
    }
    public static int findLastIndex(int[] nums,int l,int r,int target)
    {
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return ans;
    }

}
