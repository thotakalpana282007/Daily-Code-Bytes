import java.util.*;
class CountSpecialIntegers{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] nums=new int[n];
      for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for(List<Integer> list:map.values())
            {
                if(list.size()==3)
                {
                    int i1=list.get(0),i2=list.get(1),i3=list.get(2);
                    if(i2-i1==i3-i2)
                    count++;
                }
            }
        System.out.println(count);
    }
}
