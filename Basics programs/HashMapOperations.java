import java.util.*;
public class HashMapOperations {
    public static void main(String[] args) {
        String names[]={"kalpana","Ravi","Kiran","John","Ravi","Kiran"};
        HashMap<String,Integer> map=new HashMap<>();
        int marks=10;
        for(String name:names)
        {
            map.put(name,marks);
            marks+=10;
        }
        System.out.println(map);

        System.out.println(map.get("Kiran"));

        if(map.containsKey("kalpana"))
        {
            System.out.println("Kalpana exists");
        }

        System.out.println(map.containsValue(4));

        map.put("Harshini",40);

        int marks_of_Harshini=map.remove("Harshini");
        System.out.println("marks_of_Harshini : "+marks_of_Harshini);
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        //Removes every thing in the map
        // map.clear();
        System.out.println(map.keySet());

        for(String key:map.keySet())
        {
            System.out.print(key+" ");
        }

        System.out.println("\n"+map.values());
        for(int value:map.values())
        {
            System.out.print(value+" ");
        }

        // entrySet() gives you all key-value pairs.An individual key-value pair is called an Entry.
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // This adds a value only if the key doesn't already exist.
        map.putIfAbsent("laasya",40);
        System.out.println(map);

        map.replace("kalpana",100);

        System.out.println(map);

        map.replaceAll((key,value)->value-5);

        map.put(null,30);
        map.put("Bhargavi",null);

        map.forEach((key,value)->System.out.println(key+"->"+value));
    }
}
