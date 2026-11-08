import java.util.*;

class BinaryDigitScore{
public static int bitCount(int n){
int count=0;
while(n>0){
n&=(n-1);
count++;
}
return count;
}
  
public static int calculateScore(int a,int b){
int s1=bitCount(a);
int s2=bitCount(b);
if(s1>=s2)
return s1*s2;
return s2/s1;
}
  
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(calculateScore(a,b));
}
  
}
