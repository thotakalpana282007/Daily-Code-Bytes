import java.util.*;
public class FindTheIndexOfTheFirstOccurrence{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    // using in built method indexOf() where it returns the first occurrence if it is not found it returns -1.
    // System.out.println(s1.indexOf(s2));

    //using manual searching
    System.out.println(findIndex(s1,s2));      
    sc.close();
  }
  public static int findIndex(String s1,String s2)
  {

    // i → chooses where to start checking in s1
    // j → checks each character of s2
    // i + j → gets the corresponding character in s1

    for(int i=0;i<=s1.length()-s2.length();i++)
      {
        int j=0;
        while(j<s2.length() && s1.charAt(i+j)==s2.charAt(j))
          {
            j++;
          }
        if(j==s2.length())
        {
          return i;
        }
      }
    return -1;
  }
}
