import java.util.Scanner;
import java.util.ArrayDeque;
class ValidParenthesis {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(isValid(s));
      sc.close();
    }
    public static boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
                stack.push(')');
            else if(ch=='[')
                stack.push(']');
            else if(ch=='{')
                stack.push('}');
            else{
                if(stack.isEmpty() || ch!=stack.peek())
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
