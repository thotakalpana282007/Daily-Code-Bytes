import java.util.*;
//write a program for to find the maximum subarray that sum equal to exactly k
public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt(),start=0,sum=0,maxLen=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            while(sum>k)
            {
                sum-=arr[start];
                start++;
            }
            if(sum==k)
            maxLen=Math.max(maxLen,i-start+1);
        }
        System.out.println(maxLen);
    }
}
