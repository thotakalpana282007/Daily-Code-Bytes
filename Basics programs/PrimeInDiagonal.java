import java.util.Scanner;

class PrimeInDiagonal{
    public static int diagonalPrime(int[][] nums){
        int maxPrime=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i]))
                maxPrime=Math.max(maxPrime,nums[i][i]);
            if(isPrime(nums[i][nums.length-i-1]))
                maxPrime=Math.max(maxPrime,nums[i][nums.length-i-1]);
        }
        return maxPrime;
    }

    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[][] nums=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=sc.nextInt();
            }
        }

        System.out.println(diagonalPrime(nums));
        sc.close();
    }
}
