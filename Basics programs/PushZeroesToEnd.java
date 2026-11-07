import java.util.Scanner;
class PushZeroesToEnd
{
    static void pushZerosToEnd(int[] arr)
    {
        int count=0,temp;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        pushZerosToEnd(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
