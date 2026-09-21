public class ValidAnagram{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    System.out.println(isAnagram(s,t));
  }
  public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(char ch:s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray())
        {
            if(!freq.containsKey(ch))
                return false;
            freq.put(ch,freq.get(ch)-1);
            if(freq.get(ch)==0)
                freq.remove(ch);
        }
        return freq.isEmpty();
    }
